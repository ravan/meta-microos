SUMMARY = "Implementation of Noise Protocol Framework"
DESCRIPTION = "A Python 3 implementation of Noise Protocol Framework. Compatible with revisions 32 and 33."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python314-noiseprotocol-0.3.1-2.5.noarch.rpm"
RPM_HASH = "daa4f012c2cd0afc4e2019d27481fefa3b97d288748846731adde2b43a18de83f9a1092b9112b6acd771ec410ba0a375362674328194e9f2552b71c04da05070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-noiseprotocol \
python314-noiseprotocol \
python3dist-noiseprotocol"

RDEPENDS:${PN} += "python-abi \
python314-cryptography"

inherit rpm
