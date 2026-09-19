SUMMARY = "Development files for libedit"
DESCRIPTION = "libedit is a command line editing and history library. It is designed \
to be used by interactive programs that allow the user to type commands \
at a terminal prompt. \
 \
This package holds the development files for libedit."
LICENSE = "BSD-3-Clause"

PV = "20250104.3.1"

RPM_NAME = "libedit-devel-20250104.3.1-1.5.aarch64.rpm"
RPM_HASH = "9b069e9d2da6ecc9ae363872e847c0d28cc3f40f03b0e9349c9b318039c21ef60828cad1f63c8af2969238ad6d18d6d2bd85036637b6564a6e6c5f98e674644b"

RPROVIDES:${PN} += "libedit-devel \
libedit0-devel \
pkgconfig-libedit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libedit0"

inherit rpm
