SUMMARY = "Hyper extensions for doc.sty"
DESCRIPTION = "This package adds hypertext features to the package doc that is \
used in the documentation system of LaTeX2e. Bookmarks are \
added and references are linked as far as possible."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.19svn68661"

RPM_NAME = "texlive-hypdoc-2026.226.1.19svn68661-60.2.noarch.rpm"
RPM_HASH = "945bae1654f9f21f3c0ae45eee6dc11b8aa7c759cdc45681472092e8cec77e3b6c51a7340f6aaf632be89a8b654f274992d82a002c9b42f0da63893de8ba1590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hypdoc.sty \
texlive-hypdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-calc.sty \
tex-doc.sty \
tex-rerunfilecheck.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
