SUMMARY = "Macros to typeset calculational proofs and programs in Dijkstra's style"
DESCRIPTION = "Edsger W. Dijkstra and others suggest a unique style to present \
mathematical proofs and to construct programs. This package \
provides macros that support calculational proofs and \
Dijkstra's 'guarded command language'."
LICENSE = "BSD-3-Clause"

PV = "2026.227.svn15878"

RPM_NAME = "texlive-tex-ewd-2026.227.svn15878-62.2.noarch.rpm"
RPM_HASH = "2d1e13e24a9718ba61cb9f126d13e0f8e82dc58fdb133ae317ecb2fe5c83d83e1ecc237fd31b46fe5f01b0a51fefa868b6a26d80d72dc55ba3402f2448841b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dotnot.tex \
texlive-tex-ewd"

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
