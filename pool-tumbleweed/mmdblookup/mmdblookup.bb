SUMMARY = "An utility to look up an IP address in a MaxMind DB file"
DESCRIPTION = "The libmaxminddb library provides a C library for reading MaxMind DB \
files, including the GeoIP2 databases from MaxMind. This is a \
custom binary format designed to facilitate fast lookups of IP \
addresses while allowing for great flexibility in the type of \
data associated with an address. \
 \
This package contains the mmdblookup binary."
LICENSE = "Apache-2.0"

PV = "1.13.3"

RPM_NAME = "mmdblookup-1.13.3-1.4.aarch64.rpm"
RPM_HASH = "f2d347dcfb3b1a98dcac83dab620618451e8d0d784045f9d3460841decf5ea0c96b3ac909946c586420addd1eddc3a43099e4adc345e9c0bbcb936cadba6d0cf"

RPROVIDES:${PN} += "mmdblookup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0"

inherit rpm
