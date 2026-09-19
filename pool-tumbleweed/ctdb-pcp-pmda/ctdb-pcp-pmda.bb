SUMMARY = "Performance Co-Pilot (PCP) monitoring agent"
DESCRIPTION = "The CTDB Performance Co-Pilot (PCP) monitoring agent allows remote PCP \
clients to view and capture detailed real-time performance metrics for \
one or more cluster nodes."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "ctdb-pcp-pmda-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "e7a17f67fe897db922f9a779fe12f29c54ebb9be77517295d2ff8e015afa913887e3923dccb9150d9a745260c5ac71d7ed95a172bdd8655cbdfc7fbdd9276a78"

RPROVIDES:${PN} += "ctdb-pcp-pmda"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpopt.so.0 \
libsamba-debug-private-samba.so \
libsamba-util.so.0 \
libsocket-blocking-private-samba.so \
libsys-rw-private-samba.so \
libtalloc.so.2 \
libtdb-wrap-private-samba.so \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-private-samba.so"

inherit rpm
