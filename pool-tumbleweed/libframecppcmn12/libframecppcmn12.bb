SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "libframecppcmn12-3.0.4-2.7.aarch64.rpm"
RPM_HASH = "7e3b0d5f8ca63ee059f213324a25302c77e373f2323c53fefbeb8b80584703f3d2a07cf583cadf9e4550936c6d69c44867de965068c1d48f6a3ae8e7cb93a804"

RPROVIDES:${PN} += "libframecppcmn.so.12 \
libframecppcmn12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
