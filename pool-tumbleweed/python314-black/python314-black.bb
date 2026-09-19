SUMMARY = "A code formatter written in, and written for Python"
DESCRIPTION = "Black is a code formatter written in Python, and reformats Python 2.x \
and 3.x code. \
 \
Black reformats entire files in place. It is not configurable. It \
does not take previous formatting into account. The coding style \
enforced is a PEP-8 subset, adheres to PEP-257, and otherwise passes \
the rules of the 'pycodestyle' checker. Black skips over blocks that \
start and end with '# fmt: off' and '# fmt: on', respectively. It \
also recognizes YAPF's block comments to the same effect."
LICENSE = "MIT"

PV = "26.5.1"

RPM_NAME = "python314-black-26.5.1-1.2.noarch.rpm"
RPM_HASH = "c32e69a8b8fafb30042cf48be5b0b2d99c648e1726678567e5a528c412fc9c39f5a44da7c0e3cd7ea89594c8e1fb397d379ac803d2a2ad0145bc313b68f92461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-black \
python314-black \
python3dist-black"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click \
python314-mypy-extensions \
python314-packaging \
python314-pathspec \
python314-platformdirs \
python314-pytokens"

inherit rpm
