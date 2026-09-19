SUMMARY = "Prevent paragraph indentation after environments or macros"
DESCRIPTION = "The package, as the name suggests, supplies tools to \
automatically suppress indentations in following paragraphs, \
specifically those following a particular macro or environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn59195"

RPM_NAME = "texlive-noindentafter-2026.226.1.00svn59195-61.2.noarch.rpm"
RPM_HASH = "e97c7a02b6651255af3c4b4e85ab5643e8826c93b51c8bc8b6a53cd7e490291e607ce963599ef23f38893b02596dc5a229f4d99e91cde06f03ed549536d4d83d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-noindentafter.sty \
texlive-noindentafter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
