SUMMARY = "PostScript picture support"
DESCRIPTION = "A replacement for LaTeX's picture macros, that uses PostScript \
\\special commands. The package is now largely superseded by \
pict2e."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-pspicture-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "2c30c433bbc4c8e27bcba80eafecd807a3d2fe6fb5622e6e4b8ad347202e1a67baa56048a1cfe2a8b31c2a194f5662758f6348ccd6fe2ec32ad7e866747df47b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pspicture.sty \
texlive-pspicture"

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
