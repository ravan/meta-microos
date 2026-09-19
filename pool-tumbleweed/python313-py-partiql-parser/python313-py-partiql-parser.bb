SUMMARY = "Pure Python PartiQL Parser"
DESCRIPTION = "Pure Python PartiQL Parser"
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python313-py-partiql-parser-0.6.3-1.5.noarch.rpm"
RPM_HASH = "ceff393ad5f17297de53608c2bede62bad7b7f0836a5ec9f972ddaafcdfa3b1bedd35bb9a01d57677a03548e2c5a122d219a3b996a87f7ba5ba7f872d5061742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-partiql-parser \
python3.13dist-py-partiql-parser \
python313-py-partiql-parser \
python3dist-py-partiql-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
