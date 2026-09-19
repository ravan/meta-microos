SUMMARY = "Documentation for texlive-sort-by-letters"
DESCRIPTION = "This package includes the documentation for texlive-sort-by-letters"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-sort-by-letters-doc-2026.226.svn76790-64.2.noarch.rpm"
RPM_HASH = "dbccee97dbcbae8c2a6c92b0d2e5175e1f84aa501016ff54058f1c806857915b83f0bc4c8db8b2fcbbf2026729adc9a1fe77a1a5eec0127190101918bb91752f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sort-by-letters-doc"

RDEPENDS:${PN} += ""

inherit rpm
