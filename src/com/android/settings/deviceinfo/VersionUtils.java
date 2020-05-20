
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getLLuviaVersion(){
        return SystemProperties.get("org.lluvia.version.display","");
    }
}
