SUMMARY = "Macro tools by Mike Piff"
DESCRIPTION = "The set (now) consists of: a small package for dealing with \
duplicate-numbered output pages; newproof, for defining \
mathematical proof structures; onepagem for omitting the page \
number in one-page documents and time, which prints a 12-hour \
format time."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn21894"

RPM_NAME = "texlive-piff-2026.226.svn21894-58.2.noarch.rpm"
RPM_HASH = "3f7bdf35b45f18b1734dccb40a772e3025f1af37c6212dd2c448b6c30a2cb1b3dbeda0969ac65f6a9ea4289ee7a3c8f8a1a007cadad63760c2202d5d4d0d6380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-duplicat.sty \
tex-newproof.sty \
tex-onepagem.sty \
tex-time.sty \
texlive-piff"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
