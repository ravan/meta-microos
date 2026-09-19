SUMMARY = "Development files for keybinder-3.0"
DESCRIPTION = "This package contains the development files for keybinder-3.0."
LICENSE = "MIT & X11"

PV = "0.3.2"

RPM_NAME = "keybinder-3.0-devel-0.3.2-1.36.aarch64.rpm"
RPM_HASH = "44c8957a5495daddb3a0bb30b88a8c80aaf5a79ef32b77a5a6fb0c7e18e5853ce0d57b0f9f881372ab845818b6713fc3cbf4e428d9191e792859c86883e75521"

RPROVIDES:${PN} += "keybinder-3.0-devel \
pkgconfig-keybinder-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkeybinder-3-0-0 \
pkgconfig \
pkgconfig-gtk+-3.0"

inherit rpm
