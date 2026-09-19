SUMMARY = "Library for commandline flag processing"
DESCRIPTION = "The gflags package contains a library that implements commandline \
flags processing. As such, it is a replacement for getopt(). It has \
increased flexibility, including built-in support for C++ types like \
string, and the ability to define flags in the source file in which \
they're used."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "libgflags2_2-2.2.2-4.9.aarch64.rpm"
RPM_HASH = "1d56a34ac3961a848c0b4b37e4c002c81e1841c701b03973eb68db8dba14a67bacaba490a05150f6640e38a1b299610d2a42c716e8db12ed2aab1d4199d27a74"

RPROVIDES:${PN} += "libgflags-nothreads.so.2.2 \
libgflags.so.2.2 \
libgflags2-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
