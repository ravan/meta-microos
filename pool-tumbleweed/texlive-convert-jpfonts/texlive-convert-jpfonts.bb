SUMMARY = "Convert half-width Japanese to full-width beautifully"
DESCRIPTION = "This style file is designed for converting Japanese half-width \
characters to full-width characters beautifully. This is useful \
when alphabet characters don't render properly in a Japanese \
font."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn73551"

RPM_NAME = "texlive-convert-jpfonts-2026.226.1.0.1svn73551-61.2.noarch.rpm"
RPM_HASH = "a48c5d6d59dcbe97ac9a84a31a7e497b7014383fe3b331fad83ba154c59f65225f8b65e00eeca8973b84971bffabf4140d300d63ec3cbcc2a3cd1af22ae22577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-convert-jpfonts.sty \
texlive-convert-jpfonts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
