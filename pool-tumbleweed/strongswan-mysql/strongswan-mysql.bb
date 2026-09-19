SUMMARY = "MySQL plugin for strongSwan"
DESCRIPTION = "StrongSwan is an IPsec-based VPN solution for Linux. \
 \
This package provides the strongswan mysql plugin."
LICENSE = "GPL-2.0-or-later"

PV = "6.1.0"

RPM_NAME = "strongswan-mysql-6.1.0-1.1.aarch64.rpm"
RPM_HASH = "b5f0d041780128793923c776b07f9f7f9d6d209d0ee48452dafc4ba0ac79ea99e245eca79eafa2de1e27a57c75cdff93fa07887b1d1c63f5df6cb1c8ae0aae41"

RPROVIDES:${PN} += "config-strongswan-mysql \
libstrongswan-mysql.so \
strongswan-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3 \
strongswan"

inherit rpm
