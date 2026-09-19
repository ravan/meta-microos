SUMMARY = "Community maintained hooks for PyInstaller"
DESCRIPTION = "Community maintained hooks for PyInstaller"
LICENSE = "Apache-2.0 | GPL-2.0-only"

PV = "2026.6"

RPM_NAME = "python314-pyinstaller-hooks-contrib-2026.6-1.1.noarch.rpm"
RPM_HASH = "379f9e27e8f26eb9b71721da9305efa57ba821de3efe119a088c498a9f35709be5dee068bbf0ac3726b564d3bb0e241e51e4f18f2d2d6b0caabf07c8dd39b15d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyinstaller-hooks-contrib \
python314-pyinstaller-hooks-contrib \
python3dist-pyinstaller-hooks-contrib"

RDEPENDS:${PN} += "python-abi \
python314-packaging \
python314-setuptools"

inherit rpm
