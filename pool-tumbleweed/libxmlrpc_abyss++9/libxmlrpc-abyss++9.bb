SUMMARY = "HTTP server component for xmlrpc-c"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_abyss++9-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "398e4209fe71522e56439ca72a34ca4c9a647b77b4aa3b96b4851e9811677660378dd62eef7b9cd67f5d2273f3618892d73a52a583607670f76c25916efb063e"

RPROVIDES:${PN} += "libxmlrpc-abyss++.so.9 \
libxmlrpc-abyss++9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-abyss.so.3 \
libxmlrpc-util++.so.9 \
libxmlrpc-util.so.4"

inherit rpm
