SUMMARY = "Typesets (two) streams of text running parallel"
DESCRIPTION = "For typesetting translated text and the original source, \
parallel on the same page, one above the other."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-parrun-2026.226.svn15878-58.2.noarch.rpm"
RPM_HASH = "5d23ea8bb60450e91d3e865649cf9dde2d564b882ffde6daf314ad1dedc0b5bf4f976377dd748e6d10629b23b4defd3e601692ab1b7b5450b6cac8b0b165da04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parrun.sty \
texlive-parrun"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
