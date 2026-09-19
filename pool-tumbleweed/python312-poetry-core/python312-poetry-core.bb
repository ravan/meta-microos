SUMMARY = "Poetry PEP 517 Build Backend"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "2.4.0"

RPM_NAME = "python312-poetry-core-2.4.0-2.1.noarch.rpm"
RPM_HASH = "dbf2a51f9b75e21908251303e7ec05e284dc64a6f31d6c6e0063b3538214873dc0d8787e799adc9e3e75ea15b125d82038bb6ff13ce52a5781b7ae33a8238e33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-poetry-core \
python312-poetry-core \
python3dist-poetry-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
