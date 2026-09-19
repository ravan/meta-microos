SUMMARY = "Headers for the libportal GTK4 integration library"
DESCRIPTION = "The libportal-gtk4-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "libportal-gtk4-devel-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "a7fa6aadfbc6b2ab9264a9dce693df23d38ea0e2a70cf767447147a33733cb9fc5c4003673785f537377f132045d0c2ae8a23c3b7789dce2ff43789008671010"

RPROVIDES:${PN} += "libportal-gtk4-devel \
pkgconfig-libportal-gtk4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-gtk4-1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gtk4 \
pkgconfig-libportal \
typelib-1-0-XdpGtk4-1-0"

inherit rpm
