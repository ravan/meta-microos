SUMMARY = "C++ logging library"
DESCRIPTION = "log4cplus is a simple to use C++ logging API providing thread-safe, \
flexible, and arbitrarily granular control over log management and \
configuration. It is modeled after the Java log4j API."
LICENSE = "Apache-2.0"

PV = "2.1.2"

RPM_NAME = "liblog4cplus-2_1-9-2.1.2-1.5.aarch64.rpm"
RPM_HASH = "d10304ff5b1c3109f09d5adcd296e3ff6db45d1e937c9ac2aee2e312d1a00ad349f0b10e78f0fcf82b6905f9e7ded321f8e31199503b48ab8ad863865508d9a1"

RPROVIDES:${PN} += "liblog4cplus-2-1-9 \
liblog4cplus-2.1.so.9 \
liblog4cplusU-2.1.so.9 \
log4cplus"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
