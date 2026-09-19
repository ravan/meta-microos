SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_client++9-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "b8e52db8cd1773afa90ebcf2b2ed61a1c80686f321a90bee84a698f8b2c22c755278d97b7566255a97df7ac50a6f1ffad5e88188b2442aa98d4fda0ae0405caf"

RPROVIDES:${PN} += "libxmlrpc-client++.so.9 \
libxmlrpc-client++9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc++.so.9 \
libxmlrpc-client.so.3 \
libxmlrpc-packetsocket.so.9 \
libxmlrpc-util++.so.9 \
libxmlrpc-util.so.4 \
libxmlrpc.so.3"

inherit rpm
