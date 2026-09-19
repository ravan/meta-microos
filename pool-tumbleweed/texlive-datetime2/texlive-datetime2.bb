SUMMARY = "Formats for dates, times and time zones"
DESCRIPTION = "This package provides commands for formatting dates, times and \
time zones and redefines \\today to use the same formatting \
style. In addition to \\today, you can also use \\DTMcurrenttime \
(current time) or \\DTMnow (current date and time). Dates and \
times can be saved for later use. The accompanying \
datetime2-calc package can be used to convert date-times to \
UTC+00:00. Language and regional support is provided by \
independently maintained and installed modules. The \
datetime2-calc package uses the pgfcalendar package (part of \
the PGF/TikZ bundle). This package replaces datetime.sty which \
is now obsolete."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.7svn77682"

RPM_NAME = "texlive-datetime2-2026.226.1.5.7svn77682-61.2.noarch.rpm"
RPM_HASH = "91524b5563f12ecdec0708e27d5d768a73d78dd9d7cb29bd682c0ce0464017a1bdb5ca9a0a0e5ada2fcce454c06fcc522ae28aeb8e8df6c93bdaa732a81f28b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-calc.sty \
tex-datetime2.sty \
texlive-datetime2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pgfcalendar.sty \
tex-pgfkeys.sty \
tex-tracklang.sty \
tex-xkeyval.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tracklang \
texlive-xkeyval"

inherit rpm
