SUMMARY = "Libdnf plugin that allows to run actions (external executables) on hooks"
DESCRIPTION = "Libdnf plugin that allows to run actions (external executables) on hooks."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "libdnf5-plugin-actions-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "3746f65667ab842ef734d543e6bfd6ae7cba9ab639d0f8ecb37dfd12cf5764c5a6ae900d28df32d9da681c2b50cd740f2ae316edb2a3c61dd43af94a1e207fd7"

RPROVIDES:${PN} += "config-libdnf5-plugin-actions \
libdnf5-plugin-actions"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libjson-c.so.5 \
libstdc++.so.6"

inherit rpm
