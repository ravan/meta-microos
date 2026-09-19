SUMMARY = "IDO MySQL database backend for Icinga 2"
DESCRIPTION = "Icinga 2 IDO mysql database backend. Compatible with Icinga 1.x \
IDOUtils schema >= 1.12"
LICENSE = "GPL-3.0-or-later"

PV = "2.16.5"

RPM_NAME = "icinga2-ido-mysql-2.16.5-1.2.aarch64.rpm"
RPM_HASH = "a9d974eabd7362e600485e40c0302e24dd8bd357480157266c1a23be6c9e66a88bde578231b0c9839674cdcb682dec71bc504c40436a0dccc8f499ddfb45c1f9"

RPROVIDES:${PN} += "config-icinga2-ido-mysql \
icinga2-ido-mysql \
libmysql-shim.so.2.16.5"

RDEPENDS:${PN} += "/usr/bin/sh \
group-icinga \
icinga2-bin \
libmariadb.so.3 \
libstdc++.so.6 \
user-icinga"

inherit rpm
