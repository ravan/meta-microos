SUMMARY = "The core components of R"
DESCRIPTION = "This package provides the core of R, i.e. all that is in base."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-core-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "1bb8bf98822974a1766f19567cf49a4df0f0af5758d89adbde2d0908fc6ec4c4f4817eba4599f0e35b50ba5957f255d3d58bcddc614d783c4daddcb6163b9542"

RPROVIDES:${PN} += "R-core"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libR.so \
libRlapack.so \
libX11.so.6 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
