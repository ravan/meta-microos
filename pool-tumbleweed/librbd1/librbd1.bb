SUMMARY = "RADOS block device client library"
DESCRIPTION = "RBD is a block device striped across multiple distributed objects in \
RADOS, a reliable, autonomic distributed object storage cluster \
developed as part of the Ceph distributed storage system. This is a \
shared library allowing applications to manage these block devices."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "librbd1-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "283f334735ffb4e52b20451cc16e03db8192bc2790a9a3da5c368866b70d905d35b747f2990167b86d6ff97ff8f7ac8a36c274422e0d3480a37a45b3a8e28f27"

RPROVIDES:${PN} += "libceph-librbd-parent-cache.so.1 \
libceph-librbd-pwl-cache.so.1 \
librbd-tp.so.1 \
librbd.so.1 \
librbd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
coreutils \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcap.so.2 \
libceph-common.so.2 \
libcrypto.so.3 \
libcryptsetup.so.12 \
libgcc-s.so.1 \
liblttng-ust.so.1 \
librados.so.2 \
librados2 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
