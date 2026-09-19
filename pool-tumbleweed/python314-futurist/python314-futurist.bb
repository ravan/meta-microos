SUMMARY = "Useful additions to futures, from the future."
DESCRIPTION = "Useful additions to futures, from the future."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python314-futurist-3.5.0-1.1.noarch.rpm"
RPM_HASH = "4fe293ecd2e55ad4731c5c6ea5087faf387a92e0429d31d04de37256fd64888591ac257b3baa9cff42c665597faab49cb5dd5958dee350e903542595c6f7811e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-futurist \
python314-futurist \
python3dist-futurist"

RDEPENDS:${PN} += "python-abi \
python314-debtcollector"

inherit rpm
