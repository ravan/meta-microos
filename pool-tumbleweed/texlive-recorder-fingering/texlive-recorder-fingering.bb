SUMMARY = "Package to display recorder fingering diagrams"
DESCRIPTION = "This package provides support for generating and displaying \
fingering diagrams for baroque fingering recorders and the tin \
whistle. Standard fingerings are provided for recorders in both \
C and F, and the tin whistle in D, along with methods to create \
and display alternate fingerings for trills, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn76924"

RPM_NAME = "texlive-recorder-fingering-2026.226.1.5svn76924-60.4.noarch.rpm"
RPM_HASH = "608253359464395add7f322a40af37623e5046fe10cd190901ac20ec9fde57cf6a6052ce1f6a83c57eec2efad2da0889eec99980baf539a4ce2d97d1524001b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-recorder-fingering.sty \
texlive-recorder-fingering"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
