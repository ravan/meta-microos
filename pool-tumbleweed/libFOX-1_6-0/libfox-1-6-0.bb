SUMMARY = "Shared libraries for the FOX toolkit 1.6"
DESCRIPTION = "This package contains the shared libraries needed \
by applications compiled with the FOX GUI Toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "libFOX-1_6-0-1.6.57-4.14.aarch64.rpm"
RPM_HASH = "6a0e73a13a8e80afcc1ce159aefb0587601bde4b2a69efd0a2a25cf2724a4a71840704045e9a5547170d9604de463c1486216b2256b4dddb1a610784a2b74d24"

RPROVIDES:${PN} += "fox \
libCHART-1.6.so.0 \
libFOX-1-6-0 \
libFOX-1.6.so.0 \
libfox1-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libbz2.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libmvec.so.1 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libz.so.1"

inherit rpm
