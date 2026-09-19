SUMMARY = "Make EPS work with both LaTeX/dvips and pdfLaTeX"
DESCRIPTION = "While pdfLaTeX has a number of nice features, its primary \
shortcoming relative to standard LaTeX+dvips is that it is \
unable to read ordinary Encapsulated PostScript (EPS) files, \
the most common graphics format in the LaTeX world. Purifyeps \
converts EPS files into a 'purified' form that can be read by \
both LaTeX+dvips and pdfLaTeX. The trick is that the standard \
LaTeX2e graphics packages can parse MetaPost-produced EPS \
directly. Hence, purifyeps need only convert an arbitrary EPS \
file into the same stylized format that MetaPost outputs."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn29725"

RPM_NAME = "texlive-purifyeps-2026.226.1.1svn29725-60.4.noarch.rpm"
RPM_HASH = "b7de616b8a2a4dc058d0dc8033acfea8085d29621a43341aa4af1b2a004ff55ac84d97ee30045fbd96a9f854d4c5f8204242caf9defb6c9efbc19057fc48f8c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-purifyeps"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-English \
perl-File--Basename \
perl-File--Spec \
perl-File--Temp \
perl-File--Which \
perl-FindBin \
perl-Getopt--Long \
perl-POSIX \
perl-Pod--Man \
perl-Pod--Usage \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-purifyeps-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
