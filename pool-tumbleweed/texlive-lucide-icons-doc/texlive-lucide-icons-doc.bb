SUMMARY = "Documentation for texlive-lucide-icons"
DESCRIPTION = "This package includes the documentation for texlive-lucide-icons"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn77188"

RPM_NAME = "texlive-lucide-icons-doc-2026.226.0.0.1.1svn77188-59.2.noarch.rpm"
RPM_HASH = "e7be75a882eea6e78cc9215da4cfa0efef690266d1f88f0e9da7356eef1f6648e782160cd7b40466bdd2a55da71b0c054605784a72eb491a0ab844afd900e0d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lucide-icons-doc"

RDEPENDS:${PN} += ""

inherit rpm
