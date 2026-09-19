SUMMARY = "Style for Universidad Nacional Autonoma de Mexico theses"
DESCRIPTION = "The package provides a customisable format to typeset Theses \
according to the Universidad Nacional Autonoma de Mexico \
guidelines. Support for use in Scientific Workplace (SWP) 3.x \
is also provided. The bundle also includes an appropriate \
bibliographic style which enables the use of author-year \
schemes using the natbib package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn43639"

RPM_NAME = "texlive-unamthesis-2026.226.2.1svn43639-60.2.noarch.rpm"
RPM_HASH = "cabfa8b4f4989d322025f7d798ecf51f3a62636559789e3d79761506cf4ae5c9dea1e75f5a84bf2b62c333cdf2c95b86ae2cf24bbb974bd9063d687382aeed76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UNAMThesis.sty \
texlive-unamthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
