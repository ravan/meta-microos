SUMMARY = "Decorate theorem statements"
DESCRIPTION = "The package defines an environment thmbox that presents \
theorems, definitions and similar objects in boxes decorated \
with frames and various aesthetic features. The standard macro \
\\newtheorem may be redefined to use the environment."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn77682"

RPM_NAME = "texlive-thmbox-2026.227.svn77682-62.2.noarch.rpm"
RPM_HASH = "bb8998f52adea9fbcea4e7ea8544321be44c614786bc2c866fedc4c1910ca1ee026e631ab662a706127c6ce32e2091e33f0a933fb932175b74eee098424136d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thmbox.sty \
texlive-thmbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
