SUMMARY = "Development files for the Enchant spell checking library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.19"

RPM_NAME = "enchant-devel-2.8.19-1.1.aarch64.rpm"
RPM_HASH = "6caa3c413d31b2dc1c3b9aaacd1aa7418e2fccbee9f8d49f96b4e4b905526c6c19f2e043d9c6f4672e9ffd33e336311ab7e1521da498c43090ca0cff9a76bd6e"

RPROVIDES:${PN} += "enchant-devel \
pkgconfig-enchant-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libenchant-2-2 \
libstdc++-devel \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0"

inherit rpm
