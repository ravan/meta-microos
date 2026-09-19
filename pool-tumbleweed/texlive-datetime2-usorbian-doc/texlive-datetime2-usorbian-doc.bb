SUMMARY = "Documentation for texlive-datetime2-usorbian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-usorbian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn52375"

RPM_NAME = "texlive-datetime2-usorbian-doc-2026.226.1.1svn52375-59.2.noarch.rpm"
RPM_HASH = "bf2f7779ca813fc37ea6b8b69451645c2b241a16d8b402aa6716cd316e84c89ebb317b7ba6269bee96446ae6ea96ad8f2d3c75e7d97639376cb8766f1f52a134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-usorbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
