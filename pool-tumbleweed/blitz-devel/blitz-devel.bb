SUMMARY = "Libraries, includes, etc. used to develop an application with blitz"
DESCRIPTION = "Blitz++ is a C++ template class library that provides high-performance \
multidimensional array containers for scientific computing. \
 \
This package provides the header files and libraries needed to develop a blitz \
application."
LICENSE = "LGPL-3.0-or-later | BSD-3-Clause | Artistic-2.0"

PV = "1.0.2"

RPM_NAME = "blitz-devel-1.0.2-2.25.aarch64.rpm"
RPM_HASH = "ca94235b4142981cc9d738e9ecdf2bf4e6fb03cf1d924c549de62838ce5c5584b7b31224d7079e0781dbe1731326c572b0769e3c29df336d720954a57361e0bb"

RPROVIDES:${PN} += "blitz-devel \
pkgconfig-blitz"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libblitz0"

inherit rpm
