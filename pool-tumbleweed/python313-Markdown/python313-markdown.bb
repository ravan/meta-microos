SUMMARY = "Python implementation of Markdown"
DESCRIPTION = "This is a Python implementation of John Gruber's [Markdown][]. \
It is almost completely compliant with the reference implementation, \
though there are a few known issues. See [Features][] for information \
on what exactly is supported and what is not. Additional features are \
supported by the [Available Extensions][]."
LICENSE = "BSD-3-Clause"

PV = "3.10.3"

RPM_NAME = "python313-Markdown-3.10.3-1.1.noarch.rpm"
RPM_HASH = "0b8edb267abbbd60dc96a5d9af3711d14bdb1737620322aafb7ed42151cf5cb3bb309d7145a60eeb076c214799a5e2a06e5d4d2c2da66ba1e17b277f50a1145e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Markdown \
python3.13dist-markdown \
python313-Markdown \
python3dist-markdown"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
