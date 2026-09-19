SUMMARY = "A Python interface to the UNIX dialog utility and mostly-compatible programs"
DESCRIPTION = "Python wrapper for the UNIX 'dialog' utility \
Easy writing of graphical interfaces for terminal-based applications"
LICENSE = "LGPL-2.1-only"

PV = "3.5.3"

RPM_NAME = "python313-pythondialog-3.5.3-2.5.noarch.rpm"
RPM_HASH = "07e82dd6865b58ea94845e1b1cc9db5784dadc4dbf84f6ae5e87c7426ac6e93e4ea87b90be91384125e17ff9f3f4b4382beffec8425d369e11afa35437bf754d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pythondialog \
python3.13dist-pythondialog \
python313-pythondialog \
python3dist-pythondialog"

RDEPENDS:${PN} += "dialog \
python-abi"

inherit rpm
