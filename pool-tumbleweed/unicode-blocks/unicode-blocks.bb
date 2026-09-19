SUMMARY = "Unicode Blocks Chart"
DESCRIPTION = "Blocks from the Unicode Character Database."
LICENSE = "Unicode-DFS-2016"

PV = "18.0.0"

RPM_NAME = "unicode-blocks-18.0.0-1.1.noarch.rpm"
RPM_HASH = "567da68c7836a7497d36a764fa2326cd7472d6d76d762a9dc5bab640ee46c3f53462a94d9d0401fef47a1e4b01a42307e020975522a46f30e689a5cbf66c34ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unicode-blocks"

RDEPENDS:${PN} += ""

inherit rpm
