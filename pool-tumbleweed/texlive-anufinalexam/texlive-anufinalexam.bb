SUMMARY = "LaTeX document shell for ANU final exam"
DESCRIPTION = "This LaTeX document shell is created for the standard \
formatting of final exams in The Australian National \
University."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn26053"

RPM_NAME = "texlive-anufinalexam-2026.226.svn26053-61.2.noarch.rpm"
RPM_HASH = "bafe8ddfa210b1cb35be894757b4c40c02eb930103ef90d5d415d8c49830c2abf65b5992aac844c7dba77d5ceb86c1e859b8b1db92db3451cf39f4ceca63a0aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anufinalexam"

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
