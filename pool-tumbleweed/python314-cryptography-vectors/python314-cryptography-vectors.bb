SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "50.0.0"

RPM_NAME = "python314-cryptography-vectors-50.0.0-1.1.noarch.rpm"
RPM_HASH = "0ada2bf278b09a7314ed8639c28a46e1f79c6b58e65d502b6a06324a2f2e12eff41742539c1b9456bd407a531287cb30919027acac0ff1030f07f472c2c51600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cryptography-vectors \
python314-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
