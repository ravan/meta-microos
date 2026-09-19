SUMMARY = "Development files for libnfs"
DESCRIPTION = "The libnfs-devel package contains libraries and header files for \
developing applications that use libnfs."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "6.0.2"

RPM_NAME = "libnfs-devel-6.0.2-1.3.aarch64.rpm"
RPM_HASH = "28a150c6e7ba90436467fa29496db83d6f6d8729904af380a31519c070f8fcf43e4bb565268b59c203a5adbcb64af77301628d1dfb6186317b479fc054219b0a"

RPROVIDES:${PN} += "libnfs-devel \
pkgconfig-libnfs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfs16"

inherit rpm
