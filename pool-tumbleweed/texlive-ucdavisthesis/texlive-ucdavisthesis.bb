SUMMARY = "A thesis/dissertation class for University of California at Davis"
DESCRIPTION = "The ucdavisthesis class is a LaTeX class that allows you to \
create a dissertation or thesis conforming to UC Davis \
formatting requirements as of April 2016."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn40772"

RPM_NAME = "texlive-ucdavisthesis-2026.226.1.3svn40772-59.2.noarch.rpm"
RPM_HASH = "d142b440885020cf83b6ff6a89816b6e825f04f2095954a4eaf71ef173c8ea078bdb4e499cd93eae18f652035f402a4c68698b280a903fa3f7e52387eaad377b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ucdavisthesis.cls \
tex-ucdthesis10.clo \
tex-ucdthesis11.clo \
tex-ucdthesis12.clo \
tex-ucdthesis13.clo \
texlive-ucdavisthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
