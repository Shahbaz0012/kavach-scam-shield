package com.kavach.scamshield;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public final class MainActivity extends Activity {
  @SuppressLint("SetJavaScriptEnabled") @Override public void onCreate(Bundle state) {
    super.onCreate(state);
    WebView view = new WebView(this);
    WebSettings settings = view.getSettings();
    settings.setJavaScriptEnabled(true);
    settings.setDomStorageEnabled(false);
    settings.setAllowFileAccess(false);
    settings.setAllowContentAccess(false);
    settings.setMixedContentMode(WebSettings.MIXED_CONTENT_NEVER_ALLOW);
    view.setWebViewClient(new LocalOnlyClient());
    view.loadUrl("file:///android_asset/index.html");
    setContentView(view);
  }
}
