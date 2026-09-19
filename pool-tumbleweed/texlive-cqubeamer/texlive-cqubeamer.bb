SUMMARY = "LaTeX Beamer Template for Chongqing University"
DESCRIPTION = "This package provides a LaTeX beamer template designed for \
researchers of Chongqing University. It can be used for \
academic reports, conferences, or thesis defense, and can be \
helpful for delivering a speech. It should be used with the \
XeTeX engine."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn54512"

RPM_NAME = "texlive-cqubeamer-2026.226.1.0svn54512-61.2.noarch.rpm"
RPM_HASH = "3e68471e5a99349cf0407e5b2d69661b41083474c7ffdb33adf7415ecf04260de6008d7c0cc7feae85089250e1a5937fdd3473b55a8c9206384f47aaaa929fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cqubeamer.sty \
texlive-cqubeamer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bookmark.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
