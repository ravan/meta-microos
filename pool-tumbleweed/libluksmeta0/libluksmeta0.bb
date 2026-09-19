SUMMARY = "Simple library for storing metadata in the LUKSv1 header"
DESCRIPTION = "LUKSMeta is a simple library for storing metadata in the LUKSv1 header."
LICENSE = "LGPL-2.1-or-later"

PV = "9"

RPM_NAME = "libluksmeta0-9-1.11.aarch64.rpm"
RPM_HASH = "53ce866fd78779fd22222b7f2acde6fc69470f500eee164831c67e13fb835bf16e2c7eead2598a91903a1bd783c9e8af32b30f0626fae2d912f63b37e27d7329"

RPROVIDES:${PN} += "libluksmeta.so.0 \
libluksmeta0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptsetup.so.12"

inherit rpm
