SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_util4-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "02741cc18ebd2ce88f570a4828802e9be5b2f61b95bc5699059206d49e7f583302f469fc3e72ab2608ee460c5aa5034a241d7821d44adad8b17c738b0cc8f133"

RPROVIDES:${PN} += "libxmlrpc-util.so.4 \
libxmlrpc-util4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
