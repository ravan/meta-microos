SUMMARY = "Documentation how to Use mate-user-share"
DESCRIPTION = "This package contains the documentation for mate-user-share"
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-user-share-doc-1.28.0-2.4.noarch.rpm"
RPM_HASH = "3390404bf5d4bbded14a4c78149b9ffb93dcd9684918f2bcfd74dd853ef85f9367022a38cbf6b661373c398ff90e63dfc4e9db70c0decf45e3747b557dd33ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-user-share-doc"

RDEPENDS:${PN} += ""

inherit rpm
