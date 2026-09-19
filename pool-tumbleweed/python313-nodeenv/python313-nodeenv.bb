SUMMARY = "Nodejs virtual environment builder"
DESCRIPTION = "Node.js virtual environment builder."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "python313-nodeenv-1.10.0-1.3.noarch.rpm"
RPM_HASH = "be6d5972ddc393eb21baeda2bc8bb0933526fb94b8d0c4c09a10ec4ae2139e0292223ddf8d7acd7b55583da4ef1fb7856e51b5e9684acea79c3df15a2a4d9fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nodeenv \
python3.13dist-nodeenv \
python313-nodeenv \
python3dist-nodeenv"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-setuptools"

inherit rpm
