SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_client3-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "582b002387d60f7b88c6bfd6707f9010fcef11f72fa1c07739fd0e27f3f5cad1e50d4c5993cf77d1641bba12eea736da41c09654af67e098b41d54cbc28be050"

RPROVIDES:${PN} += "libxmlrpc-client.so.3 \
libxmlrpc-client3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
