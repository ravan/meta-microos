SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "Extension pack for Python Markdown"
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python314-mkdocs-material-extensions-1.3.1-2.10.noarch.rpm"
RPM_HASH = "9094e0281dc10567e89b375b709c7b7e69c8cc2fbe472aa905d224df41f8818bcfa9b00bbd4871bc0d0f115703b3c2f8f65c506c4cd111f310333d56849aa129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mkdocs-material-extensions \
python314-mkdocs-material-extensions \
python3dist-mkdocs-material-extensions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
