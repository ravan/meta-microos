SUMMARY = "Drawing ribbon proofs"
DESCRIPTION = "The package provides a way to draw 'ribbon proofs' in LaTeX. A \
ribbon proof is a diagrammatic representation of a mathematical \
proof that a computer program meets its specification. These \
diagrams are more human-readable, more scalable, and more \
easily modified than the corresponding textual proofs."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn31137"

RPM_NAME = "texlive-ribbonproofs-2026.226.1.0svn31137-60.4.noarch.rpm"
RPM_HASH = "96db5d16d06d48b684fe3dc94e5dc0d7b7a4ff3cc82bd392104e2bc544abaac44ac23b81daebae656da3619801528af8f14fa94413a27dc7083da07764b2c1a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ribbonproofs.sty \
texlive-ribbonproofs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etextools.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
