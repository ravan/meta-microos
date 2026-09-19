SUMMARY = "ANSI colors for Python"
DESCRIPTION = "Add ANSI colors and decorations to your strings."
LICENSE = "ISC"

PV = "1.1.8"

RPM_NAME = "python314-ansicolors-1.1.8-4.5.noarch.rpm"
RPM_HASH = "4c6e6dcabec55abc9b5b009ec8e2a13e2db0ebc5febdf569af22abc1139e8758d89eca8f9e2adb7758d0d21e98c1dc0d53047f8574eb2f38540a856994ab065b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ansicolors \
python314-ansicolors \
python3dist-ansicolors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
