SUMMARY = "Documentation for texlive-genealogy-profiles"
DESCRIPTION = "This package includes the documentation for texlive-genealogy-profiles"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77110"

RPM_NAME = "texlive-genealogy-profiles-doc-2026.226.svn77110-60.2.noarch.rpm"
RPM_HASH = "f9a70ff3ead35bb6860b3b2a8ceb19dfccebbe173547ebea3ebd20ed54e8930ffbeff3be6d13a2e9d64856f6bfc352cad71fe0360271801a8c2cdfd2e589dff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-genealogy-profiles-doc"

RDEPENDS:${PN} += ""

inherit rpm
