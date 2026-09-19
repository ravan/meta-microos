SUMMARY = "Support software for downscaling graphics to be included by pdfLaTeX"
DESCRIPTION = "The package provides a script to scale pictures down to a \
target resolution before creating a PDF document with pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.50svn72650"

RPM_NAME = "texlive-pdflatexpicscale-2026.226.0.0.50svn72650-58.2.noarch.rpm"
RPM_HASH = "25fc410b73b3806c9350249c5f2b39a9d5abca3b49d5c8e68961d31221f1762d56be72a0cd41d2c3ae2b8cb0efff4e57836d6054607c88019c36712f1aa89b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdflatexpicscale"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-File--Copy \
perl-File--Spec \
perl-GD \
perl-Getopt--Long \
perl-Image--ExifTool \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdflatexpicscale-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
