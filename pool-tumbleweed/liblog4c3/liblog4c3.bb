SUMMARY = "A library of C for flexible logging to files, syslog and other destinations"
DESCRIPTION = "Log4c is a library of C for flexible logging to files, syslog and other \
destinations. It is modeled after the Log for Java library \
(http://jakarta.apache.org/log4j/), staying as close to their API as is \
reasonable."
LICENSE = "LGPL-2.1+"

PV = "1.2.4"

RPM_NAME = "liblog4c3-1.2.4-5.38.aarch64.rpm"
RPM_HASH = "4a2581f2991d053640619068e687d0d8659df5cc483c167a9f33a4bb114d9187b8ccbc995170ba513ee55d09d6f0ce2ce4a9b675872f6195f5c2c22ed1680a52"

RPROVIDES:${PN} += "liblog4c.so.3 \
liblog4c3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
