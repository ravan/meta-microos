SUMMARY = "TPM2 pin integration for Clevis"
DESCRIPTION = "Provides support to encrypt a key in a Trusted Platform Module 2.0 (TPM2) chip. The key used for encryption is encrypted using the TPM2 chip, and is decrypted using TPM2 to allow clevis to decrypt the secret stored in the JWE. \
Clevis store the public and private keys of the encrypted key in the JWE object, so those can be fetched on decryption to unseal the key encrypted using the TPM2."
LICENSE = "GPL-3.0-or-later"

PV = "21"

RPM_NAME = "clevis-pin-tpm2-21-1.6.aarch64.rpm"
RPM_HASH = "41fa0001a8942b55108a1771822e03e066654707e17f4dd4497fa5d099f0d971bd1754888e0d2ffbb67a9afbc89f1716117e3170c4e817d09afd8b69dc5c59b8"

RPROVIDES:${PN} += "clevis-pin-tpm2"

RDEPENDS:${PN} += "/usr/bin/bash \
tpm2.0-tools"

inherit rpm
