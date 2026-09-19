SUMMARY = "TikZ provides graphical layers on TikZ: 'behind', 'above' and 'glass'"
DESCRIPTION = "TikZ-layers is a tiny package that provides, along side \
'background', typical graphical layers on TikZ: 'behind', \
'above' and 'glass'. The layers may be selected with one of the \
styles 'on behind layer', 'on above layer', 'on glass layer' as \
an option to a {scope} environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn46660"

RPM_NAME = "texlive-tikz-layers-2026.226.0.0.9svn46660-59.2.noarch.rpm"
RPM_HASH = "d75e0f08d71fc14be20f8e290293793204cd55d56b590bf361850c7ce68fd876d8b88ba9ea38514193a3d2f5f15dcf6ddc404a76c18e2ebb92538c026b66136b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-layers.sty \
texlive-tikz-layers"

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
