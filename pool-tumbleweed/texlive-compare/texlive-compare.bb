SUMMARY = "Compare two strings"
DESCRIPTION = "The file defines a macro \\compare, which takes two arguments; \
the macro expands to -1, 0, 1, according as the first argument \
is less than, equal to, or greater than the second argument. \
Sorting is alphabetic, using ASCII collating order."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn54265"

RPM_NAME = "texlive-compare-2026.226.svn54265-60.2.noarch.rpm"
RPM_HASH = "5d3dd93997cc1e298eddb16f23da26bcff00045ac0ca70c01c18c0daff1c16ffe79e8108dcad7006c54f7e344f93634a193e12188452c2c07c8f297f339a3524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-compare.tex \
texlive-compare"

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
