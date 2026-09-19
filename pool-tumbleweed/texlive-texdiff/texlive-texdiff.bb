SUMMARY = "Compare documents and produce tagged merge"
DESCRIPTION = "Two files are compared and a new TeX file is output. When the \
output file is processed with (La)TeX it marks new changes with \
blue and old text with red with a strike-through line. \
Furthermore, passages with changes are marked at the margin \
with grey bars by the LaTeX changebar package."
LICENSE = "Artistic-1.0"

PV = "2026.227.0.0.4svn29752"

RPM_NAME = "texlive-texdiff-2026.227.0.0.4svn29752-62.2.noarch.rpm"
RPM_HASH = "1e7e46b224895bd8c29166e138cd25e1431509e8cf691b215be743a76683a4fbf37274b6f3fb8515bb8f7756cf0554b142a40de8aedb9abe7e60cad867f95deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdiff"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-Pod--Usage \
perl-re \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texdiff-bin"

inherit rpm
