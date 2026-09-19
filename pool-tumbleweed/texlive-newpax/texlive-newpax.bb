SUMMARY = "Experimental package to extract and reinsert PDF annotations"
DESCRIPTION = "The package is based on the pax package from Heiko Oberdiek. It \
offers a lua-based alternative to the java based pax.jar to \
extract the annotations from a PDF. The resulting file can then \
be used together with pax.sty. It also offers an extended style \
which works with all three major engines."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.57svn76924"

RPM_NAME = "texlive-newpax-2026.226.0.0.57svn76924-61.2.noarch.rpm"
RPM_HASH = "1435b0d712d4ec7af23cd33afaa21685b48809b051edc59a5bb084a03b8fc59a034eee18cf4af2012512888c1b1ae00bca6e254af522fac63770e8c9833a26c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newpax.sty \
texlive-newpax"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-pdfmanagement.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
