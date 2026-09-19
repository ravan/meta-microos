SUMMARY = "Install and Run Python Applications in Isolated Environments"
DESCRIPTION = "Install and Run Python Applications in Isolated Environments"
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "python311-pipx-1.15.0-1.4.noarch.rpm"
RPM_HASH = "900e530fe7f6e1a321ea5c155aa2e6be074f15bda47bf2cb7a7a6b0ec1b0df49757d1885ebae04194be1069a4e5590702910b59a8d4ffb281941aafd1ecbc287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pipx \
python311-pipx \
python3dist-pipx"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311 \
python311-argcomplete \
python311-packaging \
python311-platformdirs \
python311-userpath"

inherit rpm
