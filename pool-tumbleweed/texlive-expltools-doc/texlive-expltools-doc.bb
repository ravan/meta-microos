SUMMARY = "Documentation for texlive-expltools"
DESCRIPTION = "This package includes the documentation for texlive-expltools"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77605"

RPM_NAME = "texlive-expltools-doc-2026.226.svn77605-59.2.noarch.rpm"
RPM_HASH = "29f6b844a13efd859f7b914e9ce38db68ee860115c46f0c2d3150f53bdf3d7c9a102c6cbdea5625dfc570cfe5cd696daaca93e0fb7bb4191d9788548d62772ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expltools-doc"

RDEPENDS:${PN} += ""

inherit rpm
