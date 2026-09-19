SUMMARY = "Typeset fiction, non-fiction and mathematical books"
DESCRIPTION = "The memoir class is for typesetting poetry, fiction, \
non-fiction, and mathematical works. Permissible document \
'base' font sizes range from 9 to 60pt. There is a range of \
page-styles and well over a dozen chapter-styles to choose \
from, as well as methods for specifying your own layouts and \
designs. The class also provides the functionality of over \
thirty of the more popular packages, thus simplifying document \
sources. Users who wish to use the hyperref package, in a \
document written with the memoir class, should also use the \
memhfixc package (part of this bundle). Note, however, that any \
current version of hyperref actually loads the package \
automatically if it detects that it is running under memoir."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.8.4bsvn77682"

RPM_NAME = "texlive-memoir-2026.226.3.8.4bsvn77682-59.2.noarch.rpm"
RPM_HASH = "0ff2050d1c1126ba61fdc0428502c45ff32a7fa5fda6a633cf312b38479b485f1d1a72837828d3bfa1e1a4e6dbb351e6f02f5b39f12ace06aff0001d9f9b16b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mem10.clo \
tex-mem11.clo \
tex-mem12.clo \
tex-mem14.clo \
tex-mem17.clo \
tex-mem20.clo \
tex-mem25.clo \
tex-mem30.clo \
tex-mem36.clo \
tex-mem48.clo \
tex-mem60.clo \
tex-mem9.clo \
tex-memhfixc.sty \
tex-memoir.cls \
texlive-memoir"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-booktabs.sty \
tex-dcolumn.sty \
tex-delarray.sty \
tex-fontenc.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-nameref.sty \
tex-shortvrb.sty \
tex-tabularx.sty \
tex-verbatim.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
