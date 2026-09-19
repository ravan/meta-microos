SUMMARY = "Fixed-font code blocks formatted nicely"
DESCRIPTION = "This LaTeX package helps you write source code in your academic \
papers and make it looks neat. It uses listings and tcolorbox, \
configuring them the right way, to ensure that code fragments \
and code blocks look nicer."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11.0svn75716"

RPM_NAME = "texlive-ffcode-2026.226.0.0.11.0svn75716-59.2.noarch.rpm"
RPM_HASH = "7bbc9ece17faa92dee1c6ce1d3be190e4d6e00befc0e7b1b3bb92d07210fa3bae1e5d6afe181e24a7e98d39ff575e5f1e8b0c4e8d61b43081b74b60a9a529df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ffcode.sty \
texlive-ffcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyvrb.sty \
tex-listings.sty \
tex-pgfopts.sty \
tex-tcolorbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-listings \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin \
texlive-tcolorbox"

inherit rpm
