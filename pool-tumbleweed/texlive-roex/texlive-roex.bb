SUMMARY = "Metafont-PostScript conversions"
DESCRIPTION = "A Metafont support package including: epstomf, a tiny AWK \
script for converting EPS files into Metafont; mftoeps for \
generating (encapsulated) PostScript files readable, e.g., by \
CorelDRAW, Adobe Illustrator and Fontographer; a collection of \
routines (in folder progs) for converting Metafont-coded \
graphics into encapsulated PostScript; and roex.mf, which \
provides Metafont macros for removing overlaps and expanding \
strokes. In mftoeps, Metafont writes PostScript code to a \
log-file, from which it may be extracted by either TeX or AWK."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn45818"

RPM_NAME = "texlive-roex-2026.226.svn45818-60.2.noarch.rpm"
RPM_HASH = "9a68b7be6305442cc5200f99d35336e7fd3e859da43e7848e019896a52ba58884033b7cfcc19677c38bdcbee9132765c5d443403c310d1c5e4a18bcfc7229ce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roex"

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
