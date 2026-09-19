SUMMARY = "Development files for AllegroGL"
DESCRIPTION = "This package is needed to build programs that use AllegroGL."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liballeggl44-devel-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "49d0fe1bb6fb4449cfcee0dfaa2206853ed301c5d8824da638ea32921295581fc40308969613bd415400e8f4bd56841266e06e5bdd9a4ace5b466706723eb130"

RPROVIDES:${PN} += "liballeggl44-devel \
pkgconfig-allegrogl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballeggl4-4 \
pkgconfig-allegro"

inherit rpm
