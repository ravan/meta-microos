SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "libframecpp3-8-3.0.4-2.7.aarch64.rpm"
RPM_HASH = "e068dd6cbaaebe71159ff0ff0371092c298495b5ea8861bd8f19e5e0da5ddbc10568e3ef2e049df53ef7592ae60877b4fbd5fe03e4148de7cf0b165f7b395de4"

RPROVIDES:${PN} += "libframecpp3-8 \
libframecpp3.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecppcmn.so.12 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
