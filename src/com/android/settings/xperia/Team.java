package com.android.settings.xperia;
import android.content.ContentResolver;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceScreen;
import android.provider.Settings;
import android.widget.Toast;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class Team extends SettingsPreferenceFragment implements
Preference.OnPreferenceChangeListener {
private static final String TAG = "GenesisTeam";
Preference mEvild;
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
ContentResolver resolver = getActivity().getContentResolver();
// Load the preferences from an XML resource
addPreferencesFromResource(R.xml.genesisteam);
PreferenceScreen prefSet = getPreferenceScreen();
mEvild = prefSet.findPreference("genesis_evild");
}
@Override
public void onResume() {
super.onResume();
}
@Override
public void onDestroy() {
super.onDestroy();
}
@Override
public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
ContentResolver resolver = getActivity().getContentResolver();
boolean value;
if (preference == mEvild) {
Toast.makeText(getActivity(), "Owner Of Xperia Genesis, Creating all new Xperia Feeling!!!",
Toast.LENGTH_LONG).show();
}else {
return super.onPreferenceTreeClick(preferenceScreen, preference);
}
return true;
}
@Override
public boolean onPreferenceChange(Preference preference, Object objValue) {
ContentResolver resolver = getActivity().getContentResolver();
final String key = preference.getKey();
return true;
}
}
