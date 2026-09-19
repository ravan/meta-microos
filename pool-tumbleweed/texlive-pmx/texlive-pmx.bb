SUMMARY = "Preprocessor for MusiXTeX"
DESCRIPTION = "PMX provides a preprocessor for MusiXTeX. pmxab builds a TeX \
input file based on a .pmx input file in a much simpler \
language, making most of the layout decisions by itself. It has \
most of MusiXTeX's functionality, but it also permits in-line \
TeX to give access to virtually all of MusiXTeX. For \
proof-listening, pmxab will make a MIDI file of your score. \
scor2prt is an auxiliary program that makes parts from a score."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.00svn75301"

RPM_NAME = "texlive-pmx-2026.226.3.00svn75301-59.2.noarch.rpm"
RPM_HASH = "1fa506cdb992c2d9ecff4e2d3448da89c8f2d6e0290d6eefe743099fa0b5d88f541132190c20138ee9e5cfaaea4d06d906a3f60ea68c6c106b6b438f76c517f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pmx.tex \
texlive-pmx"

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
texlive-pmx-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
