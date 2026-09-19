SUMMARY = "VPD Database access library for lsvpd"
DESCRIPTION = "The libvpd-devel package contains development libraries and header \
files that are used to access a vpd database created by vpdupdate in \
the lsvpd package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.11"

RPM_NAME = "libvpd-devel-2.2.11-1.4.aarch64.rpm"
RPM_HASH = "014bee9c3be66f47e6fc8b10077425075e99fbfa837ab696c6d9252d6b68e433c9765a965ea32e3c3687474754314fafde8412b1b60113ddd023df39f7e61932"

RPROVIDES:${PN} += "libvpd-devel \
pkgconfig-libvpd-2 \
pkgconfig-libvpd-cxx-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvpd-2-2-3 \
pkgconfig-sqlite3"

inherit rpm
