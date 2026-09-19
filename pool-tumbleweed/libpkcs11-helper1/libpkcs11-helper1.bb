SUMMARY = "Helper Library for the Use with Smart Cards and the PKCS#11 API"
DESCRIPTION = "pkcs11-helper allows using multiple PKCS#11 providers at the same time, \
selecting keys by id, label or certificate subject, handling card \
removal and card insert events, handling card re-insert to a different \
slot, supporting session expiration serialization and much more, all \
using a simple API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.31.0"

RPM_NAME = "libpkcs11-helper1-1.31.0-2.3.aarch64.rpm"
RPM_HASH = "996b464c8eac4739ca8f2b3f38fa54e21fd35bdf79c8908ccc7cd34b8ef6b304f9177faf6923555e53c94050daa2ad53d7d6755190cd65f6aee988161fe85996"

RPROVIDES:${PN} += "libpkcs11-helper.so.1 \
libpkcs11-helper1 \
pkcs11-helper"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
