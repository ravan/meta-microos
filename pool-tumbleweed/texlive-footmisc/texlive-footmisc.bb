SUMMARY = "A range of footnote options"
DESCRIPTION = "A collection of ways to change the typesetting of footnotes. \
The package provides means of changing the layout of the \
footnotes themselves (including setting them in 'paragraphs' -- \
the para option), a way to number footnotes per page (the \
perpage option), to make footnotes disappear in a 'moving' \
argument (stable option) and to deal with multiple references \
to footnotes from the same place (multiple option). The package \
also has a range of techniques for labelling footnotes with \
symbols rather than numbers. Some of the functions of the \
package are overlap with the functionality of other packages. \
The para option is also provided by the manyfoot and bigfoot \
packages, though those are both also portmanteau packages. \
(Don't be seduced by fnpara, whose implementation is improved \
by the present package.) The perpage option is also offered by \
footnpag and by the rather more general-purpose perpage"
LICENSE = "LPPL-1.0"

PV = "2026.226.7.0bsvn77682"

RPM_NAME = "texlive-footmisc-2026.226.7.0bsvn77682-60.2.noarch.rpm"
RPM_HASH = "4612f04371e519a75da4cf274a59bfc3f2a4dbb5149bd48521d44348cb37a974e5d4a250409d5158f45eabaf9da7b18f58699ec1ea2a7485d9d0197225b39ebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footmisc-2011-06-06.sty \
tex-footmisc-2022-02-14.sty \
tex-footmisc.sty \
texlive-footmisc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
