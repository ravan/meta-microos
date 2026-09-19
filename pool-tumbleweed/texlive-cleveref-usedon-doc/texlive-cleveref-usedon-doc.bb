SUMMARY = "Documentation for texlive-cleveref-usedon"
DESCRIPTION = "This package includes the documentation for texlive-cleveref-usedon"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.0svn70491"

RPM_NAME = "texlive-cleveref-usedon-doc-2026.226.0.0.4.0svn70491-60.2.noarch.rpm"
RPM_HASH = "27fa81137e1fe5f139a5740fd275983a537093ad40619c03d8593f06a382a2513f15c5d03a45e4a6142e7a83d68f6820b39e26b92dd6822c6876dc97bb239d7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cleveref-usedon-doc"

RDEPENDS:${PN} += ""

inherit rpm
