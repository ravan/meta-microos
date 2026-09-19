SUMMARY = "Section numbering and table of contents control"
DESCRIPTION = "Provides control over section numbering (without recourse to \
starred sectional commands) and/or the entries in the Table of \
Contents on a section by section basis."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn77682"

RPM_NAME = "texlive-tocvsec2-2026.226.1.3asvn77682-59.2.noarch.rpm"
RPM_HASH = "826f535705d4939c2410c982b91ed969977d8e1d5b0c3a28867a2255993efd3a7cdfaf2b151bc15dff4f61be6c2ba22f23e8db00acff35d79f8e65bb48fc23ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tocvsec2.sty \
texlive-tocvsec2"

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
