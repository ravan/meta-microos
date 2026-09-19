SUMMARY = "Library that versions your Python projects"
DESCRIPTION = "Incremental is a small library that versions your Python projects."
LICENSE = "MIT"

PV = "24.11.0"

RPM_NAME = "python314-incremental-24.11.0-1.3.noarch.rpm"
RPM_HASH = "1746b6da98cb14e2055f9f05d498f5fc7fcb372bce08422bdfd1ed3551096daff7437739db37c4807531922d8f83fe1401178bedfeae09821da256df50f774e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-incremental \
python314-incremental \
python3dist-incremental"

RDEPENDS:${PN} += "python-abi \
python314-packaging"

inherit rpm
