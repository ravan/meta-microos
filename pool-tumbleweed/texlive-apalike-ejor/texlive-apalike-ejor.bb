SUMMARY = "A BibTeX style file for the European Journal of Operational Research"
DESCRIPTION = "This package contains a BibTeX style file, apalike-ejor.bst, \
made to follow the European Journal of Operational Research \
reference style guidelines. It is a fork of apalike version \
0.99a, by Oren Patashnik, and consists of minor modifications \
of standard APA style. Among other changes it adds support for \
hyperlinked URL and DOI fields (which requires hyperref)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn76790"

RPM_NAME = "texlive-apalike-ejor-2026.226.1.2.0svn76790-61.2.noarch.rpm"
RPM_HASH = "65621971ec9a9c47e88351d05c037316e91b9477d4f39f1c753f6dbc8a3633b35abbe1523fa34cabe6a265fe7d78940031943515a3abc1271e2862badb9b0ac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike-ejor"

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
