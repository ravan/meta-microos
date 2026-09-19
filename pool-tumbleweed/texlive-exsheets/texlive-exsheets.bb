SUMMARY = "Create exercise sheets and exams"
DESCRIPTION = "The package provides the means to create exercises or questions \
and their corresponding solutions. The questions may be divided \
into classes and/or topics and may be printed selectively. \
Meta-data to questions can be added and recovered. The \
solutions may be printed where they are, or collected and \
printed at a later point in the document all together, \
section-wise or selectively by ID. The package provides the \
means to selectively include questions from an external file, \
and to control the style of headings of both questions and \
solutions. As of May 2017, this package has been superseded by \
its official successor xsim. exsheets itself is now considered \
obsolete, but will stay alive, and will continue to receive \
bugfix releases. However, new features will not be added any \
more."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21ksvn76924"

RPM_NAME = "texlive-exsheets-2026.226.0.0.21ksvn76924-59.2.noarch.rpm"
RPM_HASH = "979105caf9d133e314c70dfe42cd691be7181bf1f8a34305167eebf7477cf7ea1c2943b78acfd91d543ae15abe04927877a0b1b017e22d551aeb952d41c9051d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exsheets-configurations.cfg \
tex-exsheets-headings.cfg \
tex-exsheets-headings.def \
tex-exsheets-listings.sty \
tex-exsheets.sty \
texlive-exsheets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cntformats.sty \
tex-expl3.sty \
tex-listings.sty \
tex-tasks.sty \
tex-translations.sty \
tex-ulem.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
