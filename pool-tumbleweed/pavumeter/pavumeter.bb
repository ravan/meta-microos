SUMMARY = "PulseAudio Volume Meter"
DESCRIPTION = "PulseAudio Volume Meter (pavumeter) is a simple GTK volume meter for \
the PulseAudio sound server."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.3"

RPM_NAME = "pavumeter-0.9.3-197.11.aarch64.rpm"
RPM_HASH = "df99769c810c801bc8e4053bf8d78922dbd060174394d8f5f75a3df5df56c7c12b681360e964ae197356886b6e3e3a873b36fc8d4fa45fe46b71aea78132e123"

RPROVIDES:${PN} += "pavumeter"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdkmm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgtk-x11-2.0.so.0 \
libgtkmm-2.4.so.1 \
libm.so.6 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
