SUMMARY = "Short introduction to LaTeX, French translation"
DESCRIPTION = "French version of A Short Introduction to LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.5.01fr_0svn23332"

RPM_NAME = "texlive-lshort-french-2026.226.5.01fr_0svn23332-61.2.noarch.rpm"
RPM_HASH = "bc7e2d476ac0425c9642b1c1ac2a8a49d8ebcf0053e3e435697a90ba4a4e6c11df9db266e83e9e75ded79084d4bb51c9a3a83bceeb0324a4c9c664977e1ed82b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-french"

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
