SUMMARY = "Portable NaCl-based crypto library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libsodium."
LICENSE = "ISC"

PV = "1.0.22"

RPM_NAME = "libsodium-devel-1.0.22-1.3.aarch64.rpm"
RPM_HASH = "02302d53ce2b5163743c040af28bdd57fe640eaefad0dbc2e023566c3341151a9ca6dc585f04febc882cfe569e471576bd692bf9b53ff0eac9ba20ff9981e290"

RPROVIDES:${PN} += "libsodium-devel \
pkgconfig-libsodium"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsodium26"

inherit rpm
