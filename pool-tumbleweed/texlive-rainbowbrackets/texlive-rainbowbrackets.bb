SUMMARY = "Automatic coloring of nested parentheses"
DESCRIPTION = "The primary function of this package is to replicate a common \
feature found in many integrated development environments \
(IDEs), wherein matching parentheses at the same nesting level \
are assigned corresponding colors. This visual aid facilitates \
improved readability and cognitive parsing of complex \
expressions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.2svn75976"

RPM_NAME = "texlive-rainbowbrackets-2026.226.1.3.2svn75976-60.4.noarch.rpm"
RPM_HASH = "6653c6b9963bee53169655ccfe46bc389f9a2124b3b9934db67f45eca3077f3eb409d91a38566f573092ab61fd20ff7810a2cb9f720786361caf9090956bdd98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rainbowbrackets.sty \
texlive-rainbowbrackets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-kvoptions.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
