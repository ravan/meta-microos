SUMMARY = "Support for creating a change log"
DESCRIPTION = "Vhistory simplifies the creation of a history of versions of a \
document. You can easily extract information like the current \
version of a list of authors from that history. It helps you to \
get consistent documents. The package sets, which is used by \
vhistory, allows you to use sets containing text. You can use \
the usual operations to create the union of sets or the \
intersection of sets etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8.0svn61719"

RPM_NAME = "texlive-vhistory-2026.226.1.8.0svn61719-60.2.noarch.rpm"
RPM_HASH = "a1fee653e3774461e675d2b267572d50d3347900f20075848a0e61ee80392ccc1da223968c90576c3579645e01720f25e6cf535fc28dcae8d73b50c55dbc3c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sets.sty \
tex-vhistory.sty \
texlive-vhistory"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ltxtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
