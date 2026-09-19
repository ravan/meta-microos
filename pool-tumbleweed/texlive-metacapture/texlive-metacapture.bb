SUMMARY = "A package for the capture of author-supplied metadata"
DESCRIPTION = "Curation and indexing of metadata is a crucial part of journal \
publishing. The metacapture package is one component in an open \
source workflow implementation that is designed to automate the \
production and copy editing of journal articles. It is used by \
the iacrj document class for the journal IACR CiC, but can also \
be used for other journals. It is intended primarily for use by \
LaTeX document class designers, but may also be useful for \
authors who may wish to change their document class in the \
future. When a document that loads metacapture.sty is compiled, \
it produces a YAML-like text file containing all metadata from \
the document. The metacapture package accomplishes this by \
providing replacements for the generic macros \\title, \\author \
and \\maketitle macros that have traditionally been used by \
document classes. The metacapture package also provides several \
implementations of the \\maketitle macro n different styles, \
partly as a way to demonstrate how to separate metadata capture \
from styling of front matter. Document class designers can also \
write their own implementation of \\maketitle with their \
preferred styling using the dictionary-like data structures \
used to hold author metadata. The metacapture package is part \
of a larger set of tools for implementing a journal publishing \
workflow. There is also a companion open source implementation \
of a publishing workflow written in Python that is used for \
this journal and provides a simplified workflow for copy \
editing and production. Further information on this workflow \
can be found in two articles that were published by the \
authors: Lowering the Cost of Diamond Open Access Journals, A \
LaTeX publishing workflow"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn77812"

RPM_NAME = "texlive-metacapture-2026.226.0.0.9.1svn77812-61.2.noarch.rpm"
RPM_HASH = "ec43cd94c5d8fdee570eb208f782150923044475d0348568752853d935e3324e1a8064afb2ec01be4d6262253b64eecc945fe0449e9d4ef80803b871a49bc142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metacapture.sty \
texlive-metacapture"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphalph.sty \
tex-doclicense.sty \
tex-etoolbox.sty \
tex-fancyvrb.sty \
tex-footnote.sty \
tex-listofitems.sty \
tex-tikz.sty \
tex-tokcycle.sty \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
