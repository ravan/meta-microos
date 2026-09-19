SUMMARY = "MaxMind GeoIP2 database support for Lighttp"
DESCRIPTION = "This module supports fast ip/location lookups using MaxMind \
GeoIP2 databases."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_maxminddb-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "6a76ff06aeda906c4d28882835b11a76caf5119100dbd63e7fa526ea64260b63067b3e33d1f0b0848319e8780104eb9c06d585c1a617559001e85f329d4507af"

RPROVIDES:${PN} += "lighttpd-mod-maxminddb"

RDEPENDS:${PN} += "libc.so.6 \
libmaxminddb.so.0 \
lighttpd"

inherit rpm
