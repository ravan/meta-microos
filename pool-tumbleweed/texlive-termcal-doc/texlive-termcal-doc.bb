SUMMARY = "Documentation for texlive-termcal"
DESCRIPTION = "This package includes the documentation for texlive-termcal"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.8svn76924"

RPM_NAME = "texlive-termcal-doc-2026.227.1.8svn76924-62.2.noarch.rpm"
RPM_HASH = "af76df62431c20b73f78ac09f5457ff4ce6a848ac635d0f0e89f53d59770456f42030bdda1e450468d7da56ccd08dd9af39fbe7c357fa756d0cdc036b8369a02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termcal-doc"

RDEPENDS:${PN} += ""

inherit rpm
