SUMMARY = "PulseAudio Preferences"
DESCRIPTION = "PulseAudio Preferences (paprefs) is a simple GTK based configuration \
dialog for the PulseAudio sound server. \
 \
Please note that this program can only configure local servers, and \
requires that a special module module-gconf is loaded in the sound \
server."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "paprefs-1.2-2.8.aarch64.rpm"
RPM_HASH = "8a29e4ead789bcf9835d3e5a8cf06faf7822b534c25da67606360b924ee6ee7b00bb45c5f21c6d42550f8e950fab867b204c66fa234a5c17873ac355985fc7b7"

RPROVIDES:${PN} += "paprefs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtkmm-3.0.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
pulseaudio-module-gsettings"

inherit rpm
