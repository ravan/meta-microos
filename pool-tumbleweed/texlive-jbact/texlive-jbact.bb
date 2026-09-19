SUMMARY = "BibTeX style for biology journals"
DESCRIPTION = "The style is a development of apalike.bst in the BibTeX bundle. \
The style serves two journals -- if the user executes \
'\\nocite{TitlesOn}', the style serves for the Journal of \
Theoretical Biology; otherwise it serves for the Journal of \
Molecular Biology."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.30svn76790"

RPM_NAME = "texlive-jbact-2026.226.1.30svn76790-63.2.noarch.rpm"
RPM_HASH = "21053fc1ff98b3cf7d0cc1f9afc98be76f34d7855ba0f06dd6eb7d53173c06d7e4c397973da64e933ccc4ce250bc2f9a240852554c9b58c546e0398ebb1146cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jbact"

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
