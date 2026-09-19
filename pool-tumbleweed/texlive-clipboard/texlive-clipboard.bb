SUMMARY = "Copy and paste into and across documents"
DESCRIPTION = "The clipboard package provides a basic framework for copying \
and pasting text and commands into and across multiple \
documents. It replaces the copypaste package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn78101"

RPM_NAME = "texlive-clipboard-2026.226.0.0.3svn78101-60.2.noarch.rpm"
RPM_HASH = "7e704b2aad1d14cc271b4599f4c7e64b0ec4f37669b04ce4cdfb851ec90334f78d7894455fee72d0a5f844187901f7cdf2847435397374032f851a89bede9ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clipboard.sty \
texlive-clipboard"

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
