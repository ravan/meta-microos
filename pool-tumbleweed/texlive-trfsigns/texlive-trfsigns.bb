SUMMARY = "Typeset transform signs"
DESCRIPTION = "A package for typesetting various transformation signs for \
Laplace transforms, Fourier transforms and others."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.01svn15878"

RPM_NAME = "texlive-trfsigns-2026.226.1.01svn15878-59.2.noarch.rpm"
RPM_HASH = "77b656b4eb8e63a7f74f4ef9bf27daf8274ece98374bd2f1f403ec57d684427ea943a624f3603975501aaa6a93261b5ce90d63b30b087e2b5eb3e750a3df3a54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trfsigns.sty \
texlive-trfsigns"

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
