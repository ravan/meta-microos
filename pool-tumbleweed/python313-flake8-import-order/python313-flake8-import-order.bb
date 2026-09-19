SUMMARY = "Flake8 plugin that checks the ordering of import statements"
DESCRIPTION = "Flake8 and pylama plugin that checks the ordering of import statements."
LICENSE = "LGPL-3.0-only"

PV = "0.19.2"

RPM_NAME = "python313-flake8-import-order-0.19.2-1.2.noarch.rpm"
RPM_HASH = "1200d9abf3208001ebf39204b8dcb0ab9b74c442d6e2f5a7382f8079eaa862fd8b3d51384f54300e7983656b3d4604bd5d62455e581945d3693cf164d485172a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-import-order \
python3.13dist-flake8-import-order \
python313-flake8-import-order \
python3dist-flake8-import-order"

RDEPENDS:${PN} += "python-abi \
python313-flake8 \
python313-pycodestyle"

inherit rpm
