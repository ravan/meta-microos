SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_server_cgi3-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "43296f44a5b66a8e11253d9158eb249b1bf4f671b6dfbb83c1afa742782b8657600c6ac51c53fad026b65c5cbf894be39437a23d0667e9b97a93b382b689845f"

RPROVIDES:${PN} += "libxmlrpc-server-cgi.so.3 \
libxmlrpc-server-cgi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxmlrpc-server.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
