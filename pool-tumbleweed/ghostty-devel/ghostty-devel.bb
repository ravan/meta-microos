SUMMARY = "Development files for for ghostty's VT library"
DESCRIPTION = "This package contains all necessary include files and libraries needed to develop applications \
that need to embed a fast, feature-rich terminal emulator"
LICENSE = "MIT & OFL-1.1"

PV = "1.3.1"

RPM_NAME = "ghostty-devel-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "c95f68baa6cf4937405b2c6e746bbe085f5f06ed3fb96787fa5ec874f04c84a340cf0d84d81c83b18beefa7dc6e9a167ad94e741a1e5098519b6d6bf98107b10"

RPROVIDES:${PN} += "ghostty-devel \
pkgconfig-libghostty-vt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libghostty-vt0"

inherit rpm
