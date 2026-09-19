SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.4"

RPM_NAME = "postgresql16-postgis-utils-3.6.4-1.3.noarch.rpm"
RPM_HASH = "c3d3f99dbeb9a57697a4d551fbead19f940312b623831e0e75a9090ee1eaed927c202bb15bd8785eab8f8e2fae875d5bbf9a21e162e186ffa081b02e6aa7f05a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql16-postgis-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-DBD-Pg \
postgresql16-postgis"

inherit rpm
