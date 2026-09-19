SUMMARY = "Find hyphenated words in a document"
DESCRIPTION = "Findhyph is a Perl script that will analyse the log file from \
running your document with \\tracingparagraphs=1 set. The output \
contains enough context to enable you to find the hyphenated \
word that's being referenced."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.4svn47444"

RPM_NAME = "texlive-findhyph-2026.226.3.4svn47444-59.2.noarch.rpm"
RPM_HASH = "6a48e96e4cf870a7e50148babef744c7bd6c9bf442b73941b0f5e70fbb267419e75d600346956148944c8e6841a2e95a2ab5d71a04db221a4ddeda530b41651b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-findhyph"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Std \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-findhyph-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
