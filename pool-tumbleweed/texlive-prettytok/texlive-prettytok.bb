SUMMARY = "Pretty-print token lists"
DESCRIPTION = "Pretty-print token lists to HTML file for debugging purposes. \
Open the file in any browser to view the result. Can be used to \
replace \\tl_analysis_show:n."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn76924"

RPM_NAME = "texlive-prettytok-2026.226.0.0.2.0svn76924-59.2.noarch.rpm"
RPM_HASH = "7833bea8392923a55e94e0398af27d0b7ca2b8274b98be1839a159b6a0976b5c19768fdb71696042854997ece3119b3e27a81a9bc274ff0f86ae13d0ed856cc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prettytok.sty \
texlive-prettytok"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-precattl.sty \
texlive \
texlive-filecontentsdef \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-precattl \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
