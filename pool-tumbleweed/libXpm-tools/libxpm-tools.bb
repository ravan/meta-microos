SUMMARY = "Conversion utilities for X Pixmap (XPM) files"
DESCRIPTION = "The spxm tool converts XPM1/XPM2 files to XPM version 3. \
The cxpm tool will check whether an XPM file is correct or not with \
regard to its format."
LICENSE = "MIT"

PV = "3.5.18"

RPM_NAME = "libXpm-tools-3.5.18-2.3.aarch64.rpm"
RPM_HASH = "dd2c0e6785db7e3a9e0ebcc7e36fb9b68b5edf5f1cb0474425b2c578087ea118101cd8699f98bf3b72ce7675d5d45a813c78ee61e76af95602757dc71913abe4"

RPROVIDES:${PN} += "libXpm-tools \
xorg-x11-libXpm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
