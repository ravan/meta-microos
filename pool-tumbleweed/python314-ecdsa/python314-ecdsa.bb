SUMMARY = "ECDSA cryptographic signature library (pure python)"
DESCRIPTION = "This is an easy-to-use implementation of ECDSA cryptography (Elliptic Curve \
Digital Signature Algorithm), implemented purely in Python, released under \
the MIT license. With this library, you can quickly create keypairs (signing \
key and verifying key), sign messages, and verify the signatures. The keys \
and signatures are very short, making them easy to handle and incorporate \
into other protocols."
LICENSE = "MIT"

PV = "0.19.2"

RPM_NAME = "python314-ecdsa-0.19.2-2.2.noarch.rpm"
RPM_HASH = "5b89fa6c6b0d70cd75cb95b24fcce10485abfc517851931bb330e480db2cb6c58f0fefdd0f59cd1f79aad17e4e6e1872b47ff14841d05ed0c484674fd34065b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ecdsa \
python314-ecdsa \
python3dist-ecdsa"

RDEPENDS:${PN} += "python-abi \
python314-six"

inherit rpm
