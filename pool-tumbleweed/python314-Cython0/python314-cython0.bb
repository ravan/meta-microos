SUMMARY = "The Cython compiler for writing C extensions for the Python language"
DESCRIPTION = "The Cython language allows for writing C extensions for the Python \
language. Cython is a source code translator based on Pyrex, but \
supports more cutting edge functionality and optimizations. \
 \
The Cython language is very close to the Python language (and most Python \
code is also valid Cython code), but Cython additionally supports calling C \
functions and declaring C types on variables and class attributes. This \
allows the compiler to generate very efficient C code from Cython code."
LICENSE = "Apache-2.0"

PV = "0.29.37"

RPM_NAME = "python314-Cython0-0.29.37-4.7.aarch64.rpm"
RPM_HASH = "8bd24dd5ce938022489761d1b91bf6376cd4775fa4057db4a9975405e1445b61cb4d3060ba6bd34c2d1e3fcd7e4545c100f59147e237fe31565759e6bf3f5263"

RPROVIDES:${PN} += "python3.14dist-cython \
python314-Cython \
python314-Cython0 \
python314-cython \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-devel \
python314-xml"

inherit rpm
