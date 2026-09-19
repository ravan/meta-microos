SUMMARY = "Dodecaphonic diagrams: twelve-tone matrices, clock diagrams, etcetera"
DESCRIPTION = "This music-related package focuses on notation from the \
Twelve-Tone System, also called Dodecaphonism. It provides \
LaTeX algorithms to generate common dodecaphonic diagrams based \
off a musical series, or row sequence, of arbitrary length. The \
package requires TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn75201"

RPM_NAME = "texlive-ddphonism-2026.226.0.0.3svn75201-59.2.noarch.rpm"
RPM_HASH = "d9887ad46b08bcd3db17b99fab320d75ab4d58d750f702b52671a6abe38c5181327afd68f027577c7841f662aea272869eaa0d6d3e90f513aa0dca93ad3857b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ddphonism.sty \
texlive-ddphonism"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
