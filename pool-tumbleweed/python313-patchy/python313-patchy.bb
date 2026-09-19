SUMMARY = "Patch the inner source of python functions at runtime"
DESCRIPTION = "Patch the inner source of python functions at runtime."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python313-patchy-3.1.0-1.1.noarch.rpm"
RPM_HASH = "3809eb51a8986e56299bb7f540aea51f5b715e9ab6870bf95b468117fbfd662bc16de8a07c7589b968542b2a49ca429069d01b548dc1159120d1c7b5f8a3951d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-patchy \
python3.13dist-patchy \
python313-patchy \
python3dist-patchy"

RDEPENDS:${PN} += "python-abi \
python313-unipatch"

inherit rpm
