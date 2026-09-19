SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.4"

RPM_NAME = "libframecpp16-3.0.4-2.7.aarch64.rpm"
RPM_HASH = "6c65a6b6b37545eb7b5f776b2d467c501df7e478484b3be5fe93b5bee6c12ba79ddaca45725ae2440aae4f80eacfadcd301b5df1693e9b592696361b75aec077"

RPROVIDES:${PN} += "libframecpp.so.16 \
libframecpp16"

RDEPENDS:${PN} += "/sbin/ldconfig \
libframecpp3.so.8 \
libframecpp4.so.10 \
libframecpp6.so.10 \
libframecpp7.so.6 \
libframecpp8.so.11 \
libframecpp9.so.0 \
libstdc++.so.6"

inherit rpm
