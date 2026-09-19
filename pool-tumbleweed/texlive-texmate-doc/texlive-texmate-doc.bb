SUMMARY = "Documentation for texlive-texmate"
DESCRIPTION = "This package includes the documentation for texlive-texmate"
LICENSE = "LPPL-1.0"

PV = "2026.227.2svn78101"

RPM_NAME = "texlive-texmate-doc-2026.227.2svn78101-62.2.noarch.rpm"
RPM_HASH = "8d85a23036ddeaafee9239ebd15c91bd9568b62231074375a233f9e8b278edec90681e4e670b095b1b4fe204fcf9d763448b18ffdefb0736fd33f987fccd3917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texmate-doc"

RDEPENDS:${PN} += ""

inherit rpm
