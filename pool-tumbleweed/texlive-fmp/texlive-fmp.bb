SUMMARY = "Include Functional MetaPost in LaTeX"
DESCRIPTION = "The fmp package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-fmp-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "7a09f1f27ef2b18cc444c467af121193c4aaf11e56d5f10e8567f603d11155015fb47c5d0a47a88e07bb501005ff1ef66a1967a9d9ec51d27240d13cfd54067c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fmp.sty \
texlive-fmp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
