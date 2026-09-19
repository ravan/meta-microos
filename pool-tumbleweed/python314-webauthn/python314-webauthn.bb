SUMMARY = "Pythonic WebAuthn"
DESCRIPTION = "Pythonic WebAuthn"
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "python314-webauthn-2.7.1-1.2.noarch.rpm"
RPM_HASH = "5d0d4e5ab10f575196413843dc38c09b1056edbc082f349c77fd66953a5b0f964b22a9034d2356b931f8ba3f6bf646ff7d8a415bdf4454853a375670870920f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-webauthn \
python314-webauthn \
python3dist-webauthn"

RDEPENDS:${PN} += "python-abi \
python314-cbor2 \
python314-cryptography \
python314-pyOpenSSL \
python314-pyasn1"

inherit rpm
