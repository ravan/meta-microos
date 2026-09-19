SUMMARY = "FreeRADIUS Clients"
DESCRIPTION = "Collection of FreeRADIUS utilities."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.8"

RPM_NAME = "freeradius-server-utils-3.2.8-1.8.aarch64.rpm"
RPM_HASH = "5f6337649574ca0fc5c2f8b051a2344f44ccabe664b632fb3b6991455994e6ba653a1117115305d6bf756752b6c13a323913840612835f1a7b665e526333da6c"

RPROVIDES:${PN} += "freeradius-server-utils"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
freeradius-server-libs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfreeradius-dhcp.so \
libfreeradius-eap.so \
libfreeradius-radius.so \
libfreeradius-server.so \
libgdbm.so.6 \
libpcap.so.1 \
libssl.so.3 \
libtalloc.so.2"

inherit rpm
