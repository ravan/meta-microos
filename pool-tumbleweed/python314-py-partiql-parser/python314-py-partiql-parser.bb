SUMMARY = "Pure Python PartiQL Parser"
DESCRIPTION = "Pure Python PartiQL Parser"
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python314-py-partiql-parser-0.6.3-1.5.noarch.rpm"
RPM_HASH = "b4ac068f1bcbd130cf6ba4ee8a3dc6ab4415794ad783ee769414e2bb3d476e84bcdbb7f152eb73cf8f1ad56945181180007d43e50a8f92367518a69e45dcbeca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py-partiql-parser \
python314-py-partiql-parser \
python3dist-py-partiql-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
