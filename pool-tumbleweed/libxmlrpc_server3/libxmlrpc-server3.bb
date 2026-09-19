SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_server3-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "1bccadb82a9b44205e0aab1b567878e635b40b0f8cbcc113e504ca1b0175f7a8c5e0114795150b68cd6f32bc2d4a94d88bf6d33aa9a95b3b4dd3ce966c0837ee"

RPROVIDES:${PN} += "libxmlrpc-server.so.3 \
libxmlrpc-server3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
