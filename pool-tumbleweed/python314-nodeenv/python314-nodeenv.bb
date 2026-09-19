SUMMARY = "Nodejs virtual environment builder"
DESCRIPTION = "Node.js virtual environment builder."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "python314-nodeenv-1.10.0-1.3.noarch.rpm"
RPM_HASH = "b33b64c17dad4117cf3d3113ad57070ba07d2195732e42896b63ea5cb45c9baa0280e31e591e8a226ecb93b477d25bb8e734ea7bfd389d3674b43602fc79f4a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nodeenv \
python314-nodeenv \
python3dist-nodeenv"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-setuptools"

inherit rpm
