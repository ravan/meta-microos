SUMMARY = "Zypp plugin for checking if a reboot is needed"
DESCRIPTION = "This package contains a plugin for zypp that checks if a reboot is needed after \
package installation/update."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.13"

RPM_NAME = "zypp-boot-plugin-0.0.13-3.9.aarch64.rpm"
RPM_HASH = "207da63ac3c5ab86f71fb18e56a4b12173152e0b7fd803bdf4f65b06e0681f37cceef3d368e70aff0a3969fa33ec8f94fde15ed4c0cd3314ebd5f1e0480733de"

RPROVIDES:${PN} += "zypp-boot-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libeconf.so.0 \
libgcc-s.so.1 \
libjson-c.so.5 \
libstdc++.so.6 \
libzypp-plugin-commit"

inherit rpm
