SUMMARY = "Development files for dconf, a key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.49.0"

RPM_NAME = "dconf-devel-0.49.0-1.5.aarch64.rpm"
RPM_HASH = "f0d63215087d86c911b861f82ea9b0f402c77a9cfb194507597908a78b6d01fd61fb94d3867fd671fb0ca9488cfa3eb9aadb1c4dc14f73354b79bf8917cb793c"

RPROVIDES:${PN} += "dconf-devel \
pkgconfig-dconf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdconf1 \
pkgconfig-gio-2.0"

inherit rpm
