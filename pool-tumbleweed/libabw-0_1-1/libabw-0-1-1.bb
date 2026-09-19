SUMMARY = "Library for parsing the AbiWord file format structure"
DESCRIPTION = "Libabw is library providing ability to interpret and import AbiWord documents \
into various applications."
LICENSE = "MPL-2.0"

PV = "0.1.4"

RPM_NAME = "libabw-0_1-1-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "1f4811929b388e8470e1e50379a40523566a56469502b462eb26d7cb5ed7c6d09ba13e7b361c2c520efa913fbdc5730b95e4ccb95c8d8a47ef2c050521ac7d02"

RPROVIDES:${PN} += "libabw-0-1-1 \
libabw-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
