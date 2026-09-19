SUMMARY = "A LaTeX template for journal rebuttal letters"
DESCRIPTION = "This package provides an elegant LaTeX template designed for \
crafting professional rebuttal letters in response to editors \
or reviewers. It consists of a LaTeX class and a template, \
fine-tuned to support your publishing journey with several \
pre-defined commands that drastically speed up the process of \
preparing letters during the revision process. The repository \
hosts a template for writing responses to editors/reviewers \
comments for journal submissions written in LaTeX that is \
minimalistic in one way while pre-defined with several commands \
that drastically speed up the process of preparing letters \
during the revision process. Main Features of this template: \
With front page included Response ticks to mark as completed \
Custom response color Minimalistic design Everything is \
customizable Predefined commands for a journal name, submission \
ID, author, editor, associate editor, date, etc. Many macros \
included Predefined different valedictions for different types \
of submissions (e.g., Yours sincerely, Yours faithfully, Best \
regards, etc.) Custom greeting (e.g., 'Dear Editor' or bDear \
Editor-in-Chief' for regular submission, etc.) (Optional) Table \
of contents, jump to the reply you wish to address Option to \
add custom Signature (i.e. an image of your hand-written \
signature)"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn68556"

RPM_NAME = "texlive-jourrr-2026.226.svn68556-63.2.noarch.rpm"
RPM_HASH = "cf8c30dc6fe589ecfe1fb99e6d51f974954e89b447d7502c9df753fcfa8df48e14ea8356ea88c1860947b0c42e7528fc6da1a0a9050f47c5d3d69ab9ea4d8872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jourrr.cls \
texlive-jourrr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-bookmark.sty \
tex-fancyhdr.sty \
tex-fontawesome5.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-inputenc.sty \
tex-isodate.sty \
tex-parskip.sty \
tex-wasysym.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
