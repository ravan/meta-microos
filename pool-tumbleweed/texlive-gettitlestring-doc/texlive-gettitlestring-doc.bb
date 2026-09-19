SUMMARY = "Documentation for texlive-gettitlestring"
DESCRIPTION = "This package includes the documentation for texlive-gettitlestring"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-gettitlestring-doc-2026.226.1.6svn77682-60.2.noarch.rpm"
RPM_HASH = "d25f89bf90d9b64ae3cd5cf67c6d7ede5f2d5135515b491eb89895d5766ed2aa476c02aecdb8ec751dbe626ad940bb44ea1fdf24348a3dc445d43466b07bf50a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gettitlestring-doc"

RDEPENDS:${PN} += ""

inherit rpm
