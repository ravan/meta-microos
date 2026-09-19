SUMMARY = "User-Interface tools (mainly command-line)"
DESCRIPTION = "User-Interface tools (mainly command-line)"
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python313-jaraco.ui-2.4.0-2.5.noarch.rpm"
RPM_HASH = "d23e3b8e063a40b5cb4d2533a1027906262f3da843fc137fab8537f65dbf871c7b77c9d3b4e11d8afbccfe46e3de2a8dfa73a10ea6d4f980f0cdca9c23efcc36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.ui \
python3.13dist-jaraco.ui \
python313-jaraco.ui \
python3dist-jaraco.ui"

RDEPENDS:${PN} += "python-abi \
python313-jaraco.classes \
python313-jaraco.text \
python313-named \
python313-typer"

inherit rpm
