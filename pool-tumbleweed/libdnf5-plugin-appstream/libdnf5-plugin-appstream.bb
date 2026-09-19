SUMMARY = "Libdnf5 plugin to install repo AppStream data"
DESCRIPTION = "Libdnf5 plugin that installs repository's AppStream data, for repositories which provide them."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "libdnf5-plugin-appstream-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "1f7252201d47a22e0777d25d07e1e78007b724646c70a5f7fef7e89464eb5a64720b539ab5bb2ae435a033e1b80bbc857249b0af930f965da670b1e0e015ebb6"

RPROVIDES:${PN} += "config-libdnf5-plugin-appstream \
libdnf5-plugin-appstream"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libappstream.so.5 \
libc.so.6 \
libdnf5-2 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6"

inherit rpm
