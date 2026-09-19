SUMMARY = "Support Utilities for Kernel nfsd"
DESCRIPTION = "This package contains support for the kernel based NFS server. You can \
tune the number of server threads via the sysconfig variable \
USE_KERNEL_NFSD_NUMBER. For quota over NFS support, install the quota \
package."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.2"

RPM_NAME = "nfs-kernel-server-2.9.2-55.1.aarch64.rpm"
RPM_HASH = "e6f664f71435e2faf3e0c79080d66b346a37ba41079ce40dd1df9256a224918d10787aa8b0b7d3a295401f7b0c624d89584595a9c7820487c6b0984847cf5a6e"

RPROVIDES:${PN} += "nfs-kernel-server \
nfs-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcap.so.2 \
libevent-core-2.1.so.7 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnss-usrfiles2 \
libreadline.so.8 \
libsqlite3.so.0 \
libtirpc.so.3 \
libuuid.so.1 \
libxml2.so.16 \
netcfg \
nfs-client \
permissions \
rpcbind"

inherit rpm
