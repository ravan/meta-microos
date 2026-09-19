SUMMARY = "Python crypto using OS libraries"
DESCRIPTION = "TLS (SSL) sockets, key generation, encryption, decryption, signing, verification \
and KDFs using the OS crypto libraries. Does not require a compiler, and relies \
on the OS for patching. Works on Windows, OS X and Linux/BSD."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-oscrypto-1.3.0-4.5.noarch.rpm"
RPM_HASH = "cf7ea83379eb92bfdde10416f03abd56386481083fec67a8e42f5252e06ac2031119d512f6362e27cb62bcac110a064adb877d400390be1dbc72bfc2b98cf42d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oscrypto \
python314-oscrypto \
python3dist-oscrypto"

RDEPENDS:${PN} += "python-abi \
python314-asn1crypto"

inherit rpm
