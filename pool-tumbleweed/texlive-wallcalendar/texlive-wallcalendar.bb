SUMMARY = "A wall calendar class with custom layouts"
DESCRIPTION = "This package provides a wall calendar class with custom layouts \
and support for internationalization. It comes with the \
following layouts: Full page photo, the calendar days overlaid \
with opacity Full page photo, the photo above the calendar days \
Small landscape photo, with a calendar grid Year planner \
Thumbnails and captions Varnish mask There is also support for \
loading event marks from a CSV file."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.1svn75649"

RPM_NAME = "texlive-wallcalendar-2026.226.1.3.1svn75649-60.2.noarch.rpm"
RPM_HASH = "3307ef3912c9390105a210e6b697efb9f6749ae4df24b348555770d0a7dabdc14c0c662aafaf9592137854fe45c5525da71c9283612c926a5667a01d8faaea5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wallcalendar-czech.tex \
tex-wallcalendar-dutch.tex \
tex-wallcalendar-english.tex \
tex-wallcalendar-french.tex \
tex-wallcalendar-german.tex \
tex-wallcalendar-hungarian.tex \
tex-wallcalendar-italian.tex \
tex-wallcalendar-japanese.tex \
tex-wallcalendar-norwegian.tex \
tex-wallcalendar-portuguese.tex \
tex-wallcalendar-romanian.tex \
tex-wallcalendar-serbian.tex \
tex-wallcalendar-slovakian.tex \
tex-wallcalendar-slovenian.tex \
tex-wallcalendar-spanish.tex \
tex-wallcalendar-swedish.tex \
tex-wallcalendar-thai.tex \
tex-wallcalendar.cls \
texlive-wallcalendar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-calc.sty \
tex-ccicons.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-luacode.sty \
tex-memoir.cls \
tex-microtype.sty \
tex-multicol.sty \
tex-nag.sty \
tex-pdftexcmds.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-wasysym.sty \
tex-xcoffins.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
