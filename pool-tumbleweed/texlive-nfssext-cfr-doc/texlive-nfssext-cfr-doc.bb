SUMMARY = "Documentation for texlive-nfssext-cfr"
DESCRIPTION = "This package includes the documentation for texlive-nfssext-cfr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-nfssext-cfr-doc-2026.226.1.3svn77682-61.2.noarch.rpm"
RPM_HASH = "b66406bafcdd2eacd0cbe1be42e96af0316082555610786ce7aef11b019402ee4290e2662ae93effe96cf79d302f7ab4b7534f11c512bd7cd5d4c7f92d23d3a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nfssext-cfr-doc"

RDEPENDS:${PN} += ""

inherit rpm
