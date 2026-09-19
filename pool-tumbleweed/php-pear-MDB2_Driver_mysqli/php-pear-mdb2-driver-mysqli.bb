SUMMARY = "MySQLi MDB2 driver"
DESCRIPTION = "This is the MySQLi MDB2 driver."
LICENSE = "BSD-3-Clause"

PV = "1.5.0b4"

RPM_NAME = "php-pear-MDB2_Driver_mysqli-1.5.0b4-1.19.noarch.rpm"
RPM_HASH = "3253ca9424cdfc39fba4e59542733714e054897dc380b1cd37fc3615dfe5e6a28af44eb9d44e220754d4395877c8a7e0f90d1d1f88b55c0d37beab8df72c1d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear-MDB2-Driver-mysqli \
php5-pear-MDB2-Driver-mysqli \
php7-pear-MDB2-Driver-mysqli"

RDEPENDS:${PN} += "/usr/bin/sh \
php-mysql \
php-pear \
php-pear-MDB2"

inherit rpm
