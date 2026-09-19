SUMMARY = "Library for a C++ template languaging"
DESCRIPTION = "CTemplate is a template language for C++. It emphasizes separating \
logic from presentation: it is impossible to embed application logic \
in this template language."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "libctemplate3-2.4-2.1.aarch64.rpm"
RPM_HASH = "6143f2be05a41049eb2f05f65b796668e496fc3f8e0040d7051cd4da844ebb0b3086d0754254411f9265d93aed36598d028ef1c6d5a648abde0f1671d4859a11"

RPROVIDES:${PN} += "libctemplate-nothreads.so.3 \
libctemplate.so.3 \
libctemplate3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
