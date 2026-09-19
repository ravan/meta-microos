SUMMARY = "Parser for 'pyproject.toml'"
DESCRIPTION = "Parser for 'pyproject.toml'"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python313-pyproject-parser-0.14.0-1.5.noarch.rpm"
RPM_HASH = "953c8b3da9c4f85db67cebacfc3892bc820605a5aa221d7c4f1cb9987b9262189305c544e2144a5913683b9b6352a48c798796845ff7acde52a7aba545f4111c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-parser \
python3.13dist-pyproject-parser \
python313-pyproject-parser \
python3dist-pyproject-parser"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-apeye-core \
python313-attrs \
python313-dom-toml \
python313-domdf-python-tools \
python313-license-expression \
python313-natsort \
python313-packaging \
python313-shippinglabel \
python313-typing-extensions"

inherit rpm
