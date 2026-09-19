SUMMARY = "Reorder frames in the PDF file"
DESCRIPTION = "The package provides a method to reorder frames in the PDF file \
without reordering the source. Its principal use is to embed or \
append frames with details on some subject. The author \
describes the package as 'experimental'."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn23510"

RPM_NAME = "texlive-beamersubframe-2026.226.0.0.2svn23510-61.2.noarch.rpm"
RPM_HASH = "beb9b1d9963064d491f7afc9330471f76af2201c72009db757849beef2f771519aac2a2e2ac4d616bdad4072399c44f6d6e67a964ec98ca34f043971ada8ad18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamersubframe.sty \
texlive-beamersubframe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
