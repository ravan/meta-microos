SUMMARY = "Environments AsciiList and AsciiDocList for prototyping nested lists in LaTeX"
DESCRIPTION = "The asciilist provides the environments AsciiList and \
AsciiDocList, which enable quickly typesetting nested lists in \
LaTeX without having to type individual item macros or \
opening/closing list environments. The package provides \
auxiliary functionality for loading such lists from files and \
provides macros for configuring the use of the list \
environments and the appearance of the typeset results."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2bsvn77682"

RPM_NAME = "texlive-asciilist-2026.226.2.2bsvn77682-60.2.noarch.rpm"
RPM_HASH = "c2255ce849e237dbe12448a97e5fb70a37d59a312d5b7edef41f6da4df8a6d323dbd2906c4d483f3fc7e1fe82fbe902cde1958107b2889595ca9abdbba97f010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-asciilist.sty \
texlive-asciilist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-trimspaces.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
