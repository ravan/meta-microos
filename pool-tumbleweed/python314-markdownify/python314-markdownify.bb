SUMMARY = "Convert HTML to markdown"
DESCRIPTION = "Convert HTML to markdown."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python314-markdownify-1.2.3-1.2.noarch.rpm"
RPM_HASH = "0f557886e12c394832d5ba94951fba6c6a6adf09b926536a39975e459a623a5a7b8ca34f8ffca0bd029562ff8ff35108ac85c2e864a3cf33f4f562944153a6b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-markdownify \
python314-markdownify \
python3dist-markdownify"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
python-abi \
python314-beautifulsoup4 \
python314-six"

inherit rpm
