SUMMARY = "Support for Cooperative Writing and editorial comments"
DESCRIPTION = "This package for Cooperative Writing supports editorial \
comments and gives some extra support for writing and \
submitting papers, such as anonymization commands for any \
document that involves more than one author or editor. The \
general behavior of this package is to provide different ways \
of marking your text, for example with comments or to-do-notes, \
suggestions to add, remove or change text that can be totally \
suppressed from the output when desired. Mostly, this can be \
easily done using one of the three main option states: editing, \
submit, and publish. Users should use the editing state most of \
the time. In this state, all markings will appear and \
anonymization will be off. When submitting, the submit state \
will provide a clean article, without any markings, but \
anonymized. It is possible to use the options submit and \
noanonymize together. Publish will never anonymize. The goal is \
to make the submit and publish documents states minimally \
invasive, to avoid any clash with publishers' styles. Commands \
were inspired from different packages that do not work together \
very well, such as ed, todonotes, and color-edits."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.4svn76924"

RPM_NAME = "texlive-coop-writing-2026.226.1.2.4svn76924-61.2.noarch.rpm"
RPM_HASH = "9fb857a45b1a41b9c1ac2d5d855e7e5056d5d7166fee057013ee492efca82b0fa43dff3aa74338f620811c2a9fc689cc8d60af33e892308cb2dfb175a3a1f0dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coop-writing.sty \
texlive-coop-writing"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-csquotes.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-iflang.sty \
tex-mdframed.sty \
tex-soulutf8.sty \
tex-tocloft.sty \
tex-ulem.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
