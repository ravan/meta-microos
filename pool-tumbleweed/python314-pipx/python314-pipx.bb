SUMMARY = "Install and Run Python Applications in Isolated Environments"
DESCRIPTION = "Install and Run Python Applications in Isolated Environments"
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python314-pipx-1.15.0-1.4.noarch.rpm"
RPM_HASH = "a005821e1e30e017b96b16bb7178f0e057b9ae3fb39828cfc59d9e2c7d737c5c9ac12e3f28942bb549b6fd3063605c8864192444a5a60b8c67d2bab392d595dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pipx \
python314-pipx \
python3dist-pipx"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314 \
python314-argcomplete \
python314-packaging \
python314-platformdirs \
python314-userpath"

inherit rpm
