SUMMARY = "FreeTDS standalone driver with classic API"
DESCRIPTION = "db-lib is the oldest and simplest API, and the only API supported by \
both vendors, which has some relevance when porting applications that \
use the vendors' libraries. db-lib was the first API implemented by \
FreeTDS, and is still the best one supported. Anything that can be \
done in FreeTDS can be done through db-lib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.27"

RPM_NAME = "libsybdb5-1.4.27-2.1.aarch64.rpm"
RPM_HASH = "5e480a661436422daa14cfdf55629fb88925c9923bf7772c6af6a63fcffd8be0b9055a6429c747b5e1f8e312d4e7981e168c865ef165416c13c3cbbefc1db2bc"

RPROVIDES:${PN} += "libsybdb.so.5 \
libsybdb5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libhogweed.so.6 \
libnettle.so.8"

inherit rpm
