SUMMARY = "Libdnf plugin that allows loading Python plugins"
DESCRIPTION = "Libdnf plugin that allows loading Python plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "python3-libdnf5-python-plugins-loader-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "1bbc477e35f1d08614d6cba6c8d30c05b3731cf3001e19f63e9e5f1d6b1e8400e8b71a0ce55a0c1017c054fbfdff5b5c56c3c4506733f5871e08c097d83e3ac1"

RPROVIDES:${PN} += "config-python3-libdnf5-python-plugins-loader \
python3-libdnf5-python-plugins-loader"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python3-libdnf5"

inherit rpm
