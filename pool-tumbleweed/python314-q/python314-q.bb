SUMMARY = "Quick-and-dirty debugging output for tired programmers"
DESCRIPTION = "Quick-and-dirty debugging output for tired programmers."
LICENSE = "Apache-2.0"

PV = "2.7"

RPM_NAME = "python314-q-2.7-2.9.noarch.rpm"
RPM_HASH = "86c56e853c08c08085a39333963df2a158d873f3ffe9f29b34435322aec4d31c15b1b9b2abeee1d91f864760d2a9c723d4c7f1ffca1346c34aae712774e176a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-q \
python314-q \
python3dist-q"

RDEPENDS:${PN} += "python-abi"

inherit rpm
