SUMMARY = "A logbook for people with type one diabetes"
DESCRIPTION = "Initially a logbook for me, a person with type one diabetes \
mellitus, this evolved over time into a TeX project, making it \
prettier and/or easier to use. I've made it simple to use, \
while not forgoing the document's beauty or the speed of input. \
The logbook, with slight commenting out and editing, could be \
used as a journal by anybody, although the template and \
graphing functionality are set up for people using insulin \
injections and blood glucose teststrips, as well as \
counting/estimating carbs, protein, and fat. Note: The names of \
the package's files are not constructed using the long \
'diabetes-logbook', but the acronym 'dmlb' (for 'diabetes \
mellitus log book')."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77161"

RPM_NAME = "texlive-diabetes-logbook-2026.226.svn77161-59.2.noarch.rpm"
RPM_HASH = "463bc54d2bcfca7faee24d5391e988d8a6044373765e461d9eeb7d258a91693d4bf0e8bf005cd7234c736f6d8e992616fa055ce37b475481285ba5a1d59d32b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dmlb.sty \
texlive-diabetes-logbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-bookmark.sty \
tex-ellipsis.sty \
tex-fontspec.sty \
tex-pgf.sty \
tex-pgfcalendar.sty \
tex-pgfplots.sty \
tex-pgfplotstable.sty \
tex-polyglossia.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
