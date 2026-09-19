SUMMARY = "Use Concrete fonts"
DESCRIPTION = "Typeset a LaTeX2e document with the Concrete fonts designed by \
Don Knuth and used in his book 'Concrete Mathematics'."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-beton-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "0f86d896243f8e17c757086ff8b5b38b0a5e41aa2d7d5680fb99552eeb47b66aa57d2eb1c33d72eaf2a2d749f7b45686dfa7fb3c2fda9443d1fa026b87f40c09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beton.sty \
texlive-beton"

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
