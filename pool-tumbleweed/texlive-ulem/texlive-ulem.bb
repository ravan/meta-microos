SUMMARY = "Package for underlining"
DESCRIPTION = "The package provides an \\ul (underline) command which will \
break over line ends; this technique may be used to replace \\em \
(both in that form and as the \\emph command), so as to make \
output look as if it comes from a typewriter. The package also \
offers double and wavy underlining, and striking out (line \
through words) and crossing out (/// over words). The package \
works with both Plain TeX and LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-ulem-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "7269a2ec9b8b4ab1a022ad38b5315c1cdfd9a16aa8393696f0e44fdbe09d57dcc2dfd0ccdab3a0b9ca26dfb8b9194f41a1b4c5b0d3897fddaef938f0453deacb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ulem.sty \
texlive-ulem"

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
