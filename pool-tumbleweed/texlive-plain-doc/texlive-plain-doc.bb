SUMMARY = "A list of plain.tex cs names"
DESCRIPTION = "The document constitutes a list of every control sequence name \
(csname) described in the TeXbook, together with an indication \
of whether the csname is a primitive TeX command, or is defined \
in plain.tex"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn28424"

RPM_NAME = "texlive-plain-doc-2026.226.svn28424-58.2.noarch.rpm"
RPM_HASH = "dc75b3b6c122afed0d4e295e530808599642ff87c539be65c106b3bb8d17d39115695115645e222022cea62cf656cfabb17513c8a60b81166eaba02031e44830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plain-doc"

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
