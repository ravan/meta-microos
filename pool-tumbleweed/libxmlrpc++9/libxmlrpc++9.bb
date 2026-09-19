SUMMARY = "Legacy C++ interface for xmlrpc-c"
DESCRIPTION = "libxmlrpc_cpp is the legacy C++ wrapper library. \
 \
libxmlrpc_server++, libxmlrpc_server_cgi++, \
libxmlrpc_server_pstream++, libxmlrpc_packetsocket, \
libxmlrpc_server_abyss++, and libxmlrpc_client++ are the more \
elaborate replacements."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc++9-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "59eed4aee6e1c50af8d934e6648e527f0bd377dad542ffa8bf00a91d3338478ab3cf8693a6f94c7b5f7af64d9783bda7bf84a6127658fd3a0ee1a490c524e449"

RPROVIDES:${PN} += "libxmlrpc++.so.9 \
libxmlrpc++9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-util++.so.9 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
