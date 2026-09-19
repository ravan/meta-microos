SUMMARY = "Mixer library for MATE Desktop"
DESCRIPTION = "libmatemixer is a mixer library for MATE desktop. \
 \
It provides an abstract API allowing access to mixer functionality \
available in the PulseAudio, ALSA and OSS sound systems."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "libmatemixer0-1.28.0-1.10.aarch64.rpm"
RPM_HASH = "e28bb1f9ea23bc4dc9270e6720976e1b56dc6238cdf990280f1a18d489fbae525400f1b53263ebb5bf4bbbd3d409ca437315820ca018f2ee44657508bf180cf2"

RPROVIDES:${PN} += "libmatemixer \
libmatemixer-alsa.so \
libmatemixer-null.so \
libmatemixer-pulse.so \
libmatemixer.so.0 \
libmatemixer0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0"

inherit rpm
