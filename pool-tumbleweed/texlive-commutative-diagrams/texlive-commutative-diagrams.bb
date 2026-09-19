SUMMARY = "CoDi: Commutative Diagrams for TeX"
DESCRIPTION = "This package provides a TikZ library for making commutative \
diagrams easy to design, parse and tweak."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn71053"

RPM_NAME = "texlive-commutative-diagrams-2026.226.1.1.2svn71053-60.2.noarch.rpm"
RPM_HASH = "bb985d6d63c57cbdc9e6e7ebefa61cce533047c19454b790e35a1514a99f56ff3959dec4fce24bb69a42a069b98d68f6284f27316991a2d1c821397deb4c6cd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-commutative-diagrams.sty \
tex-commutative-diagrams.tex \
tex-kodi.sty \
tex-t-commutative-diagrams.tex \
tex-tikzlibrarycommutative-diagrams.bapto.code.tex \
tex-tikzlibrarycommutative-diagrams.code.tex \
tex-tikzlibrarycommutative-diagrams.diorthono.code.tex \
tex-tikzlibrarycommutative-diagrams.ektropi.code.tex \
tex-tikzlibrarycommutative-diagrams.katharizo.code.tex \
tex-tikzlibrarycommutative-diagrams.koinos.code.tex \
tex-tikzlibrarycommutative-diagrams.mandyas.code.tex \
tex-tikzlibrarycommutative-diagrams.mitra.code.tex \
tex-tikzlibrarycommutative-diagrams.ozos.code.tex \
tex-tikzlibrarycommutative-diagrams.ramma.code.tex \
tex-tikzlibrarycommutative-diagrams.velos.code.tex \
texlive-commutative-diagrams"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
