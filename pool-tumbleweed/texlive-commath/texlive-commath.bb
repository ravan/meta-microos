SUMMARY = "Mathematics typesetting support"
DESCRIPTION = "Provides a range of differential, partial differential and \
delimiter commands, together with a \\fullfunction (function, \
with both domain and range, and function operation) and various \
reference commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn15878"

RPM_NAME = "texlive-commath-2026.226.0.0.3svn15878-60.2.noarch.rpm"
RPM_HASH = "753644f91181b555a0c70b5e816201e9238c250737b9e0c7473d117520d7d22255584322c92c413b0e80a2b58f8c009ef260e824ef30eafe85d69af4f71ddbf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-commath.sty \
texlive-commath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
