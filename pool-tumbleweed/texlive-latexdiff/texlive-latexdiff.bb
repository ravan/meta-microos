SUMMARY = "Determine and mark up significant differences between LaTeX files"
DESCRIPTION = "Latexdiff is a Perl script for visual mark up and revision of \
significant differences between two LaTeX files. Various \
options are available for visual markup using standard LaTeX \
packages such as color. Changes not directly affecting visible \
text, for example in formatting commands, are still marked in \
the LaTeX source. A rudimentary revision facility is provided \
by another Perl script, latexrevise, which accepts or rejects \
all changes. Manual editing of the difference file can be used \
to override this default behaviour and accept or reject \
selected changes only."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77278"

RPM_NAME = "texlive-latexdiff-2026.226.svn77278-61.2.noarch.rpm"
RPM_HASH = "b7dc3fb61fd5a31cffb5acf8a9b04e1275e58da2958e5a0482aff2c35f9d4ebf42d7c73dd61db3af9afa9d53cd7006ff58ced2170eff98301b069c21379cf6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexdiff"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Exporter \
perl-File--Basename \
perl-File--Copy \
perl-File--Path \
perl-File--Spec \
perl-File--Temp \
perl-Getopt--Long \
perl-IPC--Open2 \
perl-IPC--Open3 \
perl-Pod--Usage \
perl-constant \
perl-integer \
perl-strict \
perl-utf8 \
perl-vars \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latexdiff-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
