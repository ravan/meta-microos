SUMMARY = "Typeset a dissertation cover page following UNSW guidelines"
DESCRIPTION = "The package an UNSW cover sheet following the 2011 GRS \
guidelines. It may also (optionally) provide other required \
sheets such as Originality, Copyright and Authenticity \
statements."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn66115"

RPM_NAME = "texlive-unswcover-2026.226.1.0svn66115-60.2.noarch.rpm"
RPM_HASH = "eafee585e180439d020604618cc9f890da46779b8f8010f90265f250e7d6e5e8fe9c9a847f348bc4683150c77c5061e701c198fb6cb2cc0d5f661e3663507940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unswcover.sty \
texlive-unswcover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-graphicx.sty \
tex-pdfpages.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
