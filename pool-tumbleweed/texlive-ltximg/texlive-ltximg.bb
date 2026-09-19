SUMMARY = "Extract LaTeX environments into separate image files"
DESCRIPTION = "ltximg is a Perl script that automates the process of \
extracting and converting environments provided by TikZ, \
PStricks and other packages from input file to image formats \
and standalone files using ghostscript and poppler-utils. It \
generates a file with only extracted environments and another \
with all extracted environments converted to \\includegraphics."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.1svn59335"

RPM_NAME = "texlive-ltximg-2026.226.2.1svn59335-59.2.noarch.rpm"
RPM_HASH = "3143f538cf456637ca2a50ff3667229e00e792dc5f382bb9144e8eefd80f1c0a34f7a88b0ebe996078bab7272960a8cd8d431e3a0b2926d669df31465457fb94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltximg"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Archive--Tar \
perl-Config \
perl-Cwd \
perl-Data--Dumper \
perl-Env \
perl-File--Basename \
perl-File--Copy \
perl-File--Find \
perl-File--Path \
perl-File--Spec--Functions \
perl-File--Temp \
perl-FileHandle \
perl-Getopt--Long \
perl-IO--Compress--Zip \
perl-POSIX \
perl-Term--ANSIColor \
perl-autodie \
perl-if \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ltximg-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
