SUMMARY = "Multiple numbers for the same footnote"
DESCRIPTION = "This package provides several commands for generating footnotes \
which correspond to multiple footnote numbers (resp. marks). In \
some cases, you may wish for certain footnotes to correspond to \
several places in your text. The traditional solution usually \
involves writing the same footnote mark multiple times at the \
corresponding places. However, this approach makes it difficult \
to see at once how many times a footnote has been referred to. \
Therefore, the current package proposes another method: writing \
the footnote marks in linear order, and allowing a footnote \
text to match several of these marks."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn70745"

RPM_NAME = "texlive-multifootnote-2026.226.svn70745-61.2.noarch.rpm"
RPM_HASH = "ca7c9b274183de3b13769a00977f73c7aef990687d7bd066ba07414376ac0f5eb27ec259c5cec5f927ebdebf7c1bed90ec086af007efa028e1a0c780f451049a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multifootnote.sty \
texlive-multifootnote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-refcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
