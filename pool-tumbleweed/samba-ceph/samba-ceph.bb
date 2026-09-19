SUMMARY = "Ceph specific add-ons for Samba"
DESCRIPTION = "The Ceph VFS module for Samba allows shares to be backed by the Ceph \
distributed file system. A Ceph CTDB lock helper binary is included so \
that RADOS locks can be used for CTDB split-brain avoidance."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-ceph-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "69f3b2b093db7d3f484e1dea300b7fc6e793e1ffde1ac8d47f58ae119299e414b32d6481b2050eca64f32a2e7ced720ca1a19786198011c9676fddd66c057738"

RPROVIDES:${PN} += "samba-ceph"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcephfs.so.2 \
libgenrand-private-samba.so \
librados.so.2 \
libsamba-debug-private-samba.so \
libsamba-errors.so.1 \
libsamba-util.so.0 \
libsamba3-util-private-samba.so \
libsmbconf.so.0 \
libsmbd-base-private-samba.so \
libtalloc.so.2 \
libtevent-util.so.0 \
libtevent.so.0 \
samba"

inherit rpm
