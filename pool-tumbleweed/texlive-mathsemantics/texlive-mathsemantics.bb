SUMMARY = "Semantic math commands in LaTeX"
DESCRIPTION = "This LaTeX package provides both syntactic and semantic helpers \
to typeset mathematics in LaTeX. The syntactic layer eases \
typesetting of formulae in general, while the semantic layer \
provides commands like \\inner{x}{y} to unify typesetting of \
inner products. These not only unify typesetting of math \
formulae but also allow to easily adapt notation if a user \
prefers to. The semantic layer is split into topics."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn63241"

RPM_NAME = "texlive-mathsemantics-2026.226.1.0.0svn63241-59.2.noarch.rpm"
RPM_HASH = "826434b5a03ce268e2092875135c4e03d48716155fb880ebacfcd850018c591be16ea2a12e2a992df1b24a5c25bbb73d7d77368d823f94c820050901c6b4f552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathsemantics-abbreviations.sty \
tex-mathsemantics-commons.sty \
tex-mathsemantics-manifolds.sty \
tex-mathsemantics-names.sty \
tex-mathsemantics-optimization.sty \
tex-mathsemantics-semantic.sty \
tex-mathsemantics-syntax.sty \
tex-mathsemantics.sty \
texlive-mathsemantics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-calc.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-mathtools.sty \
tex-xifthen.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
