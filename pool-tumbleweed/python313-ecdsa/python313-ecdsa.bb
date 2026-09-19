SUMMARY = "ECDSA cryptographic signature library (pure python)"
DESCRIPTION = "This is an easy-to-use implementation of ECDSA cryptography (Elliptic Curve \
Digital Signature Algorithm), implemented purely in Python, released under \
the MIT license. With this library, you can quickly create keypairs (signing \
key and verifying key), sign messages, and verify the signatures. The keys \
and signatures are very short, making them easy to handle and incorporate \
into other protocols."
LICENSE = "MIT"

PV = "0.19.2"

RPM_NAME = "python313-ecdsa-0.19.2-2.2.noarch.rpm"
RPM_HASH = "437e8b29e90c397b4a69231fcc53f0e207455f82047fb0f5f010cd720c095603dfa95841bab3a10c435df38bf7060c18ef5935128979fa7e3e4571ecb9fe7eac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ecdsa \
python3.13dist-ecdsa \
python313-ecdsa \
python3dist-ecdsa"

RDEPENDS:${PN} += "python-abi \
python313-six"

inherit rpm
