SUMMARY = "LaTeX support for ocr fonts"
DESCRIPTION = "The package supports use of both ocr-a and ocr-b fonts in LaTeX \
documents."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-ocr-latex-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "2663efe6b822fcbae3ef783307216cac2fa55f2deb8c67371ea99070db74a85365812ce4bd00b1680fa67158cfbc48f755274bbb36037321e5c5bccc2e85821f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ocr.sty \
tex-ot1oca.fd \
tex-ot1ocra.fd \
tex-ot1ocrb.fd \
tex-ot1ocrbn.fd \
tex-ot1ocrbns.fd \
tex-ot1ocrbo.fd \
tex-ot1ocrbs.fd \
texlive-ocr-latex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
