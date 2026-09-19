SUMMARY = "Poetry PEP 517 Build Backend"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "2.4.0"

RPM_NAME = "python311-poetry-core-2.4.0-2.1.noarch.rpm"
RPM_HASH = "86595a6577450041877f1e739430fdd859f2b4ab028e1aa2d3150c22b76aee60bd62566521d0db0e1aa228d40d5ded61e4165c8fa23b1578376e91443d747931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-poetry-core \
python311-poetry-core \
python3dist-poetry-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
