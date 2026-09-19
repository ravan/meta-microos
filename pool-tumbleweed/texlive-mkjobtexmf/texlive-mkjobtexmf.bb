SUMMARY = "Generate a texmf tree for a particular job"
DESCRIPTION = "The package provides a Perl script, which runs a program and \
tries to find the names of file used. Two methods are \
available, option -recorder of (Web2C) TeX and the program \
strace. Then it generates a directory with a texmf tree. It \
checks the found files and tries sort them in this texmf tree. \
The script may be used for archiving purposes or to speed up \
later TeX runs."
LICENSE = "Artistic-1.0"

PV = "2026.226.0.0.8svn29725"

RPM_NAME = "texlive-mkjobtexmf-2026.226.0.0.8svn29725-61.2.noarch.rpm"
RPM_HASH = "0cdc8183ed4bc24acee2006ac029189b6c7480b909bd9ee9b47a72ff7d208c641c627d576223183ced58d474d74d73b05feb1bd268ec6f83365f217fba847bc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkjobtexmf"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-File--Copy \
perl-Getopt--Long \
perl-Pod--Usage \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mkjobtexmf-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
