SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_cpp9-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "9786b089eb7e2878d98fe8345400c7d3995a642070eebf7c50d18d579cfa8a344fd1f65de11417b85f2d656ec8b51a080cdbca766aa4f67b4f0ab8088995293d"

RPROVIDES:${PN} += "libxmlrpc-cpp.so.9 \
libxmlrpc-cpp9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-server.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
