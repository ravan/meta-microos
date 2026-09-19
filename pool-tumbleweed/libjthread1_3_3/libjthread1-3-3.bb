SUMMARY = "A thread wrapper library"
DESCRIPTION = "The JThread package provides some classes to make use of threads on \
different platforms. The classes are actually wrappers around \
existing thread implementations."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "libjthread1_3_3-1.3.3-1.29.aarch64.rpm"
RPM_HASH = "80f64f29b68c3e3df8d9fd9f08b2af243478ae13a461497e56b452fae3baa23bb7d2dfa2a8484ef1d9d0584fe27d3879ce82fe15c139376da6a39d7ea7f4e920"

RPROVIDES:${PN} += "libjthread.so.1.3.3 \
libjthread1-3-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
