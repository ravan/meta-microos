SUMMARY = "Utilities for working with PO and POT files"
DESCRIPTION = "Dennis is a set of utilities for working with PO files. They \
translate POT files to find problems with localization in code, and \
lint PO files for common problems like variable formatting, \
mismatched HTML, missing variables, etc."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python314-dennis-1.3.0-1.1.noarch.rpm"
RPM_HASH = "0b1c6d19a12ce9249686a61b3c9351c5c318455eb941db1ed996f7960c700b62c72b92e8d0caeae9db6d32ccc4ed8ea7a8e74f2f1b482e7d8472b450f0aa6832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dennis \
python314-dennis \
python3dist-dennis"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click \
python314-polib"

inherit rpm
