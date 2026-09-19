SUMMARY = "Initialize form properties using big-endian encoding"
DESCRIPTION = "This package provides support for UTF-16BE Unicode character \
encoding (called a big-endian character string) for the text \
string type (PDF Reference, version 1.7, beginning on page \
158). Text strings are used in 'text annotations, bookmark \
names, article threads, document information, and so forth' (to \
partially quote page 158). The particular application is to set \
property values of form fields, at least those properties that \
take the text strings as its value. The package contains \
support for Basic Latin plus the ability to enter any unicode \
character using the notation \\uXXXX, where XXXX are four hex \
digits. The Package works for dvips/Distiller, pdfLaTeX, \
LuaLaTeX, and XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn51305"

RPM_NAME = "texlive-forms16be-2026.226.1.3svn51305-60.2.noarch.rpm"
RPM_HASH = "b585f374baabfd6cea18e76d29054f580f57fc44ad5523c21d3015c259906e0c5180f5725daf1e10616f2bcab6d499deb25a5878636fe339f6e47fe53ce729d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-forms16be.sty \
tex-uni4basic-latin.def \
texlive-forms16be"

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
