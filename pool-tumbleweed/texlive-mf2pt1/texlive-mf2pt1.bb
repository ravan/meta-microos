SUMMARY = "Convert stylized Metafont to PostScript Type 1"
DESCRIPTION = "mf2pt1 is a Perl script that facilitates producing PostScript \
Type 1 fonts from a Metafont source file. It is not, as the \
name may imply, an automatic converter of arbitrary Metafont \
fonts to Type 1 format. mf2pt1 imposes a number of restrictions \
on the Metafont input. If these restrictions are met, mf2pt1 \
will produce valid Type 1 output with more accurate control \
points than can be reverse-engineered by TeXtrace, mftrace, and \
other programs which convert bitmaps to outline fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.8svn71883"

RPM_NAME = "texlive-mf2pt1-2026.226.2.8svn71883-61.2.noarch.rpm"
RPM_HASH = "57b5b4735f5b849b7a2e31a8c413f60f1da95225df213999ec414635ae259fe1bd0c1a47b026f071dd8cec41dfa20d6cdda51932833de2615464af92453174b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mf2pt1"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-File--Spec \
perl-Getopt--Long \
perl-Math--Trig \
perl-Pod--Usage \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mf2pt1-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
