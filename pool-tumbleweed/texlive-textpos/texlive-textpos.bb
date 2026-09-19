SUMMARY = "Place boxes at arbitrary positions on the LaTeX page"
DESCRIPTION = "A package to facilitate the placement of boxes at absolute \
positions on the LaTeX page. There are several reasons why this \
might be useful, one important example being to help the \
creation of large-format conference posters."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.10.1svn77682"

RPM_NAME = "texlive-textpos-2026.227.1.10.1svn77682-62.2.noarch.rpm"
RPM_HASH = "fe6a6d7020fd1f036c8e7dcea7ff4f93874a287cb1c0b548520b9fc45e6935b2511e7d2a0e82fe2de56458916a2710b09e36d38122be91dd634a4e1d6bee539d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textpos.sty \
texlive-textpos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everyshi.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
