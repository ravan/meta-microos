SUMMARY = "Multi-format Image Decoder Library"
DESCRIPTION = "FreeImage is a library for developers who would like to support \
graphics image formats like PNG, BMP, JPEG, TIFF and others as needed \
by today's multimedia applications."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.18.0.1909"

RPM_NAME = "libfreeimage3-3.18.0.1909-2.17.aarch64.rpm"
RPM_HASH = "7e921d28f881dae2e606231d39e484e0134a2c04dba752f7b2d22cef0fe588c3fb2fac98d73fad9da277c12bd75a2a92b94af6a9d4b1c1ecc4f15dd9109def79"

RPROVIDES:${PN} += "libfreeimage.so.3 \
libfreeimage3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libImath-3-2.so.30 \
libOpenEXR-3-4.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libjxrglue.so.0 \
libopenjp2.so.7 \
libpng16.so.16 \
libraw.so.25 \
libstdc++.so.6 \
libwebp.so.7 \
libwebpmux.so.3 \
libz.so.1"

inherit rpm
