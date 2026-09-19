SUMMARY = "Place footnotes at the end"
DESCRIPTION = "Accumulates notes (using the \\endnote command, which can be \
used as a replacement for \\footnote), and places them at the \
end of the section, chapter or document."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-endnotes-2026.226.svn77682-61.4.noarch.rpm"
RPM_HASH = "b097a8b09fc95908ab716be8aabe81bd006453f8b0bd629d25f3625cf0847bb51d16ec0078be70a5b4ee714a2dc50eb7c0f5c4e52980450006026c6b11860f31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endnotes.sty \
texlive-endnotes"

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
