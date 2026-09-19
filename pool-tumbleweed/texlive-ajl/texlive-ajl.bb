SUMMARY = "BibTeX style for AJL"
DESCRIPTION = "Bibliographic style references in style of Australian Journal \
of Linguistics."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-ajl-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "6efb498f3dfc09b4684dfd61bd5edce90919ac6295227b8f725b3cd648e14009432e0814ed94fccebce348c08a7b6f2fc6660a13cafde11211eecb64ca286639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ajl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
