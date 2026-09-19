SUMMARY = "Shared library that belongs to gmic"
DESCRIPTION = "This shared library allows using gmic functionality from other \
programs."
LICENSE = "CECILL-2.1"

PV = "4.0.3"

RPM_NAME = "libcgmic4-4.0.3-1.2.aarch64.rpm"
RPM_HASH = "0f396a47303d23546c37cd11f1d707b9944ccd9db179d4b72dc12f8fcb895092734a1695bc1cf836231e236840203a6831558f4106376a725a11d8685741fae2"

RPROVIDES:${PN} += "libcgmic.so.4 \
libcgmic4"

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
