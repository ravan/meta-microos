SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_server++9-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "d3052f106f7a612cdad90c6dc3421d5ca4fdf7749d0df312ee8a999f7ddb893c16bc176d064e33656ceec0b94b571c5d150e77f23f4a15ea3ad3b8ad4b201161"

RPROVIDES:${PN} += "libxmlrpc-server++.so.9 \
libxmlrpc-server++9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc++.so.9 \
libxmlrpc-server.so.3 \
libxmlrpc-util++.so.9 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
