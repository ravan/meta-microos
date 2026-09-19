SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "libframecpp7-6-3.0.4-2.7.aarch64.rpm"
RPM_HASH = "6f29d8f83d56d2ce8a1b765173d0abb777f0c2e592b97eb5f177e259bb4946e76df8e66c300b7877a4ee222521b3f5f60a0412b0945499fe73a8059db2ebf607"

RPROVIDES:${PN} += "libframecpp7-6 \
libframecpp7.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecpp3.so.8 \
libframecpp4.so.10 \
libframecpp6.so.10 \
libframecppcmn.so.12 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
