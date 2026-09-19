SUMMARY = "A cockpit module for (un)installing packages"
DESCRIPTION = "A cockpit module for (un)installing packages"
LICENSE = "LGPL-2.1-or-later"

PV = "5"

RPM_NAME = "cockpit-packages-5-1.1.noarch.rpm"
RPM_HASH = "d176d15ef3247f9802d4b62c083d9254cff77da591294ef2fd4c993c793840ada0cf4ca4d86f816249d1e737117e61a470ad5343a2591f556e16ed67311dbea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-packages"

RDEPENDS:${PN} += "PackageKit \
cockpit-bridge"

inherit rpm
