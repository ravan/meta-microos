SUMMARY = "Formulas and graphs for the EO programming language"
DESCRIPTION = "This package helps you format expressions of [?] -calculus and \
draw SODG graphs the EO programming language."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.23.0svn77164"

RPM_NAME = "texlive-eolang-2026.226.0.0.23.0svn77164-61.4.noarch.rpm"
RPM_HASH = "a7cfc5255442edd2d1cb68dfc744c10876db71efc0e4e2dfe000b0b8aa6a12bc6c9b8f34fa7781bac21e9e3d2a01063a7fa048668cf21f710755b97055f2b1b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eolang.sty \
texlive-eolang"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-strict \
perl-warnings \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-fancyvrb.sty \
tex-hyperref.sty \
tex-iexec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-pdftexcmds.sty \
tex-pgfopts.sty \
tex-shellesc.sty \
tex-stmaryrd.sty \
tex-tikz.sty \
tex-trimclip.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-adjustbox \
texlive-amsfonts \
texlive-amsmath \
texlive-eolang-bin \
texlive-everyshi \
texlive-fancyvrb \
texlive-filesystem \
texlive-hyperref \
texlive-iexec \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdftexcmds \
texlive-pgf \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin \
texlive-stmaryrd \
texlive-xstring"

inherit rpm
