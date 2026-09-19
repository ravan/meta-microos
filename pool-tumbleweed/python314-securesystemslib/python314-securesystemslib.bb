SUMMARY = "Cryptographic and general routines for Secure Systems Lab"
DESCRIPTION = "Cryptographic and general-purpose routines for Secure Systems Lab projects at NYU"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python314-securesystemslib-1.4.0-1.3.noarch.rpm"
RPM_HASH = "1a3dd25ab450f397d711c49e0939ab2804b65d6ae52e9c880759bf28b9e19b2e1f30a05b1c054227163e65d7e1722843a584ad4775fcf76c96067c98d0ee08b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-securesystemslib \
python314-securesystemslib \
python3dist-securesystemslib"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
python314-PyKCS11 \
python314-asn1crypto \
python314-cryptography"

inherit rpm
