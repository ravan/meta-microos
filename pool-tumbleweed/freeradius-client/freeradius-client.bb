SUMMARY = "FreeRADIUS Client Software"
DESCRIPTION = "A portable, easy-to-use and standard compliant library suitable for \
developing free and commercial software that need support for a RADIUS \
protocol (RFCs 2128 and 2139)."
LICENSE = "BSD-2-Clause"

PV = "1.1.7"

RPM_NAME = "freeradius-client-1.1.7-3.9.aarch64.rpm"
RPM_HASH = "62fe58a74d3755d28f51415e2173a8d21108025af565a6aeef4b079bfbfc0c61c6cc83138fe92de30d7a23dd6d7a2e4656683aad8d50abd791e7e3e0a6415b60"

RPROVIDES:${PN} += "config-freeradius-client \
freeradius-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libfreeradius-client.so.2"

inherit rpm
