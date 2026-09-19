SUMMARY = "Some handy archive helpers for Python"
DESCRIPTION = "Some handy archive helpers for Python."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python314-handy-archives-0.2.0-6.4.noarch.rpm"
RPM_HASH = "076a71106f9b547efd957fbc04236f62e7d4f0c197c6179cdb4b4544aad9274b0e196ad2df8718abb6e6dc56a9a20a8d6663d64d8c45c5659157b2d86bb34ac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-handy-archives \
python314-handy-archives \
python3dist-handy-archives"

RDEPENDS:${PN} += "python-abi"

inherit rpm
