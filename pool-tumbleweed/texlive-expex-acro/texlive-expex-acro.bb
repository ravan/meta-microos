SUMMARY = "Wrapper for the expex package"
DESCRIPTION = "This is a small wrapper for the expex package, adding ways to \
define, use, and summarize glossing abbreviations. It also \
provides commands to refer to examples, as well as some inline \
formatting commands commonly used in linguistics."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.3svn68046"

RPM_NAME = "texlive-expex-acro-2026.226.0.0.0.3svn68046-59.2.noarch.rpm"
RPM_HASH = "1a2dafb41a776763c78886fcb81bf3db9e39d2ca52d140546dda4400902429b1aa5377a63ad5c8d5f3c4ac643a3c2cb8a6b2761b7d1adca2517f04918e23c442"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-expex-acro.sty \
texlive-expex-acro"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-acro.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-expex.sty \
tex-l3keys2e.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
