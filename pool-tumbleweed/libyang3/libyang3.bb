SUMMARY = "IETF YANG data modeling parser toolkit runtime"
DESCRIPTION = "Libyang implements functions to process schemas expressed in the \
YANG data modeling language defined by the IETF in RFCs 6020/7950. \
Schemas expressed in this language primarily describe configuration \
used by larger network equipment like routers and switches. \
 \
In addition to handling the schemas itself, the library also provides \
functions to process data described by the schemas. \
 \
The library is implemented in C and provides an API for other software \
to use in processing configurations."
LICENSE = "BSD-3-Clause"

PV = "3.13.6"

RPM_NAME = "libyang3-3.13.6-3.3.aarch64.rpm"
RPM_HASH = "7d7b42aa6df82a4c3c9c8cc197f5d635edd8ab93d7e222ff21aace37f1287bab951877a119d48fdaaffd810bb483d86211db323484ff9ceddc2644efa3d74225"

RPROVIDES:${PN} += "libyang.so.3 \
libyang3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcre2-8.so.0"

inherit rpm
