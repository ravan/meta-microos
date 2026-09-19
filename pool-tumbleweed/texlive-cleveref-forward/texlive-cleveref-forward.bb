SUMMARY = "Forward-referencing functionality for cleveref"
DESCRIPTION = "This package aims at providing the forward-referencing \
functionality for the package cleveref. It is derived from the \
package cleveref-usedon, with several fixes and enhancements."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-cleveref-forward-2026.226.svn76924-60.2.noarch.rpm"
RPM_HASH = "3ceb36abc435ef750e5152fef6b28908db4bcfc1ea2798235be7d38f7b899eba200b9f8c41889e0ad1fcfe270dfe87af4c9fad62b36f443b0d3773dd40ad4d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cleveref-forward.sty \
texlive-cleveref-forward"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cleveref.sty \
tex-crefthe.sty \
tex-iflang.sty \
tex-regexpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
