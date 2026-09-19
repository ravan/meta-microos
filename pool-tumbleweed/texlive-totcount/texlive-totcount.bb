SUMMARY = "Find the last value of a counter"
DESCRIPTION = "The package records the value that was last set, for any \
counter of interest; since most such counters are simply \
incremented when they are changed, the recorded value will \
usually be the maximum value."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-totcount-2026.226.1.2svn77682-59.2.noarch.rpm"
RPM_HASH = "dcfd55354edc18f24244712b64032a227da6619b5224251343762093fcffa5102bde9a2b77e82754bbf50346c033e96bddc9d2c6d16ef6228eb062df27302c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-totcount.sty \
texlive-totcount"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
