SUMMARY = "Extension for flake8 which uses pydocstyle to check docstrings"
DESCRIPTION = "A module that adds an extension for the pydocstyle tool to flake8."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python314-flake8-docstrings-1.7.0-2.5.noarch.rpm"
RPM_HASH = "ce5e098fdf82e360e6fcf797539069214556fc6655d56169e84f443a9993df52d607977622bf2060051160d4fa10090a8178e1eff61fbd391ac58f9315cfa471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-docstrings \
python314-flake8-docstrings \
python3dist-flake8-docstrings"

RDEPENDS:${PN} += "python-abi \
python314-flake8 \
python314-flake8-polyfill \
python314-pydocstyle"

inherit rpm
