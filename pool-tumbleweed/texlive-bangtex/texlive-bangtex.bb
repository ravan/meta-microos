SUMMARY = "Writing Bangla and Assamese with LaTeX"
DESCRIPTION = "The bundle provides class files for writing Bangla and Assamese \
with LaTeX, and Metafont sources for fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55475"

RPM_NAME = "texlive-bangtex-2026.226.svn55475-60.2.noarch.rpm"
RPM_HASH = "1243959d718e837a32443b1b98208a4b32bc1528cbec1d3a3f4ff4b05228eac9348b7594a23171334df4be3c66e108f02539c3456539a62efd3038a35a233fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bang10.tfm \
tex-bangfont.tex \
tex-bangsl10.tfm \
tex-bangwd10.tfm \
tex-barticle.cls \
tex-bbk10.clo \
tex-bbk11.clo \
tex-bbk12.clo \
tex-bbook.cls \
tex-bletter.cls \
tex-bsize10.clo \
tex-bsize11.clo \
tex-bsize12.clo \
texlive-bangtex"

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
