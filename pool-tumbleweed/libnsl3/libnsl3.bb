SUMMARY = "Network Support Library (NIS)"
DESCRIPTION = "The Network Support Library for NIS was formerly part of glibc and \
is now a standalone library. The big difference is, that this library \
has support for IPv6."
LICENSE = "LGPL-2.1-only"

PV = "2.0.0"

RPM_NAME = "libnsl3-2.0.0-1.24.aarch64.rpm"
RPM_HASH = "85229902ad309880594d131a49f776fb53f6eee8eab399353f5085b1cd3204d54c78c16ad53ff5bd2dc81f66e56886766decfa2354ec31c1a98638fd07e54677"

RPROVIDES:${PN} += "libnsl.so.3 \
libnsl3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtirpc.so.3"

inherit rpm
