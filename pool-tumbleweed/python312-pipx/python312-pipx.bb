SUMMARY = "Install and Run Python Applications in Isolated Environments"
DESCRIPTION = "Install and Run Python Applications in Isolated Environments"
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python312-pipx-1.15.0-1.4.noarch.rpm"
RPM_HASH = "8595cbbf79852b7512be0aed75b77f14473c2d03a6846a4663d2fb05862b01ed852c3406df7f10229f0aa2a07d30d6ab9df8790ceee4354b3b8bdeea119eaf21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-pipx \
python312-pipx \
python3dist-pipx"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
alts \
python-abi \
python312 \
python312-argcomplete \
python312-packaging \
python312-platformdirs \
python312-userpath"

inherit rpm
