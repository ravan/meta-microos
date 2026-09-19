SUMMARY = "Rudimentary C++-like namespaces in LaTeX"
DESCRIPTION = "The namespc package adds rudimentary C++-like namespace \
functionality to LaTeX. It may be used to declare local LaTeX \
commands, which can be made accessible in a later contexts \
without defining them globally."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-namespc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "4fac923a2a0f48b1282c3f1e394321d44375a999e8251cac492b3bd75321d69574923d92eefb1808140d814422c0e0b82950ca2e53a139b8a46781210e214fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-namespc.sty \
texlive-namespc"

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
