SUMMARY = "Python module for pysol-cards"
DESCRIPTION = "This module allows the python developer to generate the initial deals of some \
PySol FC games. It also supports PySol legacy deals and Microsoft FreeCell / \
Freecell Pro deals."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "python313-pysol-cards-0.24.0-1.4.noarch.rpm"
RPM_HASH = "d3201f61f4bd2cea693b379b8d10b04899e8bce0a74a4ed85c2424d6c7547ecadc32d4ecaf8aac9acaf98231f372deeec28d59e78889f2d76d5be4b1853716d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysol-cards \
python3.13dist-pysol-cards \
python313-pysol-cards \
python3dist-pysol-cards"

RDEPENDS:${PN} += "python-abi \
python313-random2"

inherit rpm
