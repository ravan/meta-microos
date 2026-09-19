SUMMARY = "A sample document in Plain TeX"
DESCRIPTION = "A file written with TeX, not using any packages or sty-files, \
to be compiled with TeX or pdfTeX only, not with LaTeX et al."
LICENSE = "LPPL-1.0"

PV = "2026.227.2svn76924"

RPM_NAME = "texlive-texonly-2026.227.2svn76924-62.2.noarch.rpm"
RPM_HASH = "7daa9c810aceaf6030dc7b3b2151bfb836ede5d18b3faa814f56bc880e3c9cb462e6c193309aa1dcc07c0a00ebc9bef802f1c5f4cbbf9457302ca35f5d4a0f4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texonly"

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
