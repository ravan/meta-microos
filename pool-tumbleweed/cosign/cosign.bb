SUMMARY = "Container Signing, Verification and Storage in an OCI registry"
DESCRIPTION = "Cosign aims to make signatures invisible infrastructure. \
 \
Cosign supports: \
 \
- Hardware and KMS signing \
- Bring-your-own PKI \
- Our free OIDC PKI (Fulcio) \
- Built-in binary transparency and timestamping service (Rekor)"
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "cosign-3.1.2-1.2.aarch64.rpm"
RPM_HASH = "bb9db283599c1e2adf05972f420d8db5e4e2cc5e1fb4915dd061218305407deee8adf7ff21cc46200a54fdfcb5c184c653a921f1f1e3f7c2fe848a38813fa253"

RPROVIDES:${PN} += "cosign"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
