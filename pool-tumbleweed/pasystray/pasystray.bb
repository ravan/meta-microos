SUMMARY = "PulseAudio system tray"
DESCRIPTION = "A replacement for the deprecated padevchooser \
 \
Pasystray allows setting the default PulseAudio source/sink and moving streams on the fly between sources/sinks without restarting the client applications."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "pasystray-0.8.2-2.4.aarch64.rpm"
RPM_HASH = "5d10c18d9694b2b9e42434414d84951052b41f05ddae94d480fab5ed614dbc0d4f54e346585d70d823b4a412ca1b6f1e652b87802e1f22dbeb89bc352bcc3cd5"

RPROVIDES:${PN} += "pasystray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
pulseaudio-daemon"

inherit rpm
