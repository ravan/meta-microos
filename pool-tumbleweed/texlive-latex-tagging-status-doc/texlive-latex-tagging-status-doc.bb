SUMMARY = "Documentation for texlive-latex-tagging-status"
DESCRIPTION = "This package includes the documentation for texlive-latex-tagging-status"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77788"

RPM_NAME = "texlive-latex-tagging-status-doc-2026.226.svn77788-63.2.noarch.rpm"
RPM_HASH = "d8829bf6a2368a4e735b41023618e294e10efe5698ab4436be1cfb1b4188b1ac91d9b6929ee8176337ec9602fef3dd3fc02dd002158dd9082c88de5182093d93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-tagging-status-doc"

RDEPENDS:${PN} += ""

inherit rpm
