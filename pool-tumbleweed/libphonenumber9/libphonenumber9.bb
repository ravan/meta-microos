SUMMARY = "Library for parsing, formatting, and validating international phone numbers"
DESCRIPTION = "Google's common Java, C++ and JavaScript library for parsing, formatting, \
and validating international phone numbers. The Java version is optimized \
for running on smartphones, and is used by the Android framework since 4.0 \
(Ice Cream Sandwich)."
LICENSE = "Apache-2.0"

PV = "9.0.38"

RPM_NAME = "libphonenumber9-9.0.38-1.2.aarch64.rpm"
RPM_HASH = "b9bb9708a36bea580644e2353fd934bff87232ff0eb0800353832e52d17665126375fd3a2f1a0f9d5b0041e5571b0d604feeddb474c280f9e90adf12b0a2d381"

RPROVIDES:${PN} += "libphonenumber.so.9 \
libphonenumber9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libprotobuf.so.36.1.0 \
libstdc++.so.6"

inherit rpm
