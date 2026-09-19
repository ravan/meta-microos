SUMMARY = "Implementation of New/POSIX AWK"
DESCRIPTION = "mawk is an interpreter for the AWK Programming Language. It implements the AWK \
language as defined in Aho, Kernighan and Weinberger, The AWK  Programming \
Language, Addison-Wesley Publishing, 1988. Furthermore, it conforms to the \
POSIX 1003.2 (draft 11.3) definition of the AWK language and additionally \
provides a small number of extensions."
LICENSE = "GPL-2.0-only"

PV = "1.3.4.20240622"

RPM_NAME = "mawk-1.3.4.20240622-1.10.aarch64.rpm"
RPM_HASH = "cb355348158a74f1556ec5d86e6e403c102faf996b3dbb874c9ea153e3942b82051bacb5979b14d0d3a7da81449f911ff5f8d57a845a3f63866be654687dfcc8"

RPROVIDES:${PN} += "mawk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
