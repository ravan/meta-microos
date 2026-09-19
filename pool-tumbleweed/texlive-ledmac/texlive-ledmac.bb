SUMMARY = "Typeset scholarly editions"
DESCRIPTION = "A macro package for typesetting scholarly critical editions. \
The ledmac package is a LaTeX port of the plain TeX EDMAC \
macros. It supports indexing by page and line number and simple \
tabular- and array-style environments. The package is \
distributed with the related ledpar and ledarab packages. The \
package is now superseded by reledmac."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19.4svn41811"

RPM_NAME = "texlive-ledmac-2026.226.0.0.19.4svn41811-61.2.noarch.rpm"
RPM_HASH = "1489cce1fbe2146634b2563dc647f809ea57396cc60beca17d13d19575c21718c4c8d1155391276f1a354cecf17dd9420b860d67235458dae66a735f349a6ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-afoot.sty \
tex-ledarab.sty \
tex-ledmac.sty \
tex-ledpar.sty \
texlive-ledmac"

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
