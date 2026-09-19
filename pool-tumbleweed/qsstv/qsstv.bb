SUMMARY = "Qt-based SSTV and HAMDRM"
DESCRIPTION = "QSSTV is a program for receiving and transmitting SSTV and HAMDRM (sometimes \
called DSSTV). It is compatible with most of MmSSTV and EasyPal"
LICENSE = "GPL-3.0-or-later"

PV = "9.5.8"

RPM_NAME = "qsstv-9.5.8-1.8.aarch64.rpm"
RPM_HASH = "e944d7b95571af7e2767442f85939da58208e4d4420504b20bb49059efebd7e835191f6ecc0288d82b7b3850fe27b617839255f998ba38c7b47609e9bcd4b9ba"

RPROVIDES:${PN} += "qsstv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libasound.so.2 \
libc.so.6 \
libfftw3.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libhamlib.so.4 \
libm.so.6 \
libopenjp2.so.7 \
libpulse-simple.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
libv4l2.so.0 \
libv4lconvert.so.0"

inherit rpm
