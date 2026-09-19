SUMMARY = "Development package for libid3tag library"
DESCRIPTION = "This package contains the header files and static libraries needed to \
develop applications with libid3tag."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.3"

RPM_NAME = "libid3tag-devel-0.16.3-1.11.aarch64.rpm"
RPM_HASH = "bda0548e95d8eea0087a661f24e6610ad45265f762f12b68224278425616a97780bc798c13435283ccbfe415b22e2825da299b474ddab3a1fee00c77aa94f96b"

RPROVIDES:${PN} += "cmake-id3tag \
libid3tag-devel \
pkgconfig-id3tag"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libid3tag0"

inherit rpm
