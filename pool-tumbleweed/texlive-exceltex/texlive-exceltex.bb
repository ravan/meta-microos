SUMMARY = "Get data from Excel files into LaTeX"
DESCRIPTION = "Exceltex is a LaTeX package combined with a helper program \
written in Perl. It provides an easy to use yet powerful and \
flexible way to get data from Spreadsheets into LaTeX. In \
contrast to other solutions, exceltex does not seek to make the \
creation of tables in LaTeX easier, but to get data from \
Spreadsheets into LaTeX as easily as possible. The Excel (TM) \
file format only acts as an interface between the spreadsheet \
application and exceltex because it is easily accessible (via \
the Spreadsheet::ParseExcel Perl module) and because most \
spreadsheet applications are able to read and write Excel \
files."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.5.1svn76924"

RPM_NAME = "texlive-exceltex-2026.226.0.0.5.1svn76924-59.2.noarch.rpm"
RPM_HASH = "62a4c9b34fe398f802411e5b917aaa835d305bf3e921de2460300296cbb049f86622ce120a7300574dcac12e523756aea19b76fbec4e5e4f89bfe63cc01b5605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exceltex.sty \
texlive-exceltex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Encode \
perl-Getopt--Long \
perl-Spreadsheet--ParseExcel \
perl-strict \
sed \
tex-color.sty \
tex-ulem.sty \
texlive \
texlive-exceltex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
