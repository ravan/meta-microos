SUMMARY = "Styles for using BibLaTeX for work in philosophy"
DESCRIPTION = "The bundle offers two styles - philosophy-classic and \
philosophy-modern - that facilitate the production of two \
different kinds of bibliography, based on the authoryear style, \
with options and features to manage the information about the \
translation of foreign texts or their reprints. Though the \
package's default settings are based on the conventions used in \
Italian publications, these styles can be used with every \
language recognized by babel, possibly with some simple \
redefinitions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.8gsvn64414"

RPM_NAME = "texlive-biblatex-philosophy-2026.226.1.9.8gsvn64414-61.2.noarch.rpm"
RPM_HASH = "95b5a344cfbeb33f84d53857f9cf7f19fab7b00abcd464ea5b84fae1a57b44f193c8a27ceccb6ead881f52b8147c9f52fcd3729ee9d4cd0f46dc62dc6e17322c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-english-philosophy.lbx \
tex-french-philosophy.lbx \
tex-italian-philosophy.lbx \
tex-philosophy-classic.bbx \
tex-philosophy-classic.cbx \
tex-philosophy-modern.bbx \
tex-philosophy-modern.cbx \
tex-philosophy-standard.bbx \
tex-philosophy-verbose.bbx \
tex-philosophy-verbose.cbx \
tex-spanish-philosophy.lbx \
texlive-biblatex-philosophy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authortitle.bbx \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-standard.bbx \
tex-verbose-trad2.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
