SUMMARY = "LaTeX class for typesetting exams"
DESCRIPTION = "This bundle provides a class examdesign. The class provides \
several features useful for designing tests or question sets: \
it allows for explicit markup of questions and answers; the \
class will, at the user's request, automatically generate \
answer keys; multiple versions of the same test can be \
generated automatically, with the ordering of questions within \
each section randomly permuted so as to minimize cheating; the \
generated answer keys can be constructed either with or without \
the questions included; environments are provided to assist in \
constructing the most common types of test question: matching, \
true/false, multiple-choice, fill-in-the-blank, and short \
answer/essay questions."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.101svn15878"

RPM_NAME = "texlive-examdesign-2026.226.1.101svn15878-59.2.noarch.rpm"
RPM_HASH = "6149f2f9d740352bf129af615173dbb2f5df3f22a1c07119c3c31c6f059c353e30bd15a4a17bdc07c2ee0cb78c186855395bc4b5b6a997b19e72dbd2dc5f815a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-examdesign.cls \
texlive-examdesign"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-enumerate.sty \
tex-keyval.sty \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
