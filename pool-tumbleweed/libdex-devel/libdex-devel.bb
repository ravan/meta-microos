SUMMARY = "Development files for libdex"
DESCRIPTION = "This package contains the libraries and header files that are \
needed for writing applications with libdex."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libdex-devel-1.1.0-1.4.aarch64.rpm"
RPM_HASH = "6362e743672c5b88b47f7474707b500b05b06c6fcf992e2cbfb42ed612e363967322c5e183ea6dc061f67924e2aa034ad80b6b77792982b3e1d54d2e70b934d1"

RPROVIDES:${PN} += "libdex-devel \
pkgconfig-libdex-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdex-1-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-liburing \
python-abi \
typelib-1-0-Dex-1-0 \
typelib-Dex \
typelib-GLib"

inherit rpm
