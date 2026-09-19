SUMMARY = "Shared Libraries for ktoblzcheck"
DESCRIPTION = "This package contains shared Libraries for ktoblzcheck."
LICENSE = "LGPL-2.1-only"

PV = "1.59"

RPM_NAME = "libktoblzcheck1-1.59-1.5.aarch64.rpm"
RPM_HASH = "dd1dc9e000349a7126a555072094e272d7bed7721170f36cfa496bd354d248250319b1027f90d4657f7968de892718370247e590d05173a172a78da4058669f2"

RPROVIDES:${PN} += "libktoblzcheck.so.1 \
libktoblzcheck1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
