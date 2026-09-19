SUMMARY = "Convert EPS to PDF using Ghostscript"
DESCRIPTION = "Epstopdf is a Perl script that converts an EPS file to an \
'encapsulated' PDF file (a single page file whose media box is \
the same as the original EPS's bounding box). The resulting \
file suitable for inclusion by pdfTeX as an image. The script \
is adapted to run both on Windows and on Unix-alike systems. \
The script makes use of Ghostscript for the actual conversion \
to PDF. It assumes Ghostscript version 6.51 or later, and (by \
default) suppresses its automatic rotation of pages where most \
of the text is not horizontal. LaTeX users may make use of the \
epstopdf package, which will run the epstopdf script 'on the \
fly', thus giving the illusion that pdfLaTeX is accepting EPS \
graphic files."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.36svn71782"

RPM_NAME = "texlive-epstopdf-2026.226.2.36svn71782-61.4.noarch.rpm"
RPM_HASH = "67d6fc8e80cb2c888faca30280401eb5328d13078bf79df9279766210ad7591cc98c153c8650bfde2f1d9ed308cb05a15a0a2577095566675eaca680dbc7ba29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epstopdf"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Temp \
perl-Getopt--Long \
perl-warnings \
sed \
tex-epstopdf-base.sty \
texlive \
texlive-epstopdf-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
