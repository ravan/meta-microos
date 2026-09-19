SUMMARY = "Fast Lexical Analyzer Generator"
DESCRIPTION = "FLEX is a tool for generating scanners: programs that recognize lexical \
patterns in text."
LICENSE = "BSD-3-Clause"

PV = "2.6.4"

RPM_NAME = "flex-2.6.4-7.10.aarch64.rpm"
RPM_HASH = "7c4d50a903adb3c0d93f02aec92f6e16cc81813197305d39206b4c7c8766c87d7cbfdf2aa383607d5e42ec0e6d5a26f1668b3b94379305357d880eb4d58920b7"

RPROVIDES:${PN} += "flex"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfl-devel \
libm.so.6 \
m4"

inherit rpm
