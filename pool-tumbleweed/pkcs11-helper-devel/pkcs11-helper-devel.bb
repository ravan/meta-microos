SUMMARY = "Helper Library for the Use with Smart Cards and the PKCS#11 API"
DESCRIPTION = "pkcs11-helper allows using multiple PKCS#11 providers at the same time, \
selecting keys by id, label or certificate subject, handling card \
removal and card insert events, handling card re-insert to a different \
slot, supporting session expiration serialization and much more, all \
using a simple API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "1.31.0"

RPM_NAME = "pkcs11-helper-devel-1.31.0-2.3.aarch64.rpm"
RPM_HASH = "aaf6a82ee1e888dd0cf6eb7362e450865c70968d361ffee3a928e4c0ad71044c2712114437541a6e6a4c7e4ad8e178eddb25892f76fcfb86606ff19dae2d8eff"

RPROVIDES:${PN} += "pkcs11-helper-devel \
pkgconfig-libpkcs11-helper-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpkcs11-helper1"

inherit rpm
