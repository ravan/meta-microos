SUMMARY = "Variants of delimiters that act as maths open/close"
DESCRIPTION = "The package defines variants \\mleft and \\mright of \\left and \
\\right, that make the delimiters act as \\mathopen and \
\\mathclose. These commands address spacing difficulties in \
subformulas."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-mleftright-2026.226.1.2svn77682-61.2.noarch.rpm"
RPM_HASH = "bbe92671520244a476c6f7c8f44074cb5fa30de80f61cb9b5691c63b152c8b8a02d69a20fd169fb0b6a932d649234acada513d971b97d5a69384f3c4943a648d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mleftright.sty \
texlive-mleftright"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
