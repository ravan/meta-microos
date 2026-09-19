SUMMARY = "Header files for the POSIX ACL library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libacl."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libacl-devel-2.4.0-1.2.aarch64.rpm"
RPM_HASH = "cb098d3850dbe779995a94675237c68e36252313476f64849ef4d16891d3f9fafaefb1f245de899513de1c5de601f9df7c6f355e1d69fd45661031e029510401"

RPROVIDES:${PN} += "acl-devel \
libacl-devel \
pkgconfig-libacl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libacl1"

inherit rpm
