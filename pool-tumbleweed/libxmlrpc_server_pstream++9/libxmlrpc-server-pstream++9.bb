SUMMARY = "Non-HTTP RPC server with XML payloads"
DESCRIPTION = "libxmlrpc_server_pstream++ provides a (non-HTTP) RPC server based on \
a simple byte stream and XML-RPC XML."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_server_pstream++9-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "08001ac18b39eb948ef76a7541f22acf239029cb773426952a2ce0f3b93770ff7a69e7f4182576b28cd34c76a8d572e5380f59282105f42d06871dea31bda150"

RPROVIDES:${PN} += "libxmlrpc-server-pstream++.so.9 \
libxmlrpc-server-pstream++9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-packetsocket.so.9 \
libxmlrpc-server++.so.9 \
libxmlrpc-util++.so.9"

inherit rpm
