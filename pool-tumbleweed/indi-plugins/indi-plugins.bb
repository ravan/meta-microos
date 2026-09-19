SUMMARY = "Plugins for libindi"
DESCRIPTION = "This package contains plugins for libindi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.2.4.2"

RPM_NAME = "indi-plugins-2.2.4.2-1.1.aarch64.rpm"
RPM_HASH = "335c53502ce3e2bd0a8352131cbced02496ad3de2c5589862bcf014e897d31b65e06462e2fd19fa6a9ac193942760e966fb59e8f8af98b26a1212b9093a1d027"

RPROVIDES:${PN} += "indi-plugins \
libindi-Nearest-MathPlugin.so \
libindi-SVD-MathPlugin.so \
libindi-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXISF.so.0 \
libc.so.6 \
libcfitsio.so.10 \
libcurl.so.4 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libindiAlignmentDriver.so.2 \
libindiclient.so.2 \
libindidriver.so.2 \
libjpeg.so.8 \
libm.so.6 \
libnova-0.15.so.0 \
libogg.so.0 \
libstdc++.so.6 \
libtheoradec.so.2 \
libtheoraenc.so.2 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
