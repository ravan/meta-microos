SUMMARY = "Library that exports various synchronization primitives"
DESCRIPTION = "Library for C that exports various synchronization primitives"
LICENSE = "Apache-2.0"

PV = "1.29.2"

RPM_NAME = "libnsync1-1.29.2-1.4.aarch64.rpm"
RPM_HASH = "c59cdcd870ae765057d1bc34bfbbd36b41726aab18859774c7ae50108679d1d3aaaea123d920b6233e259e0fd5dfea5a310bdc89452f82671fda5e3113029f9d"

RPROVIDES:${PN} += "libnsync.so.1 \
libnsync1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
