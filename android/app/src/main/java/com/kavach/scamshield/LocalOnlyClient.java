package com.kavach.scamshield;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class LocalOnlyClient extends WebViewClient {
  @Override public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) { return true; }
  @Override public boolean shouldOverrideUrlLoading(WebView view, String url) { return true; }
}
