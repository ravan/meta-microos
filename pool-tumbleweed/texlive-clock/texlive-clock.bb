SUMMARY = "Graphical and textual clocks for TeX and LaTeX"
DESCRIPTION = "Features graphical clocks (with a classical 12h dial and two \
hands) and text clocks (in 24h format) which can show system \
time or any time the user desires. Works with both TeX and \
LaTeX. The clock faces (appearances of the dial) are easily \
expandable; the default uses a custom Metafont font."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-clock-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "e13983f487d9d2922c65599fba547ce26c14c05d611fca92bd00d7aeba4ca8a48d2b7a85c5859b4202e1ee0b542711695a33a7cdff94d1741d8c60f23dc34cd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clock.sty \
tex-clock.tex \
tex-clock.tfm \
texlive-clock"

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
