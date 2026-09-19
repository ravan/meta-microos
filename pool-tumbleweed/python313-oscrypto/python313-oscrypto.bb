SUMMARY = "Python crypto using OS libraries"
DESCRIPTION = "TLS (SSL) sockets, key generation, encryption, decryption, signing, verification \
and KDFs using the OS crypto libraries. Does not require a compiler, and relies \
on the OS for patching. Works on Windows, OS X and Linux/BSD."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-oscrypto-1.3.0-4.5.noarch.rpm"
RPM_HASH = "5139ebf45ef8740e9353cff827431fe732341ba5f46698ece657e6e7466324f77c2e83835217c9278b7674da900e699d50e7d34ff3d2f1f104c0feb865a88ae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oscrypto \
python3.13dist-oscrypto \
python313-oscrypto \
python3dist-oscrypto"

RDEPENDS:${PN} += "python-abi \
python313-asn1crypto"

inherit rpm
