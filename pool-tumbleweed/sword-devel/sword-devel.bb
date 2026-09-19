SUMMARY = "Include files and static libraries for developing sword applications"
DESCRIPTION = "Include files and static libraries for developing sword applications. This package \
is required to compile Sword frontends, too."
LICENSE = "Apache-2.0 & GPL-2.0-only"

PV = "1.9.0"

RPM_NAME = "sword-devel-1.9.0-2.1.aarch64.rpm"
RPM_HASH = "e58176b0d6920d4e3653b0bf88b6135bd0fd14241cad5d995a9cebf8c7397365ed958b8d5fe48c40219866aca3a0ba3bb140507fc3319ea9c18f98fc36814c28"

RPROVIDES:${PN} += "pkgconfig-sword \
sword-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsword-1-9-0 \
pkgconfig-libcurl"

inherit rpm
