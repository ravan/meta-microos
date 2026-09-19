SUMMARY = "Documentation for texlive-auto-pst-pdf"
DESCRIPTION = "This package includes the documentation for texlive-auto-pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-auto-pst-pdf-doc-2026.226.0.0.7svn77682-60.2.noarch.rpm"
RPM_HASH = "f8a658017712fdd280950ce8e5ec751eff194aed95e987d12496228e99760f55af36fe451504195e8cd8a1cc77438bb3700e254d2698914f21ff0564646b7b24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-auto-pst-pdf-doc-en \
texlive-auto-pst-pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
