SUMMARY = "Support for submissions to the 'Beilstein Journal of Nanotechnology'"
DESCRIPTION = "The package provides a LaTeX class file and a BibTeX style file \
in accordance with the requirements of submissions to the \
``Beilstein Journal of Nanotechnology''. Although the files can \
be used for any kind of document, they have only been designed \
and tested to be suitable for submissions to the Beilstein \
Journal of Nanotechnology."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn56193"

RPM_NAME = "texlive-beilstein-2026.226.2.1svn56193-61.2.noarch.rpm"
RPM_HASH = "f010cda9d4cb6fd562b1bb7cda0cdd51f3b2588924dea860ef9802e1767898d2533a05152c53a93c2005d788c8824f7313917f70519fac468ce33b58d4ebf917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beilstein.cls \
texlive-beilstein"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-cleveref.sty \
tex-etoolbox.sty \
tex-flafter.sty \
tex-float.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-lineno.sty \
tex-longtable.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-newtxtt.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-tgheros.sty \
tex-url.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
