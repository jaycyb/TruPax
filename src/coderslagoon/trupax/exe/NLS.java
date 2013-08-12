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

package coderslagoon.trupax.exe;

public class NLS extends coderslagoon.baselib.util.NLS {
	static { coderslagoon.baselib.util.NLS.Reg.instance().register(NLS.class); }

	public static Str CMDLN_USAGE;
	public static Str CMDLN_DONE_1;
	public static Str CMDLN_VOLUME_CREATED_1;
	public static Str CMDLN_ERROREXIT_4;
	public static Str CMDLN_NODETAILS;
	public static Str CMDLN_FREESPACE_SET_1;
	public static Str CMDLN_NO_CONSOLE;
	public static Str CMDLN_VAGUE_OP;
	public static Str CMDLN_PASSWORD_PROMPT;
	public static Str CMDLN_PASSWORD_REPEAT;
	public static Str CMDLN_PASSWORD_MISMATCH;
	public static Str CMDLN_PASSWORD_EMPTY;
	public static Str CMDLN_PROGRESS_3;
	public static Str CMDLN_PROGRESS_FREESPACE;
	public static Str CMDLN_PROGRESS_WIPE_3;
	public static Str CMDLN_PROGRESS_EXTRACT_4;
	public static Str CMDLN_INVALIDATING;
	public static Str CMDLN_CONCERN_2;
	public static Str CMDLN_EXISTS_SELECT;
	public static Str CMDLN_REGSUM_3;
	public static Str CMDLN_RESOLVING;
	public static Str CMDLN_SEARCHING_1;
	public static Str CMDLN_VOL_SZ_1;
	public static Str CMDLN_ABOUT_2;
	public static Str GUI_BTN_ADDFILES;
	public static Str GUI_BTN_ADDFOLDER;
	public static Str GUI_BTN_CLEAR;
	public static Str GUI_BTN_MAKE;
	public static Str GUI_CMB_MERGE_NO;
	public static Str GUI_CMB_MERGE_YES;
	public static Str GUI_CMB_MERGE_YES_CS;
	public static Str GUI_CHK_WIPE;
	public static Str GUI_CHK_STOREFULLPATH;
	public static Str GUI_CHK_INCLUDESUBFOLDERS;
	public static Str GUI_DLG_ADDFILES;
	public static Str GUI_DLG_ADDFOLDER;
	public static Str GUI_DLG_ADDFOLDER_INFO_1;
	public static Str GUI_DLG_ADDFOLDER_INFO_GOSUB;
	public static Str GUI_DLG_EXTRACTFOLDER;
	public static Str GUI_DLG_EXTRACTFOLDER_INFO;
	public static Str GUI_DLG_VOLUME;
	public static Str GUI_DLG_EXTRACT;
	public static Str GUI_DLG_INVALIDATE;
	public static Str GUI_DLG_FILE_FILTER_TC;
	public static Str GUI_DLG_FILE_FILTER_ALL;
	public static Str GUI_LBL_FREESPACE;
	public static Str GUI_LBL_LABEL;
	public static Str GUI_MN_FILE;
	public static Str GUI_MN_FILE_ADDFILES;
	public static Str GUI_MN_FILE_ADDFOLDER;
	public static Str GUI_MN_FILE_WIPE;
	public static Str GUI_MN_FILE_EXTRACT;
	public static Str GUI_MN_FILE_INVALIDATE;
	public static Str GUI_MN_FILE_QUIT;
	public static Str GUI_MN_HELP;
	public static Str GUI_MN_HELP_ABOUT_1;
	public static Str GUI_MN_HELP_LANGUAGE;
    public static Str GUI_MN_HELP_DOCUMENTATION;
    public static Str GUI_MN_HELP_WEBSITE;
	public static Str GUI_MSGBOX_ERROR;
	public static Str GUI_MSGBOX_INVALID_OPTION;
	public static Str GUI_MSGBOX_ERROR_TEXT_3;
	public static Str GUI_MSGBOX_ERROR_TEXT_DETAILS_1;
	public static Str GUI_MSGBOX_HELP_1;
	public static Str GUI_MSGBOX_WIPE;
	public static Str GUI_MSGBOX_WIPE_TITLE;
	public static Str GUI_MSGBOX_EXTRACT_TITLE;
	public static Str GUI_MSGBOX_EXTRACT_ALL;
	public static Str GUI_MSGBOX_EXTRACT_OVERWRITE;
	public static Str GUI_MSGBOX_EXTRACT_SKIP;
	public static Str GUI_MSGBOX_EXTRACT_ABORT;
	public static Str GUI_MSGBOX_INVALIDATE_1;
	public static Str GUI_MSGBOX_INVALIDATE_TITLE;
	public static Str GUI_MSGBOX_INVALIDATE_YES;
	public static Str GUI_MSGBOX_INVALIDATE_YESDEL;
	public static Str GUI_MSGBOX_INVALIDATE_ABORT;
	public static Str GUI_MSGBOX_DROP;
	public static Str GUI_MSGBOX_DROP_TITLE;
	public static Str GUI_MSGBOX_DROP_EXTRACT;
	public static Str GUI_MSGBOX_DROP_INVALIDATE;
	public static Str GUI_MSGBOX_DROP_ADD;
	public static Str GUI_MSGBOX_PROPERTIES_LOADERROR;
	public static Str GUI_TC_FILE;
	public static Str GUI_TC_SIZE;
	public static Str GUI_TC_DATE;
	public static Str GUI_DATEFORMAT;
	public static Str GUI_PROPERR_INVALID_FREESPACE;
	public static Str GUI_UNKNOWN_VBYTES;
	public static Str GUI_VBYTES_2;
	public static Str GUI_INFO_WELCOME_1;
	public static Str GUI_INFO_SUMMARY_4;
	public static Str GUI_INFO_DONE_1;
	public static Str GUI_INFO_DONE_2;
	public static Str GUI_INFO_WIPED_ALL;
	public static Str GUI_INFO_WIPE_CONCERNS_1;
	public static Str GUI_PROGRESS_REGISTERING;
	public static Str GUI_PROGRESS_MAKING;
	public static Str GUI_PROGRESS_WIPING;
	public static Str GUI_PROGRESS_EXTRACTING;
	public static Str GUI_PROGRESS_INVALIDATING;
	public static Str GUI_PROGRESS_OPENING_1;
	public static Str GUI_PROGRESS_OBJECT_2;
	public static Str GUI_PROGRESS_FREESPACE;
	public static Str GUI_PROGRESS_INFO_1;
	public static Str GUI_PROGRESS_CONFIRM_CANCEL;
	public static Str GUI_DEBUG_ENABLED;
	public static Str GUI_DEBUG_DISABLED;
	public static Str GUI_TOOLTIP_OBJECTS;
	public static Str GUI_TOOLTIP_BTN_ADDFILES;
	public static Str GUI_TOOLTIP_BTN_ADDFOLDER;
	public static Str GUI_TOOLTIP_BTN_CLEAR;
	public static Str GUI_TOOLTIP_LBL_FREESPACE;
	public static Str GUI_TOOLTIP_LBL_LABEL;
	public static Str GUI_TOOLTIP_CHK_WIPE;
	public static Str GUI_TOOLTIP_BTN_MAKE;
	public static Str GUI_TOOLTIP_CHK_INCLUDESUBFOLDERS;
	public static Str GUI_TOOLTIP_CHK_STOREFULLPATH;
	public static Str GUI_TOOLTIP_CMB_MERGE;
	public static Str ABOUT_CAPTION_1;
	public static Str ABOUT_COPYRIGHT_1;
	public static Str ABOUT_INTRO;
	public static Str PROGRESS_CAPTION_2;
	public static Str PROGRESS_BTN_CANCEL;
	public static Str PROGRESS_MSGBOX_CONFIRM;
	public static Str PROGRESS_TOOLTIP_BTN_CANCEL;
	public static Str PASSWORD_BTN_CANCEL;
	public static Str PASSWORD_BTN_PROCEED;
	public static Str PASSWORD_CHK_SHOWPASSWORD;
	public static Str PASSWORD_CHK_CACHEPASSWORD;
	public static Str PASSWORD_CAPTION;
	public static Str PASSWORD_INFO;
	public static Str PASSWORD_INFO2;
	public static Str PASSWORD_TOOLTIP_TXT_PASSWORD;
	public static Str PASSWORD_TOOLTIP_BTN_PROCEED;
	public static Str PASSWORD_TOOLTIP_CHK_SHOWPASSWORD;
	public static Str PASSWORD_TOOLTIP_CHK_CACHEPASSWORD;
}