SUMMARY = "Itrans input maps for use with XeLaTeX"
DESCRIPTION = "The package provides maps for use with XeLaTeX with coding done \
using itrans. Fontspec maps are provided for Devanagari \
(Sanskrit), for Sanskrit in Kannada and for Kannada itself."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2svn55475"

RPM_NAME = "texlive-xetex-itrans-2026.226.4.2svn55475-59.4.noarch.rpm"
RPM_HASH = "324049dfd106eb66520f6de16fd6e13e4c80d6241d52362b342d2e6053a99e78513fde0ac030e8e55e0e1191db9488b5b0806522f503cb8809fa6dae30080737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-brh-kan.map \
tex-itrans-dvn.map \
tex-itrans-iast.map \
tex-itrans-kan.map \
tex-itrans-sankan.map \
tex-itrans-santel.map \
tex-itrans-sdvn.map \
tex-itrans-tamil.map \
tex-itrans-tel.map \
texlive-xetex-itrans"

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
