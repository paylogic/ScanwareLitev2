package com.paylogic.scanwarelite.dialogs.scan;

import android.content.Context;

import com.paylogic.scanwarelite.R;

public class BarcodeNotFoundDialog extends ScanAlertDialog {
	public BarcodeNotFoundDialog(final Context context, String barcode) {
		super(context, barcode, R.color.scanInvalid, getTitle(context),
				getMessage(context));
	}

	private static String getTitle(Context context) {
		return context.getString(R.string.tv_scan_dialog_title_invalid);
	}

	private static String getMessage(Context context) {
		return context.getString(R.string.tv_scan_dialog_msg_not_found);
	}
}
