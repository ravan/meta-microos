SUMMARY = "Automated C, C++, and Java Documentation Generator"
DESCRIPTION = "Doxygen is the de facto standard tool for generating documentation \
from annotated C++ sources, but it also supports other popular \
programming languages such as C, Objective-C, C-sharp, PHP, Java, \
Python, IDL (Corba, Microsoft, and UNO/OpenOffice flavors), Fortran, \
and to some extent D. Doxygen also supports the hardware description \
language VHDL."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.0"

RPM_NAME = "doxygen-1.18.0-1.2.aarch64.rpm"
RPM_HASH = "c1304b75c48bee9129aef99797dbd65d272f33255c358a172f2aa40031f0e07a20d54d17ee0c642a2cc92a0bd29a7c6368e4d199fd9f24307cfead1edf498ab0"

RPROVIDES:${PN} += "doxygen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclang-cpp.so.23.1 \
libclang.so.13 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
