SUMMARY = "Shared library that belongs to gmic"
DESCRIPTION = "This shared library allows using gmic functionality from other \
programs."
LICENSE = "CECILL-2.1"

PV = "4.0.3"

RPM_NAME = "libgmic4-4.0.3-1.2.aarch64.rpm"
RPM_HASH = "47a430a5608dbe2e5bcfee583d638eb9fe4afdb9137cf87dd94346187d83d281fec6ecd75c9f68e16ff5777e2f28c88d3308ca030f96c5b21ce5ff804e7a9d4c"

RPROVIDES:${PN} += "libgmic.so.4 \
libgmic4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libImath-3-2.so.30 \
libOpenEXR-3-4.so.33 \
libX11.so.6 \
libc.so.6 \
libcurl.so.4 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
libz.so.1"

inherit rpm
