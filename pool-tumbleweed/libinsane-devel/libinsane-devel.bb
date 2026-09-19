SUMMARY = "Development files for libinsane"
DESCRIPTION = "Development libraries and header files for libinsane."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "libinsane-devel-1.0.10-1.14.aarch64.rpm"
RPM_HASH = "e040626c625db73b1ad88a706452fc543cc196a8a1c2534c90283e9cabeb16a4c48c343394ae2343e3c3cb06f88fcb5bd7f960c41408e45c5c0eaefa9cf2cec9"

RPROVIDES:${PN} += "libinsane-devel \
pkgconfig-libinsane"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinsane1 \
pkgconfig-sane-backends \
typelib-1-0-Libinsane-1-0"

inherit rpm
