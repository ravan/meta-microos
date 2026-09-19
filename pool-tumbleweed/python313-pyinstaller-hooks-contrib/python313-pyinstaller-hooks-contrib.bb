SUMMARY = "Community maintained hooks for PyInstaller"
DESCRIPTION = "Community maintained hooks for PyInstaller"
LICENSE = "Apache-2.0 | GPL-2.0-only"

PV = "2026.6"

RPM_NAME = "python313-pyinstaller-hooks-contrib-2026.6-1.1.noarch.rpm"
RPM_HASH = "42a5e003bf331979626f9de408a081b1ac85d007bbc532665de874c290ce224efb0d2bb39d77d1ca30ab94ffd34fb011d1a5f6460541db412fb6878230181f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyinstaller-hooks-contrib \
python3.13dist-pyinstaller-hooks-contrib \
python313-pyinstaller-hooks-contrib \
python3dist-pyinstaller-hooks-contrib"

RDEPENDS:${PN} += "python-abi \
python313-packaging \
python313-setuptools"

inherit rpm
