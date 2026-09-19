SUMMARY = "Documentation for texlive-c90"
DESCRIPTION = "This package includes the documentation for texlive-c90"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn60830"

RPM_NAME = "texlive-c90-doc-2026.226.svn60830-59.2.noarch.rpm"
RPM_HASH = "c6a02813ea725a173732494a92fb21f16d754cc0a1e0f599e9833b0e501b44edaaf1cc978736594b107d1f68815d8a4f0684bdef4722d80ba609c5f570c398f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-c90-doc"

RDEPENDS:${PN} += ""

inherit rpm
