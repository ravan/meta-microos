SUMMARY = "Pythonic WebAuthn"
DESCRIPTION = "Pythonic WebAuthn"
LICENSE = "BSD-3-Clause"

PV = "2.7.1"

RPM_NAME = "python313-webauthn-2.7.1-1.2.noarch.rpm"
RPM_HASH = "9688294d1b34723ba2b27a26207ff26c38c5acddf8e253041d48ad9175728bcfa9bf3d0fd33b5e349882f88eb02324ba007fd1dac0b567fb2c7470d014f9a156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webauthn \
python3.13dist-webauthn \
python313-webauthn \
python3dist-webauthn"

RDEPENDS:${PN} += "python-abi \
python313-cbor2 \
python313-cryptography \
python313-pyOpenSSL \
python313-pyasn1"

inherit rpm
