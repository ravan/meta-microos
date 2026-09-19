SUMMARY = "Label any kind of term with a continuous counter"
DESCRIPTION = "The termlist package provides environments to indent and label \
any kind of terms with a continuous number. Candidate terms may \
appear inside an equation or eqnarray environment."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1svn18923"

RPM_NAME = "texlive-termlist-2026.227.1.1svn18923-62.2.noarch.rpm"
RPM_HASH = "7943220bebaeaa678d439638018dc7dfb5f2848c0499fe61f179897f6206e9b41aba662f7413e000e42b073cbd2dee8dac7258020c5cec2d9a140c8b82c04c4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-termlist.sty \
texlive-termlist"

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
