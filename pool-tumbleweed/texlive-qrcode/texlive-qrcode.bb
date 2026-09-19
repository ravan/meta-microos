SUMMARY = "Generate QR codes in LaTeX"
DESCRIPTION = "The package generates QR (Quick Response) codes in LaTeX, \
without the need for PSTricks or any other graphical package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.51svn77682"

RPM_NAME = "texlive-qrcode-2026.226.1.51svn77682-60.4.noarch.rpm"
RPM_HASH = "93de44622a296fae404cf326c61e6bc78ab3ffedd0f1e42358c727dc0a0334dc78cc85ad6b5fe58036e3c1647c5e08d64fdd9b302cb570b78f290e2e9e290407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qrcode.sty \
texlive-qrcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
