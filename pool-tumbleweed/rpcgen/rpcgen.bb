SUMMARY = "RPC protocol compiler"
DESCRIPTION = "rpcgen is a tool that generates C code to implement an RPC protocol. \
The input to rpcgen is a language similar to C known as RPC Language \
(Remote Procedure Call Language)."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "rpcgen-1.4.4-1.11.aarch64.rpm"
RPM_HASH = "de5986fa49ec89032ca284e13e677f3c97ab20dc7530fd9bf61ace4295cf7357b7c0b05959e5eff95bd9b03853ed6af8f2e620976e3de9b23866f8d2c1d4a45c"

RPROVIDES:${PN} += "glibc-devel-/usr/bin/rpcgen \
rpcgen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
