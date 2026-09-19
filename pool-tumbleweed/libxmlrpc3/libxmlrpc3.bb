SUMMARY = "A library implementing XML-based remote procedure calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc3-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "bbdb10651d0af03bdca0a91ed0b1b194656c77ed92c7bbda23a8e1262a778ade544eb6e3a6f8aef0bdeb4403af8225d556c525e9176be5cb01f1efb34fb49a80"

RPROVIDES:${PN} += "libxmlrpc.so.3 \
libxmlrpc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.16 \
libxmlrpc-util.so.4"

inherit rpm
