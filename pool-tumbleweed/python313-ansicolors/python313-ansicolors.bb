SUMMARY = "ANSI colors for Python"
DESCRIPTION = "Add ANSI colors and decorations to your strings."
LICENSE = "ISC"

PV = "1.1.8"

RPM_NAME = "python313-ansicolors-1.1.8-4.5.noarch.rpm"
RPM_HASH = "bbc2b1919fe96de94949a8bd1bf5bcaff2e834920ea9e6c25c965ece8db0c6eddede71afe62ad81c890d665e1455f62e2781c8f2982cde37b4141397b628b6e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansicolors \
python3.13dist-ansicolors \
python313-ansicolors \
python3dist-ansicolors"

RDEPENDS:${PN} += "python-abi"

inherit rpm
