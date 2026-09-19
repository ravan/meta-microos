SUMMARY = "Flake8 plugin that checks the ordering of import statements"
DESCRIPTION = "Flake8 and pylama plugin that checks the ordering of import statements."
LICENSE = "LGPL-3.0-only"

PV = "0.19.2"

RPM_NAME = "python314-flake8-import-order-0.19.2-1.2.noarch.rpm"
RPM_HASH = "5a81712485f2ef29ab9584e26676a456b9b63adbbfadb9139af5504ef3eaed6f9d2b7c27c16cdc83c30982af0669b25c39f38d5ff0104b150e4421951a95fb44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-import-order \
python314-flake8-import-order \
python3dist-flake8-import-order"

RDEPENDS:${PN} += "python-abi \
python314-flake8 \
python314-pycodestyle"

inherit rpm
