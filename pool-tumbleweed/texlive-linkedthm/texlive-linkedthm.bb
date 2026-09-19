SUMMARY = "Hyperlinked theorem-proof environments for LaTeX"
DESCRIPTION = "This package provides lightweight infrastructure for \
bidirectional linking between theorem-like environments and \
their corresponding proofs. It automatically adds a [Proof] \
hyperlink at the end of a theorem and a restated version with a \
[Return] link inside the proof. You can declare any number of \
custom linked environments (e.g., linkeddefinition, \
linkedexample) using \\DeclareLinkedTheorem, and base them on \
any amsthm-compatible environment. This is useful for \
mathematical writing and documentation, where proof navigation \
is essential. The package uses amsthm, xparse, and hyperref, \
and is compatible with all standard LaTeX engines."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75860"

RPM_NAME = "texlive-linkedthm-2026.226.1.0svn75860-61.2.noarch.rpm"
RPM_HASH = "04c3270b1e9a61daf45fec298fa8239be72b4cad0be24fc805100aed139dccda4007cddc433e0e93ad1285d105bb0440467327fe11232594c5afd0659223a6e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-linkedthm.sty \
texlive-linkedthm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-hyperref.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
