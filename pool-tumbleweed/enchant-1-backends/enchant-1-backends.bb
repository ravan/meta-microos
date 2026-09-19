SUMMARY = "ISpell/Myspell backends for libenchant"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides the ispell and myspell backends."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-backends-1.6.1-8.10.aarch64.rpm"
RPM_HASH = "89b2a7aca5856b9c9061cc7bbcfcc15a4f5e6d1498e8d82fb4e49b118dbcca8fdc16e56564bd8d116afc7e320f6f082623de5e36d51e27772245b45e03769bdd"

RPROVIDES:${PN} += "enchant-1-backend \
enchant-1-backends \
libenchant-ispell.so \
libenchant-myspell.so \
libenchant1-/usr/lib64/enchant/libenchant-ispell.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
