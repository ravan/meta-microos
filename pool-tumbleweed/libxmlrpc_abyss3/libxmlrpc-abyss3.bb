SUMMARY = "HTTP server component for xmlrpc-c"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_abyss3-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "3231c0bfc89772f5ff59a495f3a7010cbebcb0c933e23e492b8656fc684f35f85eaba2477ee9de3af3de1c3cf9a9c7a85f2ed00033358e73fc341ef4cddde1c2"

RPROVIDES:${PN} += "libxmlrpc-abyss.so.3 \
libxmlrpc-abyss3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libxmlrpc-util.so.4"

inherit rpm
