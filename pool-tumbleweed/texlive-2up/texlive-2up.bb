SUMMARY = "Macros to print two-up"
DESCRIPTION = "The 2up package offers considerable flexibility as to paper \
size and layout, and produces a standard dvi file without \
involving additional dvi or PostScript filters."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn55076"

RPM_NAME = "texlive-2up-2026.226.1.3asvn55076-61.2.noarch.rpm"
RPM_HASH = "5a39e7265e519e59a782cb188c64a7797bc7a32aac229924823c9d8a62b8e00edc61138ebc04a00e8d73a3d48070f192f2054b20dd4e0af57dbefd3018405ecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-2up.sty \
tex-2up.tex \
texlive-2up"

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
