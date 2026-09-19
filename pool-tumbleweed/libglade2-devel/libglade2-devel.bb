SUMMARY = "Include files and libraries mandatory for development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and link applications that use libglade2."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.4"

RPM_NAME = "libglade2-devel-2.6.4-30.11.aarch64.rpm"
RPM_HASH = "5b6c911e3d758ae78ab824a86f691a061d942cbebcb0dfecd669497abb05c6e8d28ef68d3da61bb635468336379d9a99c8f820c11a9fc11bfc05b3f81c1c48eb"

RPROVIDES:${PN} += "libglade2-devel \
pkgconfig-libglade-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
libglade-2-0-0 \
pkgconfig-gtk+-2.0 \
pkgconfig-libxml-2.0"

inherit rpm
