SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "libframecpp9-0-3.0.4-2.7.aarch64.rpm"
RPM_HASH = "9a71b5074aa579a0956aabd9a5f54920bcc38633b940e886237fd2ba82d7c162ec0481ff38da1f8a8c292e7559d0dadb2414924dd729a8f0482ac0014ccf63aa"

RPROVIDES:${PN} += "libframecpp9-0 \
libframecpp9.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecpp3.so.8 \
libframecpp4.so.10 \
libframecpp6.so.10 \
libframecpp7.so.6 \
libframecpp8.so.11 \
libframecppcmn.so.12 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
