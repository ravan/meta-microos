SUMMARY = "Change format of \\today with commands for current time"
DESCRIPTION = "Provides various different formats for the text created by the \
command \\today, and also provides commands for displaying the \
current time (or any given time), in 12-hour, 24-hour or text \
format. The package overrides babel's date format, having its \
own library of date formats in different languages. The package \
requires the fmtcount package. This package is now obsolete and \
has been replaced by datetime2."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.60svn36650"

RPM_NAME = "texlive-datetime-2026.226.2.60svn36650-61.2.noarch.rpm"
RPM_HASH = "3326db64a6701648d62aabcb63347e623461883b45f271e598b8edefd97532c21cfd84ddcce342bf4821fee63d348bc7afe430d89dbeb0d70e34ac5ce988dbd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime-defaults.sty \
tex-datetime.sty \
tex-dt-UKenglish.def \
tex-dt-USenglish.def \
tex-dt-american.def \
tex-dt-australian.def \
tex-dt-austrian.def \
tex-dt-bahasa.def \
tex-dt-basque.def \
tex-dt-breton.def \
tex-dt-british.def \
tex-dt-bulgarian.def \
tex-dt-canadian.def \
tex-dt-catalan.def \
tex-dt-croatian.def \
tex-dt-czech.def \
tex-dt-danish.def \
tex-dt-dutch.def \
tex-dt-esperanto.def \
tex-dt-estonian.def \
tex-dt-finnish.def \
tex-dt-french.def \
tex-dt-galician.def \
tex-dt-german.def \
tex-dt-greek.def \
tex-dt-hebrew.def \
tex-dt-icelandic.def \
tex-dt-irish.def \
tex-dt-italian.def \
tex-dt-latin.def \
tex-dt-lsorbian.def \
tex-dt-magyar.def \
tex-dt-naustrian.def \
tex-dt-newzealand.def \
tex-dt-ngerman.def \
tex-dt-norsk.def \
tex-dt-polish.def \
tex-dt-portuges.def \
tex-dt-romanian.def \
tex-dt-russian.def \
tex-dt-samin.def \
tex-dt-scottish.def \
tex-dt-serbian.def \
tex-dt-slovak.def \
tex-dt-slovene.def \
tex-dt-spanish.def \
tex-dt-swedish.def \
tex-dt-turkish.def \
tex-dt-ukraineb.def \
tex-dt-usorbian.def \
tex-dt-welsh.def \
texlive-datetime"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fmtcount.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
