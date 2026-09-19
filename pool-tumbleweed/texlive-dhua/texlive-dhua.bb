SUMMARY = "German abbreviations using thin space"
DESCRIPTION = "The package provides commands for those abbreviations of German \
phrases for which the use of thin space is recommended. Setup \
commands \\newdhua and \\newtwopartdhua are provided, as well as \
commands for single cases (such as \\zB for 'z. B.', saving the \
user from typing such as 'z.\\,B.'). To typeset the \
documentation, the niceverb package, version 0.44, or later, is \
required. Das Paket `dhua' stellt Befehle fur sog. \
mehrgliedrige Abkurzungen bereit, fur die schmale Leerzeichen \
(Festabstande) empfohlen werden (Duden, Wikipedia). In die \
englische Paketdokumentation sind deutsche Erlauterungen \
eingestreut."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn24035"

RPM_NAME = "texlive-dhua-2026.226.0.0.11svn24035-59.2.noarch.rpm"
RPM_HASH = "7773d699fee74b465213cbc5684621dcd39572da6b59f92a2fdae6f10489886ba1d6fac82420679a9111fce8677823df074f6ad77f746b5b7b1d8fa400eb3baf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dhua.cfg \
tex-dhua.sty \
texlive-dhua"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
