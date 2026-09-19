SUMMARY = "Library for MAPI data types"
DESCRIPTION = "A library for accessing the Exchange MAPI database format \
 \
libmapidb is part of the libyal library collection"
LICENSE = "LGPL-3.0-or-later"

PV = "20240420"

RPM_NAME = "libmapidb1-20240420-1.13.aarch64.rpm"
RPM_HASH = "2627b73339a4622d79cd5b18c002104c3912f3a44c7c857fc4059247fa1c436ffe107207c206aa1097081c6f75a6d77f35a7c47bff0290832a6459c6b744e96b"

RPROVIDES:${PN} += "libmapidb.so.1 \
libmapidb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcerror.so.1"

inherit rpm
