SUMMARY = "A few shapes designed to be used with CircuiTikZ"
DESCRIPTION = "This package defines a few extra shapes, Quadripoles and single \
port, which can be used 'standalone', but are mainly meant to \
be used with CircuiTikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn77050"

RPM_NAME = "texlive-tikzquads-2026.226.1.2asvn77050-59.2.noarch.rpm"
RPM_HASH = "3d36fc57819c19e884b77922919215d9cc3d26c058f779016c6c70515fc4787dd8da1cf3b795857bfb9965e27949927ea0656b8efdaf16e2dd7ea6f856bf6956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzquads.sty \
texlive-tikzquads"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeysearch.sty \
tex-pkginfograb.sty \
tex-tikzdotncross.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
