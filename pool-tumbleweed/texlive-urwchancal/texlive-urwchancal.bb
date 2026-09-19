SUMMARY = "Use URW's clone of Zapf Chancery as a maths alphabet"
DESCRIPTION = "The package allows (the URW clone of) Zapf Chancery to function \
as a maths alphabet, the target of \\mathcal or \\mathscr, with \
accents appearing where they should, and other spacing \
parameters set to reasonable (not very tight) values. The font \
itself may be found in the URW basic fonts collection. This \
package supersedes the pzccal package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn21701"

RPM_NAME = "texlive-urwchancal-2026.226.1svn21701-60.2.noarch.rpm"
RPM_HASH = "d742231a54613e1a5e26bd7a29f74f7c8c3a31043975ce995768a65a25a5ac8b1c0610c26e831b8892c39d3ac7d9bec6fbd68037f6f9f80d4445e489ec0149d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-urwchancal.sty \
tex-urwchancal.tfm \
tex-urwchancal.vf \
tex-uurwchancal.fd \
texlive-urwchancal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
