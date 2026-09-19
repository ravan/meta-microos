SUMMARY = "Hatchling plugin to read project dependencies from requirements.txt"
DESCRIPTION = "Hatchling plugin to read project dependencies from requirements.txt"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python314-hatch-requirements-txt-0.4.1-4.5.noarch.rpm"
RPM_HASH = "ac71a6a5b204f16b97c0d987d0dce1bec193253ec1db69f2fd95bd3d78739714cbcf0ab3d1c5c0b61a6e3095989b38780905535cdaef3aa73d9005d05eef2f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hatch-requirements-txt \
python314-hatch-requirements-txt \
python3dist-hatch-requirements-txt"

RDEPENDS:${PN} += "python-abi \
python314-hatchling \
python314-packaging"

inherit rpm
