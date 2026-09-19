SUMMARY = "A LaTeX document class for formal documents"
DESCRIPTION = "The package provides a LaTeX document class that orchestrates a \
logical arrangement for document header, footer, author, \
abstract, table of contents, and margins. It standardizes a \
document layout intended for formal documents. The tlc_article \
GitHub repository uses a SCRUM framework adapted to standard \
GitHub tooling. tlc_article is integrated with Travis-ci.org \
for continuous integration and AllanConsulting.slack.com for \
centralized notification."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.0.17svn51431"

RPM_NAME = "texlive-tlc-article-2026.226.1.0.17svn51431-59.2.noarch.rpm"
RPM_HASH = "6adcefe327c6443921d0925137a9b8dd858ddcaa8f5ef12c71ada464b284d0e48ee1e3ce5bf607544d6be9049a5de55def68971ed088865111fd877c5cc9a446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tlc-article.cls \
texlive-tlc-article"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-appendix.sty \
tex-array.sty \
tex-article.cls \
tex-bookmark.sty \
tex-csvsimple.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-longtable.sty \
tex-makecell.sty \
tex-multicol.sty \
tex-pdflscape.sty \
tex-pdfpages.sty \
tex-spverbatim.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-titling.sty \
tex-tocloft.sty \
tex-todonotes.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
