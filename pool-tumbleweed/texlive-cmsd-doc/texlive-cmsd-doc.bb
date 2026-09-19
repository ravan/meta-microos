SUMMARY = "Documentation for texlive-cmsd"
DESCRIPTION = "This package includes the documentation for texlive-cmsd"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn18787"

RPM_NAME = "texlive-cmsd-doc-2026.226.svn18787-60.2.noarch.rpm"
RPM_HASH = "b5b744d615a47a0c6c8f0afa03088dd91f58ed04e125aefd6b52810010beda6802f5735e33656b5fd05a715cc97aef6c8b253aaa93aa4e624bd87b8277a4125e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmsd-doc"

RDEPENDS:${PN} += ""

inherit rpm
