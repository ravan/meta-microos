SUMMARY = "Create a .dtx file from a .sty file"
DESCRIPTION = "The package provides a Perl script that converts a .sty file \
(LaTeX package) to .dtx format (documented LaTeX source), by \
surrounding macro definitions with macro and macrocode \
environments. The macro name is automatically inserted as an \
argument to the macro environment. Code lines outside macro \
definitions are wrapped only in macrocode environments. Empty \
lines are removed. The script should not be thought to be fool \
proof and 100% accurate but rather as a good start to the \
business of making a .dtx file from an undocumented style file. \
Full .dtx files are generated. A template based on the skeleton \
file from dtxtut is used. User level macros are added \
automatically to the 'Usage' section of the .dtx file. A \
corresponding .ins file can be generated as well."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.4svn76924"

RPM_NAME = "texlive-sty2dtx-2026.226.2.4svn76924-64.2.noarch.rpm"
RPM_HASH = "bba3acbf35f0edbd9f4a87fdc094a563cae3ae742f86e76fac92b8e93fd9f3997ee222a202a534aa5e4adf6f08fc578bb7d604157102a17b98211b7d7f5fe3b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sty2dtx"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-Pod--Usage \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-sty2dtx-bin"

inherit rpm
