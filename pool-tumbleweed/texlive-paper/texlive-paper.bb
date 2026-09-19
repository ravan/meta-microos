SUMMARY = "Versions of article class, tuned for scholarly publications"
DESCRIPTION = "A pair of classes derived from article, tuned for producing \
papers for journals. The classes introduce new layout options \
and font commands for sections/parts, and define a new keywords \
environment, subtitle and institution commands for the title \
section and new commands for revisions."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0lsvn34521"

RPM_NAME = "texlive-paper-2026.226.1.0lsvn34521-58.2.noarch.rpm"
RPM_HASH = "b6e162df59f7ec640833eedfade8a9136928070fdaea0ddf558864e0fbeb4c5e6fd513e4833ba7f491f25948fcd80d27d7b6a45d3217b7790881076364fa7e46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-journal.cls \
tex-journal.sty \
tex-paper.cls \
tex-paper.sty \
texlive-paper"

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
