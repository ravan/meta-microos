SUMMARY = "Library to parse ini files"
DESCRIPTION = "Libiniparser offers parsing of ini files from the C level."
LICENSE = "MIT"

PV = "4.2.6"

RPM_NAME = "libiniparser4-4.2.6-2.2.aarch64.rpm"
RPM_HASH = "94ef21ca6bcad0b06eb671ada1747d41f87a192a1e96f273e405cc43a8e71851ec597c213af1e871b33ff7b626945d1e51b4afb874ca012ea72af64ee9fae783"

RPROVIDES:${PN} += "libiniparser.so.4 \
libiniparser4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
