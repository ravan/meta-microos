SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "libframecpp8-11-3.0.4-2.7.aarch64.rpm"
RPM_HASH = "2347226c71752284eb3a1f483387de8b229fe76c07d6c015cc847ba4e2447ddcf632cd88db8ed453717b6c0614ef59987cf696d8c4aa62490fd1e776f8c1402a"

RPROVIDES:${PN} += "libframecpp8-11 \
libframecpp8.so.11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecpp3.so.8 \
libframecpp4.so.10 \
libframecpp6.so.10 \
libframecpp7.so.6 \
libframecppcmn.so.12 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
