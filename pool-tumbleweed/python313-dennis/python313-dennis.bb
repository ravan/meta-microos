SUMMARY = "Utilities for working with PO and POT files"
DESCRIPTION = "Dennis is a set of utilities for working with PO files. They \
translate POT files to find problems with localization in code, and \
lint PO files for common problems like variable formatting, \
mismatched HTML, missing variables, etc."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python313-dennis-1.3.0-1.1.noarch.rpm"
RPM_HASH = "7a0809a4b7197000e18ae29dd14711df46a2b3d9429ebfb8188337cf6736de97ae2f2292655f23faedd4131249483498c40edfd5202ac567423795fdb66ddeab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dennis \
python3.13dist-dennis \
python313-dennis \
python3dist-dennis"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click \
python313-polib"

inherit rpm
