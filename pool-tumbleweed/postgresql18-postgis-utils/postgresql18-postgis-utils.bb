SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.4"

RPM_NAME = "postgresql18-postgis-utils-3.6.4-1.3.noarch.rpm"
RPM_HASH = "717757c7162378d16bb869508f9089a718d4fc9d3e491fad0857bd147c4bfe5ab23ac2c494318a4dd6c2daf5f128d10f3317c2e816e8105f9d703a385e9a7519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql18-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql18-postgis"

inherit rpm
