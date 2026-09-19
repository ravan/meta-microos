SUMMARY = "Create some AmongUs characters in TikZ environments"
DESCRIPTION = "This package recreates some AmongUs characters in TikZ \
environments. Some interesting uses alongside other packages \
are also supported."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.2.0svn60880"

RPM_NAME = "texlive-tikz-among-us-2026.227.1.2.0svn60880-62.2.noarch.rpm"
RPM_HASH = "eef7ed2ff461ad2af756e9f5fa510f416e9ee600fc331d40846fd543776f7024eac37f427fb53e65136ab3964ba7e51f6a6f04b17e3b87eeaafdff2dbd829644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-among-us-fancyhdr.sty \
tex-tikz-among-us-watermark-eso-pic.sty \
tex-tikz-among-us.sty \
texlive-tikz-among-us"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-fancyhdr.sty \
tex-kvoptions.sty \
tex-tikz.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
