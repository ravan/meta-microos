SUMMARY = "Draw rulers on the foreground or in the text"
DESCRIPTION = "This package draws horizontal and vertical rulers on the \
foreground of every (or the current) page at absolute \
positions. In this way, you can check the page layout \
dimensions. You can also draw various rulers in the text. The \
fgruler package requires the services of the following \
packages: kvoptions, etoolbox, xcolor, graphicx, eso-pic."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn77333"

RPM_NAME = "texlive-fgruler-2026.226.1.7svn77333-59.2.noarch.rpm"
RPM_HASH = "12288eb1a02c2644fdb90741edfe4d8ffbf797a13e9c22f16340d57e790b804fe6e359dd69e99284cbd0ac1de1f83556ce10e89ec8323faedb96506c253c64d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fgruler.sty \
texlive-fgruler"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
