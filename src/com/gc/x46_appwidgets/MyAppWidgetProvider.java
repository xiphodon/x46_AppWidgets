package com.gc.x46_appwidgets;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;

public class MyAppWidgetProvider extends AppWidgetProvider {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub

	}

	/**
	 * ÿ�����µ�����С�ؼ����ɵ�ʱ�򶼻����
	 */
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		// TODO Auto-generated method stub
		super.onUpdate(context, appWidgetManager, appWidgetIds);
		System.out.println("onUpdate");
	}

	/**
	 * ÿ��ɾ������С�ؼ���ʱ�򶼻���õķ���
	 */
	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		// TODO Auto-generated method stub
		super.onDeleted(context, appWidgetIds);
		System.out.println("onDeleted");
	}

	/**
	 * ��һ�δ�����ʱ��Ż���õ�ǰ���������ڵķ���
	 */
	@Override
	public void onEnabled(Context context) {
		// TODO Auto-generated method stub
		super.onEnabled(context);
		System.out.println("onEnabled");
	}

	/**
	 * �������������е�����С�ؼ���ɾ����ʱ��ŵ��õ�ǰ�������
	 */
	@Override
	public void onDisabled(Context context) {
		// TODO Auto-generated method stub
		super.onDisabled(context);
		System.out.println("onDisabled");
	}

}
