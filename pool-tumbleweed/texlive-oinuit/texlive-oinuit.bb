SUMMARY = "LaTeX Support for the Inuktitut Language"
DESCRIPTION = "The package provides a set of Lambda (Omega LaTeX) typesetting \
tools for the Inuktitut language. Five different input methods \
are supported and with the necessary fonts are also provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn28668"

RPM_NAME = "texlive-oinuit-2026.226.svn28668-61.2.noarch.rpm"
RPM_HASH = "fc08e2807a9e13265d46838f9147f8bd5953032852db549208b4fec612256c4b12fa5c28b56012b3d397e8e2bf50e084226d46ca9bae149bb9106ffeb78af60f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Inuit.tfm \
tex-Inuitb.tfm \
tex-Inuitbo.tfm \
tex-Inuito.tfm \
tex-litcmr.fd \
tex-litenc.def \
tex-oinuit.map \
tex-oinuit.sty \
texlive-oinuit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oinuit-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
