SUMMARY = "Extended refactoring capabilities for Python LSP Server using Rope"
DESCRIPTION = "Extended refactoring capabilities for Python LSP Server using Rope. \
 \
This is a plugin for Python LSP Server."
LICENSE = "MIT"

PV = "0.1.17"

RPM_NAME = "python313-pylsp-rope-0.1.17-1.5.noarch.rpm"
RPM_HASH = "5598861aa4cdde3a3b4280e9a275993519416c4728136e4368099e5208e19e3cfa276a9b6477ae12d159a403aa5300e4e7de37f067fed8c2a347f865cb4443cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylsp-rope \
python3.13dist-pylsp-rope \
python313-pylsp-rope \
python3dist-pylsp-rope"

RDEPENDS:${PN} += "python-abi \
python313-python-lsp-server \
python313-rope"

inherit rpm
