SUMMARY = "Client library for accessing NFS shares over a network"
DESCRIPTION = "Package contains a library of functions for accessing NFSv2 and \
NFSv3 servers from user space. It provides a low-level, \
asynchronous RPC library for accessing NFS protocols, an \
asynchronous library with POSIX-like VFS functions, and a \
synchronous library with POSIX-like VFS functions."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "6.0.2"

RPM_NAME = "libnfs16-6.0.2-1.3.aarch64.rpm"
RPM_HASH = "30be58ca318a648f7789a60854b45ebf9ccf858009f13e43fee5bbac3c0700aaf076ca19be9f6a840ae0cf96cafd29c314d3920788a89a90c8764117a48e56c0"

RPROVIDES:${PN} += "libnfs.so.16 \
libnfs16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2"

inherit rpm
