SUMMARY = "Development files for libmodulemd"
DESCRIPTION = "This package provides files for developing applications to use libmodulemd."
LICENSE = "MIT"

PV = "2.15.2"

RPM_NAME = "libmodulemd-devel-2.15.2-2.3.aarch64.rpm"
RPM_HASH = "cc149cfb038203e7ede12264a39314cd14a999ad02860418143a3ec5832ebd07e73699c2571cb32e001c514c2bc15973afe351c8218116ccaad25e653c6228c4"

RPROVIDES:${PN} += "libmodulemd-devel \
pkgconfig-modulemd-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmodulemd2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-rpm \
pkgconfig-yaml-0.1 \
typelib-1-0-Modulemd-2-0"

inherit rpm
