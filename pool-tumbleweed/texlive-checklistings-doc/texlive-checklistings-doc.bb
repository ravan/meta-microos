SUMMARY = "Documentation for texlive-checklistings"
DESCRIPTION = "This package includes the documentation for texlive-checklistings"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn38300"

RPM_NAME = "texlive-checklistings-doc-2026.226.1.0svn38300-60.2.noarch.rpm"
RPM_HASH = "d9fbc62ca7dc15b0b06e8d1891bf7eebbdfaf3bdb0df5f30ac2cb3062b8edd94339b0ad84973b3735e58c699a9ebaab977bd5ca43bf72b2ab5e1c49eceaae4a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-checklistings-doc"

RDEPENDS:${PN} += ""

inherit rpm
