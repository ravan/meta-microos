SUMMARY = "Documentation for texlive-mycv"
DESCRIPTION = "This package includes the documentation for texlive-mycv"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.6svn26807"

RPM_NAME = "texlive-mycv-doc-2026.226.1.5.6svn26807-61.2.noarch.rpm"
RPM_HASH = "339a568d1cb4f3f48d218102ef1540cb928aad570f3258948795c116de0285a719793e90206125bdd9dfabcf41a55cbfe36a022aa3f22587cc66be2723ae699b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mycv-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
