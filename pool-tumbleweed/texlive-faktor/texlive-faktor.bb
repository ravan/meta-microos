SUMMARY = "Typeset quotient structures with LaTeX"
DESCRIPTION = "The package provides the means to typeset factor structures, as \
are used in many areas of algebraic notation. The structure is \
similar to the 'A/B' that is provided by the nicefrac package \
(part of the units distribution), and by the xfrac package; the \
most obvious difference is that the numerator and denominator's \
sizes do not change in the \\faktor command."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1bsvn77682"

RPM_NAME = "texlive-faktor-2026.226.0.0.1bsvn77682-59.2.noarch.rpm"
RPM_HASH = "27ff240a1b4aa284051f6356b12121ae92157b607d6ed7b764bccec80225108419ebf22e06b22273ae14a2bfc801b0d537a5563d05d90c21bce931dfd11249a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-faktor.sty \
texlive-faktor"

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
