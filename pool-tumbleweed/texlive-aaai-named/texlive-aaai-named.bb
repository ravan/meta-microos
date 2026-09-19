SUMMARY = "BibTeX style for AAAI"
DESCRIPTION = "A BibTeX style derived from the standard master, presumably for \
use with the aaai package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-aaai-named-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "4fcf03adf86648c2a200e62df68114ca863f5a0866ef6d0770b263ffce78e7ce11b6670232b80a544f1b90d595f5ba81898ce1dc2b284df801e0c4b47b35d44e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aaai-named"

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
