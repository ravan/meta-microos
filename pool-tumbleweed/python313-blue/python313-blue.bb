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

PV = "0.9.1"

RPM_NAME = "python313-blue-0.9.1-7.5.noarch.rpm"
RPM_HASH = "15ff3d5ecc16440ef19acb2ba43f05d4f22c3fbdc89cae06f7bc154bcd184e129162ebfdcd30517036d2d7e997c8ed2df096046c7b38173394830465859b96b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-blue \
python3.13dist-blue \
python313-blue \
python3dist-blue"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-black"

inherit rpm
