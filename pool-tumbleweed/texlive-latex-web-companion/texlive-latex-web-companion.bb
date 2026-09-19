SUMMARY = "Examples from The LaTeX Web Companion"
DESCRIPTION = "The source of the examples printed in the book, together with \
necessary supporting files."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn29349"

RPM_NAME = "texlive-latex-web-companion-2026.226.svn29349-61.2.noarch.rpm"
RPM_HASH = "725976e53e041409db67441e1771948f8cea661bcd331416aed3a17be91f11684e71f37ca3fc8e6ea14f1bd0aa39b5805ccb5b3d57b420c9edf980102727b759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-SGMLS \
perl-SGMLS--Output \
perl-SGMLS--Refs \
perl-SGMLS-Attribute \
perl-SGMLS-Element \
perl-SGMLS-Entity \
perl-SGMLS-Event \
perl-SGMLS-Notation \
texlive-latex-web-companion"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
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
