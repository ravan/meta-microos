SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_server_abyss++9-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "c2b047a8a8bf78ca79d94fe1b6590ef6de2191275a118d1bdacec3e81997255047b38f06af9b3689b085440c9cedcdae13f9fcc1c64fa423c3ca0bae70b48530"

RPROVIDES:${PN} += "libxmlrpc-server-abyss++.so.9 \
libxmlrpc-server-abyss++9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-abyss++.so.9 \
libxmlrpc-abyss.so.3 \
libxmlrpc-server++.so.9 \
libxmlrpc-server-abyss.so.3 \
libxmlrpc-util++.so.9 \
libxmlrpc-util.so.4"

inherit rpm
