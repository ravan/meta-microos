SUMMARY = "Package for typesetting exam scripts"
DESCRIPTION = "Provides a class exam.cls, which eases production of exams, \
even by a LaTeX novice. Simple commands are provided to: create \
questions, parts of questions, subparts of parts, and \
subsubparts of subparts, all with optional point values; create \
a grading table, indexed either by question number (listing \
each question and the total possible points for that question) \
or by page number (listing each page with points and the total \
possible points for that page); create headers and footers that \
are each specified in three parts: one part to be left \
justified, one part to be centered, and one part to be right \
justified, in the manner of fancyhdr. Headers and/or footers \
can be different on the first page of the exam, can be \
different on the last page of the exam, and can vary depending \
on whether the page number is odd or even, or on whether the \
current page continues a question from a previous page, or on \
whether the last question on the current page continues onto \
the following page. Multiple line headers and/or footers are \
allowed, and it's easy to increase the part of the page devoted \
to headers and/or footers to allow for this. Note that the \
bundle exams also provides a file exam.cls; the two bundles \
therefore clash, and should not be installed on the same \
system."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.704svn77682"

RPM_NAME = "texlive-exam-2026.226.2.704svn77682-59.2.noarch.rpm"
RPM_HASH = "2d8e8c813984dd77fe8a0c7230db66a45c2371d1764acae52ee01fa12b36d202041b19d30862941b7b4f8f30a6197f6a5feee6abc163e6469dc604a82ef31b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exam.cls \
texlive-exam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-color.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
