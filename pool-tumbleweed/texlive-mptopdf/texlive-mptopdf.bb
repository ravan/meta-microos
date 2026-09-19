SUMMARY = "Mpost to PDF, native MetaPost graphics inclusion"
DESCRIPTION = "The mptopdf script does standalone conversion from mpost to \
PDF, using the supp-* and syst-* files. They also allow native \
MetaPost graphics inclusion in LaTeX (via pdftex.def) and \
ConTeXt. They can be used independently of the rest of ConTeXt, \
yet are maintained as part of it. So in TeX Live we pull them \
out to this separate package for the benefit of LaTeX users who \
do not install the rest of ConTeXt. This can be found on CTAN \
in macros/pdftex/graphics. The files originally come from the \
ConTeXt distribution. TL uses the repackaging from \
https://github.com/gucci-on-fleek/context-packaging."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn78010"

RPM_NAME = "texlive-mptopdf-2026.226.svn78010-61.2.noarch.rpm"
RPM_HASH = "2e153088dff5c2e70b068f8f79660f98f378be9ac8c8dfaf730061bd4c3555b4637ebd9d4b1ced42a782e942dc1aab1930fb8306688f8e37323007312d83e8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mptopdf.tex \
texlive-mptopdf"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Config \
perl-File--Basename \
perl-Getopt--Long \
perl-strict \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mptopdf-bin \
texlive-pdftex \
texlive-plain \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
