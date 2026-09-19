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

RPM_NAME = "python313-Cython-3.2.9-1.1.aarch64.rpm"
RPM_HASH = "bc1768205046cc1fca3551212dc6b2e0b586b5f6fc6e357a8e8a786a41059886a286db76f0674d922bc50027d63c9e4ff0a15cfd03df2e24d7763d14f3640fdc"

RPROVIDES:${PN} += "python3-Cython \
python3-Cython3 \
python3.13dist-cython \
python313-Cython \
python313-Cython3 \
python3dist-cython"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-devel"

inherit rpm
