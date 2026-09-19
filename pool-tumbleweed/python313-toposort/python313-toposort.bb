SUMMARY = "Implements a topological sort algorithm"
DESCRIPTION = "Implements a topological sort algorithm."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "python313-toposort-1.10-2.12.noarch.rpm"
RPM_HASH = "815cf448007e11ea85c838340c3252dfbf285c0c1c0192933b15c31488ce14a62a420ea2122619ba925f28f59e29924513774fe5601c81cd8c3fd6f4666375b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-toposort \
python3.13dist-toposort \
python313-toposort \
python3dist-toposort"

RDEPENDS:${PN} += "python-abi"

inherit rpm
