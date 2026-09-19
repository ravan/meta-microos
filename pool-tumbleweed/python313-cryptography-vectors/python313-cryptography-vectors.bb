SUMMARY = "Test vectors for the cryptography package"
DESCRIPTION = "Vectors for testing of the python cryptography package."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "50.0.0"

RPM_NAME = "python313-cryptography-vectors-50.0.0-1.1.noarch.rpm"
RPM_HASH = "c1a3134eeb3c928dcbad94e80a8d4819b28de4c24e8ec8a0b777e1d3b04b8560e88c2e77b7488c8a22205c91a286812bdef159608748bc70f963ad1ca917ff0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cryptography-vectors \
python3.13dist-cryptography-vectors \
python313-cryptography-vectors \
python3dist-cryptography-vectors"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi"

inherit rpm
