SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.4"

RPM_NAME = "postgresql14-postgis-utils-3.6.4-1.3.noarch.rpm"
RPM_HASH = "08a51d5ac8270fb0537f53612107e1774ec101647f4577b8018cafc87ad6d1df9902ffb2d679117d4a2aa1399abb5bcafb9b9fa99b8b224342960edfc9e284a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql14-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql14-postgis"

inherit rpm
