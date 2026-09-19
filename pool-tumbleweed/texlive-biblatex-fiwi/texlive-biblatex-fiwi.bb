SUMMARY = "BibLaTeX styles for use in German humanities"
DESCRIPTION = "The package provides a collection of styles for BibLaTeX \
(version 3.5 is required, currently). It was designed for \
citations in German Humanities, especially film studies, and \
offers some features that are not provided by the standard \
BibLaTeX styles. The style is highly optimized for documents \
written in German, and the main documentation is only available \
in German."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn45876"

RPM_NAME = "texlive-biblatex-fiwi-2026.226.1.7svn45876-61.2.noarch.rpm"
RPM_HASH = "0b3a5272e280469f7d7b13740bd17df62dc88e9cd1d708d9916673fb2fb3bb3d3a94ba51cd807b4fef09f749238e4679c854fdf902913716d797fd409e5e1d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fiwi-yearbeginning.bbx \
tex-fiwi.bbx \
tex-fiwi.cbx \
tex-fiwi2.bbx \
tex-fiwi2.cbx \
texlive-biblatex-fiwi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ragged2e.sty \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
