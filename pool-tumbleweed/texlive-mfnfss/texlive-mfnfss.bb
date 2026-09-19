SUMMARY = "Packages to typeset oldgerman and pandora fonts in LaTeX"
DESCRIPTION = "This bundle contains two packages: - oldgerm, a package to \
typeset with old german fonts designed by Yannis Haralambous. - \
pandora, a package to typeset with Pandora fonts designed by \
Neena Billawala. Note that support for the Pandora fonts is \
also available via the pandora-latex package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-mfnfss-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "ad74b24b9393b0aea797e972d8206d3c3ce8845448d70e2428bc7efe489fa29bcbb43155983e24b6ba817eba2ce9cd7f135c270212059c188ed317640395fafc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oldgerm.sty \
tex-ot1panr.fd \
tex-ot1pss.fd \
tex-pandora.sty \
tex-uyfrak.fd \
tex-uygoth.fd \
tex-uyinit.fd \
tex-uyswab.fd \
texlive-mfnfss"

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
