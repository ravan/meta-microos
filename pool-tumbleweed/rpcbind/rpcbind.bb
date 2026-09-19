SUMMARY = "Transport independent RPC portmapper"
DESCRIPTION = "Rpcbind is a replacement for portmap. Whereas portmap supports only UDP \
and TCP transports over INET (IPv4), rpcbind can be configured to work \
on various transports supported by the TI-RPC. This includes TCP and \
UDP over IPv6. Moreover, rpcbind provides additional functions in \
regards to portmap."
LICENSE = "BSD-4-Clause"

PV = "1.2.9"

RPM_NAME = "rpcbind-1.2.9-2.1.aarch64.rpm"
RPM_HASH = "8ca9c6937e42e7030161c08a86d8682899aa96a6882c32e5139f0cceab0e8f14bbbd30134010a3b6b9f087c55107d51996af8aee2acc5ffce4dfc6344a984a40"

RPROVIDES:${PN} += "group-rpc \
portmap \
rpcbind \
user-rpc"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
libtirpc.so.3 \
libwrap.so.0 \
system-user-nobody \
sysuser-shadow"

inherit rpm
