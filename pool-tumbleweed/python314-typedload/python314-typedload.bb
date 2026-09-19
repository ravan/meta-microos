SUMMARY = "Load and dump data from json-like format into typed data structures"
DESCRIPTION = "Load and dump data from json-like format into typed data structures"
LICENSE = "GPL-3.0-only"

PV = "2.41"

RPM_NAME = "python314-typedload-2.41-1.2.noarch.rpm"
RPM_HASH = "38fb84de528eb30d567b0793184afffc3070133219fed7a1e92c7b6febbcef50b3f7014f05760e93dd7d33937021c71ae1c220537dc79da268b4116971a055ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-typedload \
python314-typedload \
python3dist-typedload"

RDEPENDS:${PN} += "python-abi"

inherit rpm
