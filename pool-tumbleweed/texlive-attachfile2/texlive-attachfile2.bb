SUMMARY = "Attach files into PDF"
DESCRIPTION = "This package can be used to attach files to a PDF document. It \
is a further development of Scott Pakin's package attachfile \
for pdfTeX. Apart from bug fixes, this package adds support for \
dvips, some new options, and gets and writes meta information \
data about the attached files."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.12svn77682"

RPM_NAME = "texlive-attachfile2-2026.226.2.12svn77682-60.2.noarch.rpm"
RPM_HASH = "3262903581bcc68de5f67934f26b126a0373defb48ec6cdabf2ef73d457618aa85792f02ffbf77a3c4206ee57026735ab983526ba5cacf5c7512e65842b59c8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atfi-dvipdfmx.def \
tex-atfi-dvips.def \
tex-atfi-luatex.def \
tex-atfi-pdftex.def \
tex-attachfile2.sty \
texlive-attachfile2"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Digest--MD5 \
perl-Getopt--Long \
perl-POSIX \
perl-strict \
sed \
tex-color.sty \
tex-hycolor.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-infwarerr.sty \
tex-keyval.sty \
tex-kvoptions.sty \
tex-ltxcmds.sty \
tex-pdfescape.sty \
tex-pdftexcmds.sty \
texlive \
texlive-attachfile2-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
