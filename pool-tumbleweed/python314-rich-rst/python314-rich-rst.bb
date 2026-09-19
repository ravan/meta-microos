SUMMARY = "A beautiful reStructuredText renderer for rich"
DESCRIPTION = "A beautiful and easy to use reStructuredText renderer for the rich \
library, to render RST documents in the terminal."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-rich-rst-2.1.0-1.1.noarch.rpm"
RPM_HASH = "7124cbf23de553b743b57ade35655b63c22669a5cbcbe22b0e9f4f231619fd7e96eac4f40f20745b88d168dffeccadcd52ed532e1a657852432802116f7d4f99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rich-rst \
python314-rich-rst \
python3dist-rich-rst"

RDEPENDS:${PN} += "python-abi \
python314-Pygments \
python314-rich"

inherit rpm
