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

PV = "3.2.9"

RPM_NAME = "python314-Cython-3.2.9-1.1.aarch64.rpm"
RPM_HASH = "50066da52985e8778cabb3bf4e00a445e88976405b52efefcb1fad859941a57c37bbf6257f577888b62db0c0b5bcd9048efb0b5c629b38d27fd240cc6f1b76da"

RPROVIDES:${PN} += "python3.14dist-cython \
python314-Cython \
python314-Cython3 \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-devel"

inherit rpm
