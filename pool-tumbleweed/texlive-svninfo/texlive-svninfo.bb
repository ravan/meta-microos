SUMMARY = "Typeset Subversion keywords"
DESCRIPTION = "A package for incorporating the values of Subversion keywords \
into typeset documents. Information about Subversion (a \
replacement for CVS) is available from the project's home site."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.4svn62157"

RPM_NAME = "texlive-svninfo-2026.226.0.0.7.4svn62157-64.2.noarch.rpm"
RPM_HASH = "16cb757e3bb1e2a96eae8e43ba7f6fb76e505fe13f44cba925535bcf4f13b3aa0eb7c342504860765ad8b622bdbb1cc0646032ad0365b4cf226a23ed4254cc7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svninfo.cfg \
tex-svninfo.sty \
texlive-svninfo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-fancyhdr.sty \
tex-fancyheadings.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
