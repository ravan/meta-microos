SUMMARY = "Goodies for theorems and proofs"
DESCRIPTION = "This package provides enhanced theorem and proof environments \
based on the amsthm original versions. It allows for hooks to \
be placed, adds some default goodies and is highly \
customizable. In particular, it can connect theorems to proofs, \
automatically producing text such as 'See proof on page XYZ' \
and 'Proof of Theorem 4: ...'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn60735"

RPM_NAME = "texlive-phfthm-2026.226.1.2svn60735-58.2.noarch.rpm"
RPM_HASH = "b6b130d9864d9c89330df5ae4aba8d96ca46d5bc48b85a916fb14a0af811547b5872d0b1348bdc94de76034a695baf41e854366f072fd4cb3dd6df4ba83b141b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phfthm.sty \
texlive-phfthm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-aliascnt.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-etoolbox.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
