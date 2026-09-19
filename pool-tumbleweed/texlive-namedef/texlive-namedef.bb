SUMMARY = "TeX definitions with named parameters"
DESCRIPTION = "This package provides a prefix \\named to be used in TeX \
definitions so that parameters can be identified by their name \
rather than by number, giving parameters a semantic rather than \
syntactic meaning, making it easy to understand long \
definitions. A usual definition reads: \\def\\SayHello#1{Hello, \
 \
\\named\\def\\SayHello#[person]{Hello, #[person]!} and \\named will \
figure out the numbering of the parameters for you."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-namedef-2026.226.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "be4cd03d26f4654c2b4437599c12a453c45b2c3d46ca2d53d3a5193d8fe8fa992d0e7da26604d30f47e00d6c1ea5eeccf5d032a68cf7a70092734952a2ce794f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-namedef.sty \
texlive-namedef"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3-generic.tex \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
