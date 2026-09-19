SUMMARY = "Crop PDF graphics"
DESCRIPTION = "A Perl script that can either trim pages of any whitespace \
border, or trim them of a fixed border."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.42svn66862"

RPM_NAME = "texlive-pdfcrop-2026.226.1.42svn66862-58.2.noarch.rpm"
RPM_HASH = "1e23cc68ddf92b8cfc5bfe025401d9bf11c2624f53fa36ae2fb0af19810a7d079bea20ae2d9ac79a6a6a80eff9fd7722cfe136ad564a9f9ab7e754edcbc8e3a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcrop"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Config \
perl-File--Copy \
perl-File--Spec \
perl-File--Spec--Functions \
perl-Getopt--Long \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdfcrop-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
