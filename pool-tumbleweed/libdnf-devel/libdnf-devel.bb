SUMMARY = "Development files for libdnf"
DESCRIPTION = "This package provides the headers and libraries for developing applications \
that use libdnf."
LICENSE = "LGPL-2.1-or-later"

PV = "0.75.0"

RPM_NAME = "libdnf-devel-0.75.0-1.3.aarch64.rpm"
RPM_HASH = "be0fd82a651c38ea035a47c3560ab59dc9972097507f98c16607f4a43797624541714dab43419ed8a5882e0498ae1689192570495d49b9d572152b51b98acd31"

RPROVIDES:${PN} += "libdnf-devel \
pkgconfig-libdnf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdnf2 \
pkgconfig-glib-2.0 \
pkgconfig-librepo \
pkgconfig-libsolv \
pkgconfig-libsolvext \
pkgconfig-rpm \
pkgconfig-sqlite3"

inherit rpm
