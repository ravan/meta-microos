SUMMARY = "C bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "libframecppc4-3.0.4-2.7.aarch64.rpm"
RPM_HASH = "df28feed6e549f55373354f1c04bb0d7cc9815afa74a7d3a15cae52e118193e5c94a1c5fdeb0e1e9d20c6c31304cacf8715dcd196406ba2a5e86d284317dba2b"

RPROVIDES:${PN} += "libframecppc.so.4 \
libframecppc4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecpp.so.16 \
libframecpp3.so.8 \
libframecpp4.so.10 \
libframecpp6.so.10 \
libframecpp7.so.6 \
libframecpp8.so.11 \
libframecpp9.so.0 \
libframecppcmn.so.12 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
