SUMMARY = "NIS client daemon"
DESCRIPTION = "This package provides the ypbind daemon. The ypbind daemon binds NIS \
clients to an NIS domain and searches a new NIS server if the old one \
goes down. \
 \
Ypbind must be running on any machines which are running NIS client \
programs."
LICENSE = "GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "ypbind-2.7.2-2.22.aarch64.rpm"
RPM_HASH = "08d73eb5139b732fc8338a64119a4cdc2d332ac82a4f35f44a4336848c3d791e8d767b0d0cb1582ce50108767667b02568d7a272b82612d5f722ccadb6ede621"

RPROVIDES:${PN} += "config-ypbind \
ypbind"

RDEPENDS:${PN} += "/usr/bin/grep \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnsl.so.3 \
libnss-nis2 \
libsystemd.so.0 \
libtirpc.so.3 \
rpcbind \
yp-tools"

inherit rpm
