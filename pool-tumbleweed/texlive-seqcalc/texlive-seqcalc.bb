SUMMARY = "A package for declarative sequent-calculus proofs"
DESCRIPTION = "This package provides a structured wrapper around the \
bussproofspackage. It provides a declarative interface for \
sequent calculus proofs, including rule declaration, rule \
application, formula normalization, shortcuts, and optional \
standard rule sets. The goal is to simplify the construction of \
proof trees while keeping the underlying bussproofs layout \
untouched."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77561"

RPM_NAME = "texlive-seqcalc-2026.226.1.0svn77561-60.2.noarch.rpm"
RPM_HASH = "6cd6c52ec7ab2d1350ca9f7655aa3fa89e904ca2686a0f43c9df09e0043ea54337b46d8115d0745aade2975251009e010183fcc536a0ad0d8600daae7deaa9a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-seqcalc.sty \
texlive-seqcalc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bussproofs.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
