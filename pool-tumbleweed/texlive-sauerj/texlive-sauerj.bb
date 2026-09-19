SUMMARY = "A bundle of utilities by Jonathan Sauer"
DESCRIPTION = "The bundle consists of: a tool for collecting text for later \
re-use, a tool for typesetting the 'meta-information' within a \
text, a tool for use in constructing macros with multiple \
optional parameters, a package for multiple column parallel \
texts, a tool for processing key-value structured lists, and \
macros for typesetting a number as a German-language string."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-sauerj-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "778278777cd3043ddd192127e4f8eb7d71e1e1d38bcfc84342134b2435ca0c469ff0156fc930f8ff52df662b6e91e610d7061a2c12beaebbbce3e0decf3e57de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-collect.sty \
tex-metainfo.sty \
tex-optparams.sty \
tex-parcolumns.sty \
tex-processkv.sty \
tex-zahl2string.sty \
texlive-sauerj"

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
