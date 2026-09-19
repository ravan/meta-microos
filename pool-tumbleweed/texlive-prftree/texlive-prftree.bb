SUMMARY = "Macros for building proof trees"
DESCRIPTION = "A package to typeset proof trees for natural deduction calculi, \
sequent-like calculi, and similar."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-prftree-2026.226.1.6svn77682-59.2.noarch.rpm"
RPM_HASH = "80c127c2319999ac39c6f5afaacd5b0ceb6ed315c16c8cd66b58fb22bfe88b10e7d504a946d007908ba77aa443a0368391c8bcc14fd39bbafb1bb98132fc62ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prftree.sty \
texlive-prftree"

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
