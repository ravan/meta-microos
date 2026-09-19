SUMMARY = "Perl script to help generate dtx and ins files"
DESCRIPTION = "The makedtx bundle is provided to help LaTeX2e developers to \
write the code and documentation in separate files, and then \
combine them into a single .dtx file for distribution. It \
automatically generates the character table, and also writes \
the associated installation (.ins) script."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77871"

RPM_NAME = "texlive-makedtx-2026.226.1.3svn77871-59.2.noarch.rpm"
RPM_HASH = "6abc1bca4e75781989787a44fe71fa1de034763f1133b033934f260dd016fee6c27d1277b529fc6450015c489e03a8c3e4d9e131dfe8d5ce7a0f82741f24c9c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-creatdtx.sty \
texlive-makedtx"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-makedtx-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
