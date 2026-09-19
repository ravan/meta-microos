SUMMARY = "Patch \\marginpar to avoid overfull margins"
DESCRIPTION = "Authors using LaTeX to typeset books with significant margin \
material often run into the problem of long notes running off \
the bottom of the page. A typical workaround is to insert \
\\vshift commands by hand, but this is a tedious process that is \
invalidated when pagination changes. Another workaround is \
memoir's \\sidebar function, but this can be unsatisfying for \
short textual notes, and standard marginpars cannot be mixed \
with sidebars. This package implements a solution to make \
marginpars 'just work' by keeping a list of floating inserts \
and arranging them intelligently in the output routine."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-marginfix-2026.226.1.2svn77682-59.2.noarch.rpm"
RPM_HASH = "8c545713f28654fff019feb44738742c22ec75a7b7a7b29be794f2c6c745682b896e908c9da6a1c5ae0140e9af30c325c3ce908e464e70d5415a557f620a8187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-marginfix.sty \
texlive-marginfix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
