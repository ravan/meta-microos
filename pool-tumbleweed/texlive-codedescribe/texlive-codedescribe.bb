SUMMARY = "LaTeX code description and documentation"
DESCRIPTION = "This package aims to document both document level as well \
package/class level commands. It is fully implemented using \
expl3. Besides that the scontents and listing packages are used \
to typeset code snippets."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.24asvn77814"

RPM_NAME = "texlive-codedescribe-2026.226.1.24asvn77814-60.2.noarch.rpm"
RPM_HASH = "66c6a8eb8383a6a41885323171f119dd994bc1b88b5247d1608670fdc36c65db0803f84b3e42c60dc08abda05ae0c1467dc07fe385669733e9c87d84ab6b30a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-codecmm.sty \
tex-codedescribe.sty \
tex-codedescsets.sty \
tex-codelisting.sty \
tex-codelstlang.sty \
texlive-codedescribe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-pifont.sty \
tex-pkginfograb.sty \
tex-scontents.sty \
tex-xcolor.sty \
tex-xpeekahead.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
