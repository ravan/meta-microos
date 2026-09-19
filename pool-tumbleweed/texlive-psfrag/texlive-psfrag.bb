SUMMARY = "Replace strings in encapsulated PostScript figures"
DESCRIPTION = "Allows LaTeX constructions (equations, picture environments, \
etc.) to be precisely superimposed over Encapsulated PostScript \
figures, using your own favorite drawing tool to create an EPS \
figure and placing simple text 'tags' where each replacement is \
to be placed, with PSfrag automatically removing these tags \
from the figure and replacing them with a user specified LaTeX \
construction, properly aligned, scaled, and/or rotated."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.04svn15878"

RPM_NAME = "texlive-psfrag-2026.226.3.04svn15878-59.2.noarch.rpm"
RPM_HASH = "80395b2c0cbb4c151652820bc5514e68a2415e9c75d0d7a64f9db0d97d8e8c5be7ccea395c09f5d735bcaecd6987c42081c16101d733519c757e7d6ab5e59724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-psfrag.sty \
texlive-psfrag"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
