SUMMARY = "LADSPA Effects Rack for JACK"
DESCRIPTION = "JACK Rack is a stereo LADSPA effects rack for the JACK audio API.  You \
can insert LADSPA effects through JACK Rack. It uses GTK+ 2 for the \
GUI."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.0"

RPM_NAME = "jack-rack-1.5.0-1.8.aarch64.rpm"
RPM_HASH = "c9a803ae496addc7488d97ba8525f1103217088f7e743b24f617df6703c1c60ff8e4c13ffc1992976a25918fec5cda1fd054d5d9dc60e65912af2dfc6a08d8a2"

RPROVIDES:${PN} += "jack-rack"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
jack \
ladspa \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjack.so.0 \
libm.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
