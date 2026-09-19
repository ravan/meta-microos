SUMMARY = "Horizontal and columned lists"
DESCRIPTION = "This plain TeX and LaTeX package provides the 'hlist' \
environment in which \\hitem starts a horizontal and columned \
item. It depends upon the simplekv package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn44983"

RPM_NAME = "texlive-hlist-2026.226.0.0.11svn44983-60.4.noarch.rpm"
RPM_HASH = "e4cc6c72c57fc937d8a011a8e0f1e117fe28d42effdf90414bcca396780ed82786878cda60fec0a264490a96228020fd245739176ab79d009e211d420898cb05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hlist.sty \
tex-hlist.tex \
texlive-hlist"

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
