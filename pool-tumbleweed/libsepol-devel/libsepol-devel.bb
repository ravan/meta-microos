SUMMARY = "Development files for SELinux's binary policy manipulation library"
DESCRIPTION = "The libsepol-devel package contains the libraries and header files \
needed for developing applications that manipulate binary SELinux \
policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.11"

RPM_NAME = "libsepol-devel-3.11-1.2.aarch64.rpm"
RPM_HASH = "64736dd657408bc8d8c77cf31827933f8d587df96b8a561469ef1630586a814ff9729fd43e83a04fbeae7836da016890a31033acf3bb9e4fb1cece7044626123"

RPROVIDES:${PN} += "libsepol-devel \
pkgconfig-libsepol"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsepol2"

inherit rpm
