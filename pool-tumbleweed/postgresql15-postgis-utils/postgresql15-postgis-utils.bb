SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.4"

RPM_NAME = "postgresql15-postgis-utils-3.6.4-1.3.noarch.rpm"
RPM_HASH = "631069da3685be3e80232e4e4f75aa4076ec8ad48d93c6edad6b798538867b77e41a9eff9493722f0cd85a149284b8e95237f0a5b1c5339095bc30ff4153d82b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql15-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql15-postgis"

inherit rpm
