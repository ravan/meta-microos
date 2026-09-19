SUMMARY = "Curriculum vitae for French use"
DESCRIPTION = "The package allows the user to set up a curriculum vitae as a \
French employer will expect."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn59638"

RPM_NAME = "texlive-esieecv-2026.226.svn59638-61.4.noarch.rpm"
RPM_HASH = "c05c80dc4c31a48714921b35f2a63ccefcbc2aa759a14445fd0bf03cdecb858a108f94e94b3745cb414ebc81ebd035440027034a97848a40feb3909e856cbe44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ESIEEcv.sty \
texlive-esieecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
