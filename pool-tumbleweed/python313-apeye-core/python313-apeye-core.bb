SUMMARY = "Core (offline) functionality for the apeye library"
DESCRIPTION = "Core (offline) functionality for the apeye library."
LICENSE = "BSD-3-Clause"

PV = "1.1.5"

RPM_NAME = "python313-apeye-core-1.1.5-3.6.noarch.rpm"
RPM_HASH = "439223b55d639c6161f991f385c99c75193f84b956c7209e912362bc5aae217bbbf4066f009d86478f3ef099b531be05e281f679ae0cb5ce8d01f163c488b6c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apeye-core \
python3.13dist-apeye-core \
python313-apeye-core \
python3dist-apeye-core"

RDEPENDS:${PN} += "python-abi \
python313-domdf-python-tools \
python313-idna"

inherit rpm
