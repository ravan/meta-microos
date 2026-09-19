SUMMARY = "Patch the inner source of python functions at runtime"
DESCRIPTION = "Patch the inner source of python functions at runtime."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python314-patchy-3.1.0-1.1.noarch.rpm"
RPM_HASH = "4e2a85af4b342c3e173154c15058ef1a3ba65b8937cf17d2439c552b5eabd1511f8ec739b75274832e0a8534eae8f9e8fc16a01031185bdc3cf01d99550045f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-patchy \
python314-patchy \
python3dist-patchy"

RDEPENDS:${PN} += "python-abi \
python314-unipatch"

inherit rpm
