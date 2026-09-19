SUMMARY = "Support Utilities for NFS"
DESCRIPTION = "This package contains common NFS utilities which are needed for client \
and kernel based server."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.2"

RPM_NAME = "nfs-client-2.9.2-55.1.aarch64.rpm"
RPM_HASH = "9711a0523d7102a5c673e5dcc67fa52badaa50b1c77f70ff39245c857d2f7ec0ba8a3d47e46f700fb22246042a10c062acc244c6a19d11492ae6244ef45e3f83"

RPROVIDES:${PN} += "group-statd \
nfs-client \
user-statd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
keyutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcom-err.so.2 \
libdevmapper.so.1.03 \
libevent-core-2.1.so.7 \
libgssapi-krb5.so.2 \
libk5crypto.so.3 \
libkeyutils.so.1 \
libkrb5.so.3 \
libmount.so.1 \
libnfsidmap.so.1 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnss-usrfiles2 \
libsqlite3.so.0 \
libtirpc.so.3 \
netcfg \
permissions \
rpcbind \
system-user-nobody \
sysuser-shadow"

inherit rpm
