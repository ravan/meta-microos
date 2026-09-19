SUMMARY = "International Components for Unicode"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the runtime libraries for ICU."
LICENSE = "Unicode-3.0"

PV = "78.3"

RPM_NAME = "libicu78-78.3-1.3.aarch64.rpm"
RPM_HASH = "263a7cd68922eb5807f6902caa56808982191062ca01ba271187db138515b6ae0e75a88ab0fcd71fc8dfb360db2522ad3cc5066ccd31a190c79a436c30297fe1"

RPROVIDES:${PN} += "libicu \
libicu78 \
libicudata.so.78 \
libicui18n.so.78 \
libicuio.so.78 \
libicutest.so.78 \
libicutu.so.78 \
libicuuc.so.78"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicu78-ledata \
libm.so.6 \
libstdc++.so.6 \
timezone"

inherit rpm
