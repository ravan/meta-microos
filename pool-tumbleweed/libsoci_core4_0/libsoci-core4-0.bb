SUMMARY = "The C++ Database Access Library"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_core4_0-4.0.2-5.10.aarch64.rpm"
RPM_HASH = "63121bc2cfe69522126729135f22337e7eeb8283fc58faea6131f9e31989027194e38f0966c6a5d4047c963a15aa9eaf200872d2285cbf6bdde8656240b6ad26"

RPROVIDES:${PN} += "libsoci-core.so.4.0 \
libsoci-core4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsoci4-0-backend \
libstdc++.so.6"

inherit rpm
