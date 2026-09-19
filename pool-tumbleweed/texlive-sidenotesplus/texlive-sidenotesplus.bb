SUMMARY = "Place referenced notes, alerts, figures and tables into the document margin"
DESCRIPTION = "Sidenotesplus is a comprehensive package for placing labeled or \
referenced notes, temporary alerts, bibliography references, \
figures and tables into the margin. Marginals can be either \
floated or at fixed positions relative to the text. Twoside \
symmetry is preserved. For BibLaTeX users, macros for side \
references are provided. Three margin styles are provided. \
Two-page symmetric layouts either as (i) Ragged outer with note \
reverences in the margin separator or (ii) justified with last \
line ragged outer. And (iii) a classic look, justified with \
last line ragged right and note reference to the left of the \
note, but two-page symmetry is lost. The command \\sidenote \
mimics the \\footnote command and provides labelled (numbers, \
alphabetic, roman) references. However, un-numbered and custom \
symbols can also be specified. Temporary sidealerts are \
rendered only if the package option alerton is specified. \
Alerts are useful as to do reminders during document \
development. Furthermore, captions for figures and tables can \
also be placed into margin. Also, full width environments for \
figures, tables and text are provided. The text environment can \
be partially widened, suitable if that extra space for an \
equation is required."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn74143"

RPM_NAME = "texlive-sidenotesplus-2026.226.1.05svn74143-60.2.noarch.rpm"
RPM_HASH = "251fc6143ffcbfbfc2148a531a71c6e160c9b064e1081c530cfead081cc9883c98f0259e06ba2a5729729b3300eed321b610fe42cd9ac1dc5cadf43db2c5884f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sidenotesplus.sty \
texlive-sidenotesplus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-caption.sty \
tex-changepage.sty \
tex-etoolbox.sty \
tex-ifoddpage.sty \
tex-l3keys2e.sty \
tex-marginnote.sty \
tex-mparhack.sty \
tex-ragged2e.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
