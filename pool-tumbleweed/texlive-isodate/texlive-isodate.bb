SUMMARY = "Tune the output format of dates according to language"
DESCRIPTION = "This package provides ten output formats of the commands \
\\today, \\printdate, \\printdateTeX, and \\daterange (partly \
language dependent). Formats available are: ISO (yyyy-mm-dd), \
numeric (e.g. dd.\\,mm.~yyyy), short (e.g. dd.\\,mm.\\,yy), TeX \
(yyyy/mm/dd), original (e.g. dd. mmm yyyy), short original \
(e.g. dd. mmm yy), as well as numerical formats with Roman \
numerals for the month. The commands \\printdate and \
\\printdateTeX print any date. The command \\daterange prints a \
date range and leaves out unnecessary year or month entries. \
This package supports German (old and new rules), Austrian, US \
English, British English, French, Danish, Swedish, and \
Norwegian."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.28svn78101"

RPM_NAME = "texlive-isodate-2026.226.2.28svn78101-63.2.noarch.rpm"
RPM_HASH = "2e16c17e23a95d1580804c11c2af1b818380ec2883783c91fb17049c560e6fb026b2a740f2458726ea0caaa8e0121012221be401968224fa84e80c084a2723dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isodate.sty \
tex-isodateo.sty \
texlive-isodate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-substr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
