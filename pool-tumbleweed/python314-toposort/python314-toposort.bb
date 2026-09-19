SUMMARY = "Implements a topological sort algorithm"
DESCRIPTION = "Implements a topological sort algorithm."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "python314-toposort-1.10-2.12.noarch.rpm"
RPM_HASH = "d381f647cc619052c81b9257476af91705b122d5f9476a0342c03da4f1de639ca39888c0209c9ab52a34d6e21f1cd0ea3045822693d71ee3fb04d0d81c4e7eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-toposort \
python314-toposort \
python3dist-toposort"

RDEPENDS:${PN} += "python-abi"

inherit rpm
