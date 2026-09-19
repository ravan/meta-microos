SUMMARY = "Ticket Manager for Multi-site Clusters"
DESCRIPTION = "Booth manages tickets which authorize cluster sites located in \
geographically dispersed locations to run resources. It \
facilitates support of geographically distributed clustering in \
Pacemaker."
LICENSE = "GPL-2.0-or-later"

PV = "1.2+git0.322fea0"

RPM_NAME = "booth-1.2+git0.322fea0-1.13.aarch64.rpm"
RPM_HASH = "1779ed82d504d7c649faae23b57dd063253bb8e329c34e81bc1b0547306cda44666861e38d2d1005dc26291a63c4077ae7a75353330542a67321cf0b553f4b37"

RPROVIDES:${PN} += "booth \
config-booth \
pkgconfig-booth"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/sh \
group-haclient \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libqb.so.100 \
libsystemd.so.0 \
libxml2.so.16 \
libz.so.1 \
pacemaker-ticket-support \
user-hacluster"

inherit rpm
