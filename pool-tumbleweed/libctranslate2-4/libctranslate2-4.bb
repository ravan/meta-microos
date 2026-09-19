SUMMARY = "The ctranslate2 library"
DESCRIPTION = "The ctranslate2 library"
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "libctranslate2-4-4.6.0-2.5.aarch64.rpm"
RPM_HASH = "2f2d6f9bb3a06aca2985501f0c3c2864442fcb57d557f95404eb941910f24bcdf43b4c0cd088b230961f9f4ba9520546ba1924a1d1c8fd7c997ef032e9b98d3a"

RPROVIDES:${PN} += "libctranslate2-4 \
libctranslate2.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6"

inherit rpm
