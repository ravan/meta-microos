SUMMARY = "Python module to handle standardized numbers and codes"
DESCRIPTION = "This library offers functions for parsing, validating and reformatting \
standard numbers and codes in various formats. \
 \
Apart from the validate() function, modules generally provide extra \
parsing, validation, formatting or conversion functions."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2"

RPM_NAME = "python314-python-stdnum-2.2-1.2.noarch.rpm"
RPM_HASH = "88b646abe59486db199780275abff61714a8a608b4b56adb214bf2e1108a676bb88a5c169ed13f6d7aa7f8b5ff1b3833a5fdc6241befa3a31a3ef7c0efcbe1da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-stdnum \
python314-python-stdnum \
python3dist-python-stdnum"

RDEPENDS:${PN} += "python-abi"

inherit rpm
