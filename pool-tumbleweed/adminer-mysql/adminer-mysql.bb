SUMMARY = "Dependencies required for Adminer MySQL support"
DESCRIPTION = "Virtual package that requires dependencies needed for Adminer MySQL support"
LICENSE = "GPL-2.0-only | Apache-2.0"

PV = "4.8.1"

RPM_NAME = "adminer-mysql-4.8.1-1.13.noarch.rpm"
RPM_HASH = "6a22fb2e9a16b19a98236dde1659baa53749914bf3071353dd8851015a8ce77dfd9e710e1ea3ee61d68b5dc9480c3383df8a46d1e0d533852f527f9c7f5863b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adminer-database-support \
adminer-mysql"

RDEPENDS:${PN} += "adminer \
php-mysql"

inherit rpm
