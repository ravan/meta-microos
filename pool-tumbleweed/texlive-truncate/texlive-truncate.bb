SUMMARY = "Truncate text to a specified width"
DESCRIPTION = "The package will by default break at word boundaries, but \
package options are offered to permit breaks within words."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.3.6svn77682"

RPM_NAME = "texlive-truncate-2026.226.3.6svn77682-59.2.noarch.rpm"
RPM_HASH = "5ba4bb31205432b2011be45a385ee3d26f99d6060139d1321097ec66134a6148220899c64cbce68ecd48abf4cb9169f39d5128a226bde2f9e585a8348a6094c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-truncate.sty \
texlive-truncate"

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
