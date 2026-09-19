SUMMARY = "Documentation for texlive-fillwith"
DESCRIPTION = "This package includes the documentation for texlive-fillwith"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn76924"

RPM_NAME = "texlive-fillwith-doc-2026.226.0.0.3svn76924-59.2.noarch.rpm"
RPM_HASH = "1e986d6f6449f46ee35c34c4ff0a71611532fcbc4b365912af873727618afcfc1962f097679f270744806fde104c8f4585837431452272f28e4155253691e50f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fillwith-doc"

RDEPENDS:${PN} += ""

inherit rpm
