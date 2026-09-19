SUMMARY = "A collection of facilitative tools"
DESCRIPTION = "ProjLib is a collection of tools to help you write LaTeX \
documents. With the main package ProjLib loaded, you no longer \
need to set up the theorem-like environments, nor to manually \
configure the appropriate multilingual settings. In addition, a \
series of auxiliary functionalities are introduced."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-projlib-2026.226.svn78004-59.2.noarch.rpm"
RPM_HASH = "c2a2520c54d1a99895590d314bebff81f38e39459811a5efaa1417f5266694f2161034653a10d04271570663a4e9a74731233070cf6a2dcb2393b7dcead66a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ProjLib.sty \
tex-projlib-author.sty \
tex-projlib-datetime.sty \
tex-projlib-draft.sty \
tex-projlib-font.sty \
tex-projlib-language.sty \
tex-projlib-logo.sty \
tex-projlib-math.sty \
tex-projlib-paper.sty \
tex-projlib-text.sty \
tex-projlib-theorem.sty \
tex-projlib-titlepage.sty \
texlive-projlib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-babel.sty \
tex-biolinum.sty \
tex-cabin.sty \
tex-cfr-lm.sty \
tex-create-theorem.sty \
tex-csquotes.sty \
tex-ebgaramond-maths.sty \
tex-ebgaramond.sty \
tex-eulervm.sty \
tex-fbb.sty \
tex-fontenc.sty \
tex-fontsetup.sty \
tex-fontspec.sty \
tex-lmodern.sty \
tex-mathalfa.sty \
tex-mathastext.sty \
tex-mathpazo.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-newpxtext.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-notomath.sty \
tex-regexpatch.sty \
tex-relsize.sty \
tex-scontents.sty \
tex-setspaceenhanced.sty \
tex-silence.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-ulem.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
tex-zi4.sty \
texlive \
texlive-create-theorem \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
