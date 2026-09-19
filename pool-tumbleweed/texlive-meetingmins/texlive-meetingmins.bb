SUMMARY = "Format written minutes of meetings"
DESCRIPTION = "The class allows formatting of meeting minutes using \\section \
commands (which provide hierarchical structure). An agenda can \
also be produced for distribution prior to the meeting, with \
user-selected portions suppressed from printing."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn31878"

RPM_NAME = "texlive-meetingmins-2026.226.1.6svn31878-59.2.noarch.rpm"
RPM_HASH = "e39d0ded6d5ea28d50bc4f37209bcb880dcd8892fe56630b513c041bdc56b9bc193a887363c70c263e1fa504df792955736d645f3f74fd0c3e834bc891cbaa64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-meetingmins.cls \
texlive-meetingmins"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-enumitem.sty \
tex-environ.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-lmodern.sty \
tex-mathabx.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
