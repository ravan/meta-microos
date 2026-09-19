SUMMARY = "Development Environment for libdvdread"
DESCRIPTION = "This package contains the include-files and static libraries for \
libdvdread."
LICENSE = "GPL-2.0-or-later"

PV = "7.1.1"

RPM_NAME = "libdvdread-devel-7.1.1-1.1.aarch64.rpm"
RPM_HASH = "52aeac32e8c59fdf7b96c6a52241af15a4dd53180e71ac88d5a2401eb77dc05867a87894c4aea9172fd91b7f47d1de7a622b2bc20ceed011112829a06fb1e4cb"

RPROVIDES:${PN} += "libdvdread-devel \
pkgconfig-dvdread"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libdvdread8"

inherit rpm
