SUMMARY = "Math extension for Python-Markdown"
DESCRIPTION = "This extension adds math formulas support to Python-Markdown."
LICENSE = "BSD-3-Clause"

PV = "0.9"

RPM_NAME = "python314-python-markdown-math-0.9-1.5.noarch.rpm"
RPM_HASH = "270eb09707d798eb25568c7a843da424d3679ffae5a7a0086aee94315967f7d36ff749a4e485407dc7b4cc300cdd12b2b3ecf27aede43db223b4757408f31098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-markdown-math \
python314-markdown-math \
python314-python-markdown-math \
python3dist-python-markdown-math"

RDEPENDS:${PN} += "python-abi \
python314-Markdown"

inherit rpm
