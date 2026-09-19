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

RPM_NAME = "python313-black-26.5.1-1.2.noarch.rpm"
RPM_HASH = "b1b1079090c663160f7f4794df66b69bcb9ca0f8d2cd2cbb951a5696282548ac1a6d25336172a2bf18b48b5f0883b720891aa827287a6a913556c796f7377ca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-black \
python3.13dist-black \
python313-black \
python3dist-black"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click \
python313-mypy-extensions \
python313-packaging \
python313-pathspec \
python313-platformdirs \
python313-pytokens"

inherit rpm
