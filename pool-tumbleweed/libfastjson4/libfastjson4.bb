SUMMARY = "JSON parsing library"
DESCRIPTION = "A JSON parsing library, a fork of json-c, developed by the rsyslog team \
and used for rsyslog and liblognorm. \
 \
This package includes the libfastjson library."
LICENSE = "MIT"

PV = "1.2609.0"

RPM_NAME = "libfastjson4-1.2609.0-1.1.aarch64.rpm"
RPM_HASH = "c7c79e589eff9445982d2914096ab45bef16a97739240ecbf33bf2eaafd349e8d126dde05488efa168f81cba88f09a7db4a8083d9cd9b5cab3f4d8e5cbb4bef4"

RPROVIDES:${PN} += "libfastjson.so.4 \
libfastjson4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
