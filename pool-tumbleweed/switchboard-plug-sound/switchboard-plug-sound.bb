SUMMARY = "Sound plug for Switchboard"
DESCRIPTION = "This plug allow to set the audio and microphone volume and several \
sound-related settings."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.3"

RPM_NAME = "switchboard-plug-sound-8.0.3-1.2.aarch64.rpm"
RPM_HASH = "d3cacb44e8226a5f2dfad1abcec59620fa32cacf52c2069b259c9c65aec46f39ab7616def5c6427d547eee41222846d56592229dda96d85b5dcfe62b3b71bce3"

RPROVIDES:${PN} += "libio.elementary.settings.sound.so \
switchboard-plug-sound"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcanberra.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libswitchboard-3.so.0 \
switchboard"

inherit rpm
