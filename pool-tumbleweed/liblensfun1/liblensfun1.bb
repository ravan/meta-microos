SUMMARY = "Library files for lensfun"
DESCRIPTION = "Library files needed by the use the lensfun library/database."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.4"

RPM_NAME = "liblensfun1-0.3.4-7.5.aarch64.rpm"
RPM_HASH = "e7acb55109b75ffe9d4e96b95eef5d67c531abec6a6619dbb95579bd5d89aae7f114c1b150fbe0d4db27f0d26ee7055e0d2e120462314081f195d72aec9fe38e"

RPROVIDES:${PN} += "lensfun \
liblensfun.so.1 \
liblensfun1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
lensfun-data \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
