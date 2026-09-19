SUMMARY = "Documentation for texlive-capt-of"
DESCRIPTION = "This package includes the documentation for texlive-capt-of"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-capt-of-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "4436a52831387eec929bc519846c7604fd77d2e31756a30559906628d4a379a7c3a04fe3f283c29f6e947231592748f20e42974c5285099765cdce309d036f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-capt-of-doc"

RDEPENDS:${PN} += ""

inherit rpm
