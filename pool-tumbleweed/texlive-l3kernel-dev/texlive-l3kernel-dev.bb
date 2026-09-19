SUMMARY = "Development pre-release of l3kernel"
DESCRIPTION = "This is a pre-release version of the l3kernel package. It \
accompanies the pre-testing kernel code (latex-base-dev), and \
is intended for testing by knowledgeable users."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77953"

RPM_NAME = "texlive-l3kernel-dev-2026.226.svn77953-63.2.noarch.rpm"
RPM_HASH = "7f231f2af379e50f79dd07d72ef83546d86599261a65f5010b765f6a1290b9a8f5b26792a8db0493cee28d4c7ee9104b466ad56242eb54906a8a189ae53f37e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texdev-expl3-code.tex \
texdev-expl3-generic.tex \
texdev-expl3.sty \
texdev-l3debug.def \
texdev-l3doc.cls \
texdev-l3docstrip.tex \
texdev-l3str-enc-iso88591.def \
texdev-l3str-enc-iso885910.def \
texdev-l3str-enc-iso885911.def \
texdev-l3str-enc-iso885913.def \
texdev-l3str-enc-iso885914.def \
texdev-l3str-enc-iso885915.def \
texdev-l3str-enc-iso885916.def \
texdev-l3str-enc-iso88592.def \
texdev-l3str-enc-iso88593.def \
texdev-l3str-enc-iso88594.def \
texdev-l3str-enc-iso88595.def \
texdev-l3str-enc-iso88596.def \
texdev-l3str-enc-iso88597.def \
texdev-l3str-enc-iso88598.def \
texdev-l3str-enc-iso88599.def \
texlive-l3kernel-dev"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hypdoc.sty \
tex-lmodern.sty \
texdev-article.cls \
texdev-calc.sty \
texdev-doc.sty \
texdev-fontenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend-dev \
texlive-lua-uni-algos \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
