SUMMARY = "Hooks for input files"
DESCRIPTION = "The package provides several file hooks (AtBegin, AtEnd, ...) \
for files read by \\input, \\include and \\InputIfFileExists. \
General hooks for all such files (e.g. all \\included ones) and \
file specific hooks only used for named files are provided; two \
hooks are provided for the end of \\included files -- one \
before, and one after the final \\clearpage."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8bsvn77682"

RPM_NAME = "texlive-filehook-2026.226.0.0.8bsvn77682-59.2.noarch.rpm"
RPM_HASH = "948462f3d2844380bfccb4c4e2aec4494835a9ade2dba1374b3a636c6b913d4e23297a32e6a0652b941a7b06095c9de6f45c245d0da2c4e182d1403be85185f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-filehook-2019.sty \
tex-filehook-2020.sty \
tex-filehook-fink.sty \
tex-filehook-listings.sty \
tex-filehook-memoir.sty \
tex-filehook-scrlfile.sty \
tex-filehook.sty \
tex-pgf-filehook.sty \
texlive-filehook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-kvoptions.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
