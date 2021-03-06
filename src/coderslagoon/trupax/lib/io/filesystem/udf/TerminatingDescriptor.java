/*
Copyright 2010-2013 CODERSLAGOON

This file is part of TruPax.

TruPax is free software: you can redistribute it and/or modify it under the
terms of the GNU General Public License as published by the Free Software
Foundation, either version 3 of the License, or (at your option) any later
version.

TruPax is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with
TruPax. If not, see http://www.gnu.org/licenses/.
*/

package coderslagoon.trupax.lib.io.filesystem.udf;

import coderslagoon.baselib.util.BytePtr;

public class TerminatingDescriptor  extends Descriptor {
    public BytePtr reserved;
    
    public final static int RESV_LEN = 496;
    
    public TerminatingDescriptor(int location) {
        super(new Tag(Tag.Identifier.TERMINATING_DESCRIPTOR, location));
    }      

    protected TerminatingDescriptor(Tag tag, byte[] buf, int ofs) {
        super(tag);
        
        this.reserved = new BytePtr.Checked(buf, ofs, RESV_LEN);
    }
    
    public int write(byte[] block, int ofs) {
        int ofs0 = ofs;
        ofs += Tag.LENGTH;
        
        this.reserved.write(block, ofs); ofs += RESV_LEN;

        this.tag.write(block, ofs0, ofs - ofs0);
        
        return ofs;
    }
    
    public String toString() {
        return String.format("TD:tag=[%s]", this.tag); 
    }
}
