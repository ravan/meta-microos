SUMMARY = "A font to draw a skull"
DESCRIPTION = "The font (defined in Metafont) defines a single character, a \
black solid skull. A package is supplied to make this character \
available as a symbol in maths mode."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1svn51907"

RPM_NAME = "texlive-skull-2026.226.0.0.1svn51907-64.2.noarch.rpm"
RPM_HASH = "2a0430ad9ed126805c948df6f3f164bae15f937e4a7ab561cafe2c89cc16d55917ae46edd4e761ef62176cc88c93a85e94284b757c37bb2ba0f41c81f6c3981c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skull.sty \
tex-skull.tfm \
texlive-skull"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
