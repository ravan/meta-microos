SUMMARY = "Library implementing XML-based Remote Procedure Calls"
DESCRIPTION = "XML-RPC is a lightweight RPC protocol based on XML and HTTP. This \
package is used by XML-RPC clients and servers written in C and C++."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_util++9-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "16530cb14889feaf632f07534f2503f6b68ff32751d908095cb1feb594a240c0894e2f68a759d78801187fd5ee1f7de608290b025d3b93c30eaa962a5f8e2271"

RPROVIDES:${PN} += "libxmlrpc-util++.so.9 \
libxmlrpc-util++9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-util.so.4"

inherit rpm
