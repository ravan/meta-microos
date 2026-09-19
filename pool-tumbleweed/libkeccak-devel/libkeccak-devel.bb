SUMMARY = "Development files for libkeccak"
DESCRIPTION = "libkeccak is a bit-oriented lanewise implementation of the Keccak \
family with support for extend output size, state marshalling, \
algorithm tuning with implicit parameters, secure erasure of \
sensitive data, and HMAC. \
 \
A subset of Keccak was specified by NIST as SHA-3 (Secure Hash Algorithm 3). \
This package contains the files required for development with libkeccak."
LICENSE = "ISC"

PV = "1.4.3"

RPM_NAME = "libkeccak-devel-1.4.3-1.3.aarch64.rpm"
RPM_HASH = "f0afea630bf23cf78efa51054775a7544b16645edca3721a0e52534a67123d63cb832da1ee80a2f7c00aff2ea9b2fd78de2a2ea4dc06272177765f0248de6729"

RPROVIDES:${PN} += "libkeccak-devel"

RDEPENDS:${PN} += "libkeccak1"

inherit rpm
