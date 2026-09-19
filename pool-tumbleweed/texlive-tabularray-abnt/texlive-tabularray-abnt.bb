SUMMARY = "An ABNT (Brazilian standard) theme for tabularray"
DESCRIPTION = "This is the abnt Brazilian standard style for tabularray. It \
provides the themes abnt (for tables with numerical data) and \
quadro (for tables with text information). Additional \
environments abnttblr, tallabnttblr, and longabnttblr are \
wrappers to tblr, talltblr, and longtblr that apply the abnt \
theme automatically and permit to set the table font using \
\\SetAbntTblrFont{} provided here."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn76924"

RPM_NAME = "texlive-tabularray-abnt-2026.227.svn76924-62.2.noarch.rpm"
RPM_HASH = "7a944bff6fcb65a008ac0240157ac4dd414bfa9e61deb327fa59d06ef6a8691edd33222bd9fa2b2e90e493b8aeff9b48ba2bd90b105fbecf9ce6f77cd2d05ccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabularray-abnt-2025A.sty \
tex-tabularray-abnt.sty \
texlive-tabularray-abnt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-tabularray.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
