SUMMARY = "C library for the MaxMind DB file format"
DESCRIPTION = "The libmaxminddb library provides a C library for reading MaxMind DB \
files, including the GeoIP2 databases from MaxMind. This is a \
custom binary format designed to facilitate fast lookups of IP \
addresses while allowing for great flexibility in the type of \
data associated with an address."
LICENSE = "Apache-2.0"

PV = "1.13.3"

RPM_NAME = "libmaxminddb0-1.13.3-1.4.aarch64.rpm"
RPM_HASH = "18985370faf13e63758312967232e7fadd9e864018d6f54dd406e1286b42209207dbc1e28b167745bb23513f51c360c46c56d47226cb7326cfbc8c531ca2a3e7"

RPROVIDES:${PN} += "libmaxminddb.so.0 \
libmaxminddb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
