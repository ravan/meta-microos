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

RPM_NAME = "libeac3-1.1.3-1.9.aarch64.rpm"
RPM_HASH = "e5b274a1718af104aadcb9dffcc4452735e4289ce5300e7ab5e56768472813fc85d4a4e3df0842beaae2f17871d29f30798573281f30d83e8a2a74d565c76d34"

RPROVIDES:${PN} += "config-libeac3 \
libeac.so.3 \
libeac3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
