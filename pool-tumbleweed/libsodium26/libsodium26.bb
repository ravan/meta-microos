SUMMARY = "Portable NaCl-based crypto library"
DESCRIPTION = "NaCl (pronounced 'salt') is a new easy-to-use high-speed software library \
for network communication, encryption, decryption, signatures, etc. NaCl's goal \
is to provide all of the core operations needed to build higher-level cryptographic tools. \
 \
Sodium is a portable, cross-compilable, installable, packageable fork of NaCl, \
with a compatible API."
LICENSE = "ISC"

PV = "1.0.22"

RPM_NAME = "libsodium26-1.0.22-1.3.aarch64.rpm"
RPM_HASH = "783631077c0c9492415bbdea585bc7d2aae462119a5da6c0a7c9d2df6948c97a18c755372948da0df1755e27f5e59943a119463daf9229839c459cf90937aeee"

RPROVIDES:${PN} += "libsodium.so.26 \
libsodium26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
