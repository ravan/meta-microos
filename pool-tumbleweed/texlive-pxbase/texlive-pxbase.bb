SUMMARY = "Tools for use with (u)pLaTeX"
DESCRIPTION = "The main purpose of this package is to provide auxiliary \
functions which are utilized by other packages created by the \
same author. It also provides a few user commands to assist in \
creating Japanese documents using (u)pLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-pxbase-2026.226.1.4svn77682-60.4.noarch.rpm"
RPM_HASH = "6dce288820e0aff81c645bdf9492e496fd172c64a8016d8b256be600ee59864eb9e6490cd578d70d36744c191b24dffd09f8c4f0c0e829f60f559bade3d7fb1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxbabel.sty \
tex-pxbase.def \
tex-pxbase.sty \
tex-pxbasenc.def \
tex-pxbsjc.def \
tex-pxbsjc1.def \
tex-pxjsfenc.def \
tex-upkcat.sty \
texlive-pxbase"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-bxbase.sty \
tex-ifptex.sty \
tex-ifuptex.sty \
tex-rlbabel.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
