package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import java.utils.Locale;

public class UprasingModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public UprasingModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "Uprasing";
    }

    @Override
  public Map<String, Object> getConstants() {
    final Map<String, Object> constants = new HashMap<>();
    constants.put("Language", Locale.getDefault().getLanguage());    
    return constants;
  }
}
