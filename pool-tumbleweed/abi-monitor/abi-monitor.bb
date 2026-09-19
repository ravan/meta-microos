SUMMARY = "A tool to monitor and build new versions of a software library"
DESCRIPTION = "Monitor new versions of a software library, try to build them \
and create profiles for abi-tracker"
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.12"

RPM_NAME = "abi-monitor-1.12-2.18.noarch.rpm"
RPM_HASH = "3adf830f5316c87b712e39aa144e40717a8f5a42011575a6d272af4ef38cc41f315f966b112bda70ebd405c70113a997450a1c2c19f2a98d79c725f3f4b9f3dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "abi-monitor"

RDEPENDS:${PN} += "/usr/bin/perl \
curl \
perl-base \
wget"

inherit rpm
