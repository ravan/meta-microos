SUMMARY = "A flexible beamer color theme to maximize visibility"
DESCRIPTION = "This package provides a flexible dark or light colour theme \
designed for maximum readability in environments where most \
themes fall flat. Main features: Dark color theme for \
presenting in low-light conditions. Optional light color theme \
for presenting in bright ambient light. Redefines color names \
'red', 'green', 'blue', 'yellow' to values that are visible \
when displayed by certain projectors, particularly those with a \
very bright green channel and dim red and blue channels. This \
behaviour can be optionally disabled, with the provided colours \
also available as 'OwlRed', 'OwlGreen', etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn40105"

RPM_NAME = "texlive-beamercolorthemeowl-2026.226.0.0.1.1svn40105-61.2.noarch.rpm"
RPM_HASH = "94f24177c31f85a83e7f0aa7ae35188e1ca546203eb381ba0c70fa13ade60584800a56e04837a14cf58bae34e5bfd579bf3e18658856be888a9cc3bd9c50524a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeowl.sty \
texlive-beamercolorthemeowl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
