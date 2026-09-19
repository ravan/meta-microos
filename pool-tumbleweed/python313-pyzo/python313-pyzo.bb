SUMMARY = "Python IDE for scientific computing"
DESCRIPTION = "Pyzo is a computing environment based on Python. Pyzo is a Python IDE \
aimed at interactivity, and consists of an editor, a shell, and a set \
of tools."
LICENSE = "BSD-3-Clause"

PV = "4.11.2"

RPM_NAME = "python313-pyzo-4.11.2-2.5.noarch.rpm"
RPM_HASH = "90356076565c617936730e4d044cb314584f95488391cd8eff94fdd50e7147ab162f11452c7158715cf3db7ec0b35f359554b19c046e6b37a7d9edac9af7e523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyzo \
python3.13dist-pyzo \
python313-pyzo \
python3dist-pyzo"

RDEPENDS:${PN} += "/usr/bin/env \
hicolor-icon-theme \
python-abi \
python313-qt5 \
pyzologo"

inherit rpm
