SUMMARY = "Generate ConTeXt syntax highlighting code from vim"
DESCRIPTION = "ConTeXt has excellent pretty printing capabilities for many \
languages. The code for pretty printing is written in TeX, and \
due to catcode juggling, such verbatim typesetting is perhaps \
the trickiest part of TeX. This makes it difficult for a \
'normal' user to define syntax highlighting rules for a new \
language. This module takes the onus of defining syntax \
highlighting rules away from the user and uses ViM editor to \
generate the syntax highlighting. There is a helper \
2context.vim script to do the syntax parsing in ViM."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn62071"

RPM_NAME = "texlive-context-vim-2026.226.svn62071-61.2.noarch.rpm"
RPM_HASH = "9a1d370d3b435e5e570e08e9a295cc08c73e0a627cff653ca9366d1eedadbbf109ffadc15b0f8bda6f1cf74206bbb0d3ee1b8fd4ab2bdf44c30ff5da36046d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-vim.tex \
texlive-context-vim"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-context-filter \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
