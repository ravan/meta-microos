SUMMARY = "BibTeX implementation of China's bibliography style standard GB/T 7714-2015"
DESCRIPTION = "The package provides a BibTeX implementation for the Chinese \
national bibliography style standard GB/T 7714-2015. It \
consists of two bst files for numerical and author-year styles \
as well as a LaTeX package which provides the citation style \
defined in the standard. The package is compatible with natbib \
and supports language detection (Chinese and English) for each \
biblilography entry."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.9svn77401"

RPM_NAME = "texlive-gbt7714-2026.226.2.1.9svn77401-60.2.noarch.rpm"
RPM_HASH = "4ecee4c056a0afdda8a6da13999e0da6ba5959bef2ea34cac4e325fe0335b20b38b208fefb20d86375cde979317c9f44eaf25f4b073516d1f5baf285fb9260fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gbt7714.sty \
texlive-gbt7714"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-natbib.sty \
tex-url.sty \
texlive \
texlive-bibtex \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-natbib \
texlive-scripts \
texlive-scripts-bin \
texlive-url"

inherit rpm
