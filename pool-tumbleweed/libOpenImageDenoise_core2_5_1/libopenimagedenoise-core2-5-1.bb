SUMMARY = "Shared library for Open Image Denoise library"
DESCRIPTION = "Intel Open Image Denoise is an open source library of high-performance, \
high-quality denoising filters for images rendered with ray tracing. \
 \
This package holds the core sub shared library."
LICENSE = "Apache-2.0"

PV = "2.5.1"

RPM_NAME = "libOpenImageDenoise_core2_5_1-2.5.1-1.1.aarch64.rpm"
RPM_HASH = "e1ace049a5b665e8c7f55ee858f4d325878f95b9808c1182b1eaaa634aef4ea821fbe1fa491f0a9ac0313cebc897f59999b0c2bc713bc78d798c8b7b13ed2410"

RPROVIDES:${PN} += "libOpenImageDenoise-core.so.2.5.1 \
libOpenImageDenoise-core2-5-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
