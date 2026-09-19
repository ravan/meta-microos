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

RPM_NAME = "python313-Cython0-0.29.37-4.7.aarch64.rpm"
RPM_HASH = "14592b0e8838bb4ca33c9650021b3ecf471d1c09adaeddeb3fbdff497efe38b51315f9beeedd9159006cfa1aa6286d837039992bce25b34d2431321f85a4666e"

RPROVIDES:${PN} += "python3-Cython \
python3-Cython0 \
python3-cython \
python3.13dist-cython \
python313-Cython \
python313-Cython0 \
python313-cython \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-devel \
python313-xml"

inherit rpm
