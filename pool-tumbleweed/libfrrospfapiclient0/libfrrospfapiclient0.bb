SUMMARY = "API for FRRouting's OSPFv2 implementation"
DESCRIPTION = "This library contains part of the OSPFv2 implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.6.1"

RPM_NAME = "libfrrospfapiclient0-10.6.1-1.3.aarch64.rpm"
RPM_HASH = "2241526771bb36b4ecd7c511ac20aa85573eb0378617be415e5eebe08321e8f5a20d62123557082d9dd0820e7e89febfe885ae5c83b6e8d21f726bd6fa8947ec"

RPROVIDES:${PN} += "libfrrospfapiclient.so.0 \
libfrrospfapiclient0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libfrr.so.0"

inherit rpm
