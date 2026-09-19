SUMMARY = "Typeset formalized legal documents such as contracts, statutes, etcetera"
DESCRIPTION = "This package enables the typesetting of formalized legal \
documents such as contracts, statutes etc. It will be the \
successor to the scrjura package. Like the latter, 'contract' \
allows the typographically appealing typesetting of many \
different legal texts. The typesetting of contracts according \
to German conventions is supported 'out of the box'. In \
addition, the package supports the definition of custom \
environments in order to typeset contracts and legal texts \
according to Anglo-American specifications, for example."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.91svn69759"

RPM_NAME = "texlive-contract-2026.226.0.0.91svn69759-61.2.noarch.rpm"
RPM_HASH = "6f20590df0cd58348dc12e301b3f54f816ac8f88237ebf3bdb3137e0de1dc31b24ebe10a3fae1347ba5237f9ab4425b1e0827022ea8ef180a59cb4707f563d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-contract.sty \
texlive-contract"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-scrkbase.sty \
tex-tocbasic.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
