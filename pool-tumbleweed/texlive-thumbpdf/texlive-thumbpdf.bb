SUMMARY = "Thumbnails for pdfTeX and dvips/ps2pdf"
DESCRIPTION = "A Perl script that provides support for thumbnails in pdfTeX \
and dvips/ps2pdf. The script uses ghostscript to generate the \
thumbnails which get represented in a TeX readable file that is \
read by the package thumbpdf.sty to automatically include the \
thumbnails. This arrangement works with both plain TeX and \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.227.3.17svn62518"

RPM_NAME = "texlive-thumbpdf-2026.227.3.17svn62518-62.2.noarch.rpm"
RPM_HASH = "0d31aa9306abfd121eec888ab7661ad5bbbd53384926eef4673d6ff3743a11123f2a7b4fc82aa1d1cd8b0a4e6937cc30ec363c4df50047250d0ffa04e6b5110e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thumbpdf.sty \
tex-thumbpdf.tex \
texlive-thumbpdf"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Config \
perl-Getopt--Long \
perl-strict \
sed \
tex-ifluatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-thumbpdf-bin"

inherit rpm
