SUMMARY = "Inline images in base64 encoding"
DESCRIPTION = "The package provides a command \\inlineimg to dynamically create \
a file containing the inline image in base64 format, which is \
decoded and included in the source file. Requirements LaTeX \
must be run with option --shell-escape. Program base64."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.1.0svn61719"

RPM_NAME = "texlive-inline-images-2026.226.1.0svn61719-60.2.noarch.rpm"
RPM_HASH = "2aee6fd2f386a624df67a572f156f42796d7230bc0f37d355f57c57828eca8a9d66bcf792ca7025a4f078fd08288dcfe24022505f7600d33426e05d8d40e0012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inline-images.sty \
texlive-inline-images"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
