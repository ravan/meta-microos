SUMMARY = "Aids for typesetting simple verse"
DESCRIPTION = "The package documentation discusses approaches to the problem; \
the package is strong on layout, from simple alternate-line \
indentation to the Mouse's tale from Alice in Wonderland."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4csvn77682"

RPM_NAME = "texlive-verse-2026.226.2.4csvn77682-60.2.noarch.rpm"
RPM_HASH = "acd5e74a11581ce01b471ab81313a096b3819bdf640785d4e01ab1061db99302e09367f642ddeebd721bbd0ef7a1cc300306c1bdfff263f57ecf82d91c148290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verse.sty \
texlive-verse"

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
