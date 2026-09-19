SUMMARY = "Extended refactoring capabilities for Python LSP Server using Rope"
DESCRIPTION = "Extended refactoring capabilities for Python LSP Server using Rope. \
 \
This is a plugin for Python LSP Server."
LICENSE = "MIT"

PV = "0.1.17"

RPM_NAME = "python314-pylsp-rope-0.1.17-1.5.noarch.rpm"
RPM_HASH = "1172ddaf52a87b1b5f188867996a45edbc8e5707e18068bfabe5ef91a222ccd2bd547990ae8791a61900ec25b907f873b72792c9507080cefefa06f15c6119b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pylsp-rope \
python314-pylsp-rope \
python3dist-pylsp-rope"

RDEPENDS:${PN} += "python-abi \
python314-python-lsp-server \
python314-rope"

inherit rpm
