SUMMARY = "PulseAudio Volume Control"
DESCRIPTION = "PulseAudio Volume Control (pavucontrol) is a simple GTK based volume \
control tool ('mixer') for the PulseAudio sound server. In contrast to \
classic mixer tools this one allows you to control both the volume of \
hardware devices and of each playback stream separately."
LICENSE = "GPL-2.0-or-later"

PV = "6.2"

RPM_NAME = "pavucontrol-6.2-1.3.aarch64.rpm"
RPM_HASH = "cad8e1dd85916d5664593544f99fe6774acff5d161805fecd6eb2d5368a8bc380069cd30cdbe3b5cec0f09bf27e8c64f619a2b7ea37b2f06dc0bf411d115df23"

RPROVIDES:${PN} += "pavucontrol"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcanberra.so.0 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtkmm-4.0.so.0 \
libjson-glib-1.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libsigc-3.0.so.0 \
libstdc++.so.6 \
pulseaudio-daemon"

inherit rpm
