SUMMARY = "GeoIP (MaxMindDB) support for syslog-ng"
DESCRIPTION = "This package provides GeoIP (MaxMindDB) modules providing support for \
logging geo-location information."
LICENSE = "GPL-2.0-only"

PV = "4.12.0"

RPM_NAME = "syslog-ng-geoip-4.12.0-1.4.aarch64.rpm"
RPM_HASH = "3462719f1de7a539f3cc779b7e17149d99555ece79e930c34787f5334990c03096fcfe10797a77149285910d9a3b948295b7f410486d8511fb791e54e932ddba"

RPROVIDES:${PN} += "syslog-ng-geoip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
libsyslog-ng-4.12.so.0 \
syslog-ng"

inherit rpm
