SUMMARY = "Development files for Singular's 'Singular' library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.4.1"

RPM_NAME = "libSingular-devel-4.4.1-2.9.aarch64.rpm"
RPM_HASH = "1431ee79c05c63bdc1a4a83d9dc62e916b8cc1a76c067aa2f2f86d88a0ff22e26ef625f31b2ea096343119d15d9dbd6e6a92df147b4b847a65ac0b37ce0c1e80"

RPROVIDES:${PN} += "libSingular-devel \
pkgconfig-Singular"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSingular-4-4-1 \
mpfr-devel \
pkgconfig-factory \
pkgconfig-libpolys \
pkgconfig-omalloc \
pkgconfig-singular-resources"

inherit rpm
