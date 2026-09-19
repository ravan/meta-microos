SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "Extension pack for Python Markdown"
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python313-mkdocs-material-extensions-1.3.1-2.10.noarch.rpm"
RPM_HASH = "67a1cb3aaeadb923a02467959102bacc6361e83e8e85384b718515a9892606bc16c9eedc002463a5a167c8f1bcde7fc49e5a980d548627d647623e10b1476291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-material-extensions \
python3.13dist-mkdocs-material-extensions \
python313-mkdocs-material-extensions \
python3dist-mkdocs-material-extensions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
