SUMMARY = "Documentation for texlive-fancyhdr"
DESCRIPTION = "This package includes the documentation for texlive-fancyhdr"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.2svn78101"

RPM_NAME = "texlive-fancyhdr-doc-2026.226.5.2svn78101-59.2.noarch.rpm"
RPM_HASH = "67cdbf90c83dd377b91e92f3a877c58488bfcee59a57bab1aa46e2b85ba07c9e43af61cf94d1d7500dfe4a81f6dc300da24ca9d2398ccd11cf1cccfc82a98e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyhdr-doc"

RDEPENDS:${PN} += ""

inherit rpm
