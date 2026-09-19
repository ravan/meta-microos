SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types - osh support"
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "3.0.4"

RPM_NAME = "libgensioosh14-3.0.4-1.1.aarch64.rpm"
RPM_HASH = "3b2edd93b0194a4cf9caa6a4e135f3eeedd26e86ad97eb110d206909394a7268abfd8997723218ea0c253a328f8a233db2781718c2169ee4289ee8a412f3f272"

RPROVIDES:${PN} += "libgensioosh.so.14 \
libgensioosh14 \
libgensiooshcpp.so.14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsctp.so.1 \
libstdc++.so.6"

inherit rpm
