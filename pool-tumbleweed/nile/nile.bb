SUMMARY = "Unofficial Amazon Games client"
DESCRIPTION = "Nile aims to be CLI and GUI tool for managing and playing games from Amazon."
LICENSE = "GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "nile-1.2.0-1.2.noarch.rpm"
RPM_HASH = "5065c09bdaab17bf13c42943c7cde4b801fcc5abee7b7ba0c91df4c100fc75f40e9bd1634d47a20735cd78db40e4c19beab58d18314ee2bdfcf2a426c9a4bcc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nile \
python3.13dist-nile \
python3dist-nile"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-json5 \
python3-platformdirs \
python3-protobuf \
python3-pycryptodome \
python3-requests \
python3-zstandard"

inherit rpm
