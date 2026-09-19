SUMMARY = "Expandable \\@testopt (and related) macros"
DESCRIPTION = "The package provides an expandable variant of the LaTeX kernel \
command \\@testopt, named \\@expandable@testopt, and a more \
general \\@expandable@ifopt, both intended for package writers. \
Also we have a variant of \\newcommand which uses these macros \
to check for optional arguments."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn15878"

RPM_NAME = "texlive-exp-testopt-2026.226.0.0.3svn15878-59.2.noarch.rpm"
RPM_HASH = "235054af41aaab870b500a395ead75ef533c65410b463a5fd46478a1916d609f1eda198e2ad3ba0871533e0d6bbf896286d1a23fc1602014dde9b13cc12fced2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exp-testopt.sty \
texlive-exp-testopt"

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
