SUMMARY = "Parser for 'pyproject.toml'"
DESCRIPTION = "Parser for 'pyproject.toml'"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python314-pyproject-parser-0.14.0-1.5.noarch.rpm"
RPM_HASH = "9ea0aa447af6c298babac4e466f9344ef6c118f46cbfca0bbb59de58901da233f39a67579f85e17d1301885b3a3cecf15c749afe0044b13ec73efd430597ee4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyproject-parser \
python314-pyproject-parser \
python3dist-pyproject-parser"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-apeye-core \
python314-attrs \
python314-dom-toml \
python314-domdf-python-tools \
python314-license-expression \
python314-natsort \
python314-packaging \
python314-shippinglabel \
python314-typing-extensions"

inherit rpm
