SUMMARY = "Typeset scholarly editions"
DESCRIPTION = "A package for typesetting scholarly critical editions, \
replacing the established ledmac package. Ledmac itself was a \
LaTeX port of the plain TeX EDMAC macros. The package supports \
indexing by page and by line numbers, and simple tabular- and \
array-style environments. The package is distributed with the \
related eledpar package. The package is now superseded by \
reledmac."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.24.12svn45418"

RPM_NAME = "texlive-eledmac-2026.226.1.24.12svn45418-61.4.noarch.rpm"
RPM_HASH = "c0f3499ca51b0b54356302e214b132ced44f3ee3a8a5492fe49bffa7b5d1924bc903c4f3dccdcbde580ed508d73aea6cc84be9cdc7edecaef6c7ab0e23411e57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eledmac.sty \
tex-eledpar.sty \
texlive-eledmac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-etoolbox.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-ragged2e.sty \
tex-suffix.sty \
tex-xargs.sty \
tex-xkeyval.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
