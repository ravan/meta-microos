SUMMARY = "Convert dates from Gregorian to Japanese calender"
DESCRIPTION = "This LaTeX package provides commands to convert from the \
Gregorian calendar (e. g. 2018/8/28) to the Japanese rendering \
of the Japanese calendar (e. g. Heisei 30 nen 8 gatsu 28 nichi; \
actually with kanji characters). You can choose whether the \
numbers are written in Western numerals or kanji numerals. Note \
that the package only deals with dates in the year 1873 or \
later, where the Japanese calendar is really a Gregorian \
calendar with a different notation of years."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn67594"

RPM_NAME = "texlive-bxwareki-2026.226.0.0.7svn67594-59.2.noarch.rpm"
RPM_HASH = "127a3e423072d89bc750a0c00892e21ce91addf1de5d2fd521b6f0efb3d25e92867a626bd5895dae9222537ef0cdf178fb049499addf54e853c2c2c117ffe287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxwareki-cd.def \
tex-bxwareki.sty \
texlive-bxwareki"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
