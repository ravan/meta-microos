SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.4"

RPM_NAME = "postgresql17-postgis-utils-3.6.4-1.3.noarch.rpm"
RPM_HASH = "36650182545c27967a2ae2c5227e8f5cbce91b3d6c9d1473e00ee00681159e00f0f3ff60a22376295412bd8b3ea1e82eea47741e550f15c9e010592b92473762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql17-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql17-postgis"

inherit rpm
