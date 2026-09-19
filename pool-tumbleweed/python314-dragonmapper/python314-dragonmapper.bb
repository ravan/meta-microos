SUMMARY = "Identification and conversion functions for Chinese text processing"
DESCRIPTION = "Identification and conversion functions for Chinese text processing."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-dragonmapper-0.3.0-1.9.noarch.rpm"
RPM_HASH = "f116b31b28cfd88b830fc523e2d8e02685b338d25981f5c1d2a6641dd8f2ba889c4de0b8ba593ea755fa4cdd5ca31ce056bc5a92f46f5ae9d0f84d5173990a1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dragonmapper \
python314-dragonmapper \
python3dist-dragonmapper"

RDEPENDS:${PN} += "python-abi \
python314-hanzidentifier \
python314-zhon"

inherit rpm
