SUMMARY = "Provides the \\AtEndDvi command"
DESCRIPTION = "This package is unneeded and does nothing when used with a \
LaTeX format 2020-10-01 or newer as in this case the format \
provides the \\AtEndDvi command. For older formats it implements \
\\AtEndDvi, a counterpart to \\AtBeginDvi. The execution of its \
argument is delayed to the end of the document at the end of \
the last page. Thus \\special and \\write remain effective, \
because they are put into the last page. This is the main \
difference to \\AtEndDocument."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn78101"

RPM_NAME = "texlive-atenddvi-2026.226.1.5svn78101-60.2.noarch.rpm"
RPM_HASH = "45cdcedbb717ae24936394875c8e4147f7b875ab538a9e9bd8e066ec6043de700eb8dfd374f1219e896bc499b1760769114a0d182cc4cf3ba0cb23c8cbf13717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atenddvi-2019-12-11.sty \
tex-atenddvi.sty \
texlive-atenddvi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-zref-abspage.sty \
tex-zref-lastpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
