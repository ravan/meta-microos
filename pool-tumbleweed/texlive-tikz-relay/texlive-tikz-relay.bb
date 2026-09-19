SUMMARY = "TikZ library for typesetting electrical diagrams"
DESCRIPTION = "This package contains a collection of symbols for typesetting \
electrical wiring diagrams for relay control systems. The \
symbols are meant to be in agreement with the international \
standard IEC-60617 which has been adopted worldwide, with \
perhaps the exception of the USA. It extends and modifies, when \
needed, the TikZ-library circuits.ee.IEC. A few non-standard \
symbols are also included mainly to be used in presentations, \
particularly with the beamer package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76924"

RPM_NAME = "texlive-tikz-relay-2026.226.1.3svn76924-59.2.noarch.rpm"
RPM_HASH = "1dfddfeb1fe2fb1a15a579ebcbc0e25b14a26a9156b7d1c5603a817733e9ae35f956e00594f7142c6f5d33e7b2bf8ecc1896d0958adf6ab9a4224b658b27990c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarycircuits.ee.IEC.relay.code.tex \
texlive-tikz-relay"

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
