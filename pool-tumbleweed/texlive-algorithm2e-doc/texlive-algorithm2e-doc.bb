SUMMARY = "Documentation for texlive-algorithm2e"
DESCRIPTION = "This package includes the documentation for texlive-algorithm2e"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.2svn77682"

RPM_NAME = "texlive-algorithm2e-doc-2026.226.5.2svn77682-61.2.noarch.rpm"
RPM_HASH = "bfcb2974feb1fd248a9a339b37adcfa1f0cad2344f7410712379c2185e2672896814545f636c9a0b346fb5352c0cf0793a341515c070e2f82e0128f289d45639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algorithm2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
