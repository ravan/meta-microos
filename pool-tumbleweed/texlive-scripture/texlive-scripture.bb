SUMMARY = "A LaTeX style for typesetting Bible quotations"
DESCRIPTION = "The scripture package provides a set of macros for typesetting \
quotations from the Bible. It provides many features commonly \
seen in Bibles such as dropped text for chapter numbers, \
superscripts for verse numbers, indented lines for poetry \
sections, narrow sections and hanging paragraphs. A reference \
for the quotation can optionally be added."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn76924"

RPM_NAME = "texlive-scripture-2026.226.2.2svn76924-60.2.noarch.rpm"
RPM_HASH = "170cd2e90e8dad64034d162bafb15aec7a26c530887ab1f716531581e3be46435baf8fbd44d7ce31beff860d767b39bb3a3a9bd16eeb16b01ac977772fa56f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scripture.sty \
texlive-scripture"

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
