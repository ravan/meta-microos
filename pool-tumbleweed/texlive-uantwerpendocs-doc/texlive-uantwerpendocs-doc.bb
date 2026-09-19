SUMMARY = "Documentation for texlive-uantwerpendocs"
DESCRIPTION = "This package includes the documentation for texlive-uantwerpendocs"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.11svn76924"

RPM_NAME = "texlive-uantwerpendocs-doc-2026.226.4.11svn76924-59.2.noarch.rpm"
RPM_HASH = "de43c8041004ba7dd5c3c3f71888fdf13d039bb6ca3b353000964e4a1e107b1f7c93783627a280805d12af483345323f2a2047daa437e4e9eedfd86198404f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uantwerpendocs-doc"

RDEPENDS:${PN} += ""

inherit rpm
