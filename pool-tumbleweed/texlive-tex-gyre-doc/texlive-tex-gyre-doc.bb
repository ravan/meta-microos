SUMMARY = "Documentation for texlive-tex-gyre"
DESCRIPTION = "This package includes the documentation for texlive-tex-gyre"
LICENSE = "LPPL-1.3c"

PV = "2026.227.2.501svn68624"

RPM_NAME = "texlive-tex-gyre-doc-2026.227.2.501svn68624-62.2.noarch.rpm"
RPM_HASH = "78e6a52a6d751ffbb9eee4f4f52a3fbc4a9656fe59c02c7df10874c3357f6213375dc9f3e216a402a6041717b6d4a12d0f7e661cec3866fe3e2d1ca098fa5a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-gyre-doc"

RDEPENDS:${PN} += ""

inherit rpm
