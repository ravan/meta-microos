SUMMARY = "Hyperref extensions for use with dvips"
DESCRIPTION = "The hypdvips package fixes some problems when using hyperref \
with dvips. It also adds support for breaking links, file \
attachments, embedded documents and different types of \
GoTo-links. The cooperation of hyperref with cleveref is \
improved, which in addition allows an enhanced back-referencing \
system."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.03svn77682"

RPM_NAME = "texlive-hypdvips-2026.226.3.03svn77682-60.2.noarch.rpm"
RPM_HASH = "4c2d7ea472d9b14151fb6904a7c49f6434c9c1544071800069fab938525e907a56c60a55827ea09d22b8684e8678567095d1b83563f4d20786e2a86f99be8421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hypdvips.sty \
texlive-hypdvips"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-bookmark.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
