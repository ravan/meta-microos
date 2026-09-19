SUMMARY = "Cryptographic library for EAC version 2"
DESCRIPTION = "OpenPACE implements Extended Access Control (EAC) version 2 as specified \
in BSI TR-03110. OpenPACE comprises support for the following protocols: \
 \
 * Password Authenticated Connection Establishment (PACE) \
 * Terminal Authentication (TA) \
 * Chip Authentication (CA) \
 \
OpenPACE also supports Card Verifiable Certificates (CV Certificates) \
and signing requests as well as easy to use wrappers for using the \
established secure channels. \
 \
OpenPACE supports all variants of PACE (DH/ECDH, GM/IM), TA \
(RSASSA-PKCS1-v1_5/RSASSA-PSS/ECDSA), CA (DH/ECDH) and all \
standardised domain parameters (GFP/ECP)."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "openpace-1.1.3-1.9.aarch64.rpm"
RPM_HASH = "06ce2dfa25659002b5d2bfd00a5f86e73eb3f723fe2e11e6fe79be689b0cbe2184e34db19c7e53f1436efe78f6c1a6e29b97634feb240134f68c603d2cd1765f"

RPROVIDES:${PN} += "openpace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libeac.so.3"

inherit rpm
