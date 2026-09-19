SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "libframecpp4-10-3.0.4-2.7.aarch64.rpm"
RPM_HASH = "b6c3e4d18ddd2b37c2cd345a634d02d7de4288ab744d34d3ee0081b06d2cfed73091fa85ea199c160677b0a6a93551ce1230e70211cefab48453167d02744879"

RPROVIDES:${PN} += "libframecpp4-10 \
libframecpp4.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecpp3.so.8 \
libframecppcmn.so.12 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
