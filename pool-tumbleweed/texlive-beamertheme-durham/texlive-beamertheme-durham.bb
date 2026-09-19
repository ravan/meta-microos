SUMMARY = "A content-first Beamer theme for teaching, research, and long-form academic presentations"
DESCRIPTION = "This package provides the Durham Beamer Theme, a content-first \
presentation theme for LaTeX Beamer designed for teaching, \
research, and long-form academic presentations. The theme \
emphasizes structural clarity, pacing awareness, and layout \
stability under dense textual and mathematical content. It is \
implemented entirely from first principles and not derived from \
any existing Beamer theme. Conceptual inspiration from \
established themes such as Metropolis is acknowledged; no \
external code is reused. The color palette is inspired by the \
visual identity of Durham University. This package is an \
independent academic contribution and not an official or \
endorsed Durham University template. The package includes a \
modular theme implementation, a demo document with compiled \
PDF, and a user manual."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn78101"

RPM_NAME = "texlive-beamertheme-durham-2026.226.1.1.0svn78101-61.2.noarch.rpm"
RPM_HASH = "41fff67f07f938b7acaf7a3b32619ad1e1450bde8577b9655dfe85673b87d258bef2cd466d25d38156f5ae0f634c5b93bd6e6992c62daa3869c5d47512fbbbc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemedurham.sty \
texlive-beamertheme-durham"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraMono.sty \
tex-FiraSans.sty \
tex-appendixnumberbeamer.sty \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
