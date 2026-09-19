SUMMARY = "Documentation for texlive-responsive"
DESCRIPTION = "This package includes the documentation for texlive-responsive"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1asvn76924"

RPM_NAME = "texlive-responsive-doc-2026.226.0.0.1asvn76924-60.4.noarch.rpm"
RPM_HASH = "ee068bace804f59449969c8eb0b017680aca7137ff27102475c00a421ec7fc33afea0f9dda877ec24a06f7cdbcad0fa4f41826140a89ec01e06914d7d22b0ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-responsive-doc"

RDEPENDS:${PN} += ""

inherit rpm
