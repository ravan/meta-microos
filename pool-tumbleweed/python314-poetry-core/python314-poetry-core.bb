SUMMARY = "Poetry PEP 517 Build Backend"
DESCRIPTION = "A PEP 517 build backend implementation developed for Poetry. This project is \
intended to be a light weight, fully compliant, self-contained package allowing \
PEP 517 compatible build frontends to build Poetry managed projects."
LICENSE = "Apache-2.0 & BSD-2-Clause & MIT & Python-2.0"

PV = "2.4.0"

RPM_NAME = "python314-poetry-core-2.4.0-2.1.noarch.rpm"
RPM_HASH = "968cad639b3ffde692146045d99cba73f8a27d2216a09d0fbda86d8d7c1710689d04448ce4e0a3f541950a630f229df802bc37ba871130c03ac604259f1706f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-poetry-core \
python314-poetry-core \
python3dist-poetry-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
