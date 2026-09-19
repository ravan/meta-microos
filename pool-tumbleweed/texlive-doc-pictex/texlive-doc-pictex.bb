SUMMARY = "A summary list of PicTeX documentation"
DESCRIPTION = "A summary of available resources providing (or merely \
discussing) documentation of PicTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn24927"

RPM_NAME = "texlive-doc-pictex-2026.226.svn24927-59.2.noarch.rpm"
RPM_HASH = "ab1e43aa34c19385d2bd2dad134714bd682be5bfc6a32247e4d8a2f54a009c4c5fc80a23768a37a9100a2fb92e9cc0fe89ffb384d404ace8c6c78b1a3e5cfe3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doc-pictex"

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
