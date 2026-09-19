SUMMARY = "A string finder for XeTeX"
DESCRIPTION = "The package finds strings (e.g. (parts of) words or phrases) \
and manipulates them (apply any macro), thus turning each word \
or phrase into a possible command. It is written in plain XeTeX \
and should thus work with any format (it is known to work with \
LaTeX and ConTeXt). The main application for the moment is \
XeIndex, an automatic index for XeLaTeX, but examples are given \
of simple use to check spelling, count words, and highlight \
syntax of programming languages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-xesearch-2026.226.0.0.2svn77682-59.4.noarch.rpm"
RPM_HASH = "6a7de10bf4d8c357382f7aa44470f5248d69e3bacd4b8c9b22a307b162b360d4f61ae786266c1600cc0e9b5fd8d66ee824c9d8902dd5ebc09641fa2a390c8391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-xesearch.tex \
tex-xesearch.sty \
texlive-xesearch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
