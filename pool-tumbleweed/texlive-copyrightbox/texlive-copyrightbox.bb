SUMMARY = "Provide copyright notices for images in a document"
DESCRIPTION = "The package command \\copyrightbox[<placement>]{<image \
command>}{<text>}, which places the text as a copyright notice \
relating to the matter created by the image command."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn24829"

RPM_NAME = "texlive-copyrightbox-2026.226.0.0.1svn24829-61.2.noarch.rpm"
RPM_HASH = "257058ff688a9db02f889b6060cc74487b51016dcdca67b48fc2f429e6c4e4f94b8c526b907ef1172d52e503f45fe6e91c33555505d2a9f3f5020c7f630acc51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-copyrightbox.sty \
texlive-copyrightbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
