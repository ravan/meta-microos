SUMMARY = "Utility programs making use of libfido2, a library for FIDO U2F and FIDO 2.0"
DESCRIPTION = "This package contains utilities to use FIDO U2F and FIDO 2.0 protocols."
LICENSE = "BSD-2-Clause"

PV = "1.16.0"

RPM_NAME = "libfido2-utils-1.16.0-2.1.aarch64.rpm"
RPM_HASH = "54a597cf27c242b35f576d332200785fca9dfd350a2c169240bc982837c64ba6612b99162811bb9af0874bdedd2de283839f878abed1b96b1a82597af75e575e"

RPROVIDES:${PN} += "libfido2-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcbor.so.0.14 \
libcrypto.so.3 \
libfido2.so.1 \
libz.so.1"

inherit rpm
