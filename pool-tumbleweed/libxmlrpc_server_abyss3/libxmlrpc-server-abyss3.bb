SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_server_abyss3-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "2caf0d45298d9180606cf26dba9212dbc72d76f2c20f3ff89cccb40bc1a5a177802abcff003e6aa649eea3adfb44a14864cb60050bbcee2a7fd050a09ff97648"

RPROVIDES:${PN} += "libxmlrpc-server-abyss.so.3 \
libxmlrpc-server-abyss3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxmlrpc-abyss.so.3 \
libxmlrpc-server.so.3 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
