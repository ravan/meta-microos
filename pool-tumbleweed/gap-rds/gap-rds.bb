SUMMARY = "GAP: A package for searching relative difference sets"
DESCRIPTION = "RDS is a package for the search for relative difference set in \
(nonabelian) finite groups."
LICENSE = "GPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "gap-rds-1.10-1.1.noarch.rpm"
RPM_HASH = "3d0c3328bf22984df53afd9ffc913ae8139c493ec137e5557097d31fd90a19f67d7615c2f13a330c367933801d7e83a2c74b13ef7e8fd414a17496498c2d2eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-rds"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
gap-core \
gap-design"

inherit rpm
