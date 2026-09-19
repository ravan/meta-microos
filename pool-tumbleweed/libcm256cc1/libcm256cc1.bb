SUMMARY = "Fast GF(256) Cauchy MDS Block Erasure Codec in C++"
DESCRIPTION = "This is the rewrite in (as much as possible) clean C++ of cm256. \
cm256cc is a simple library for erasure codes. From given data it \
generates redundant data that can be used to recover the originals."
LICENSE = "BSD-3-Clause & GPL-3.0-only & MIT"

PV = "1.1.2"

RPM_NAME = "libcm256cc1-1.1.2-1.1.aarch64.rpm"
RPM_HASH = "d98c4c111b0b51e9bcd4dbaf4f365df29cd6757e2fb75e645c04ecb262d980d5a7c9649aa3beca33fd787372c89504ff8acf6a5d9b31325e2c703fee2cde4112"

RPROVIDES:${PN} += "cm256cc \
libcm256cc.so.1 \
libcm256cc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
