SUMMARY = "Graphics and text watermarks on selected pages"
DESCRIPTION = "The package extends the author's draftmark and the watermark \
packages. It is currently unmaintained and does not work with \
modern LaTeX releases."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.2dsvn61719"

RPM_NAME = "texlive-xwatermark-2026.226.1.5.2dsvn61719-59.4.noarch.rpm"
RPM_HASH = "cb41c0bdc0562a9856ee16df29fd1a67166a5252a076368ba6c47e27a1b614f1eb76dc31d0a16270c80480362581110b85e876515f335c1015a734273c79052e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xwatermark.sty \
texlive-xwatermark"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
