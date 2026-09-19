SUMMARY = "Tree macros"
DESCRIPTION = "The package lets you draw binary or ternary trees of any size."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71382"

RPM_NAME = "texlive-treesvr-2026.226.svn71382-59.2.noarch.rpm"
RPM_HASH = "4998e07b2c58cdaf73e3ffdbacf20775209feffc9278979973f9a49bb38e7000e27823663d4719a62cb713e8bb5874a61d0d3fc84309b92d7f12ff005db51cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trees.sty \
texlive-treesvr"

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
