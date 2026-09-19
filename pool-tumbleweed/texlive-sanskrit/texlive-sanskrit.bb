SUMMARY = "Sanskrit support"
DESCRIPTION = "A font and pre-processor suitable for the production of \
documents written in Sanskrit. Type 1 versions of the fonts are \
available."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.4_bsvn76869"

RPM_NAME = "texlive-sanskrit-2026.226.2.2.4_bsvn76869-60.2.noarch.rpm"
RPM_HASH = "dee697db462213ff7be54fd107749c8d3251e859fd94eb1d1954cdd1a5e6a907667e232d1bcd105c59f4cc271d30b0a73fd7599322f9be2930a32a938cbb63cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ot1skt.fd \
tex-skt.sty \
tex-skt10.tfm \
tex-skt8.tfm \
tex-skt9.tfm \
tex-sktb10.tfm \
tex-sktbs10.tfm \
tex-sktf10.tfm \
tex-sktfs10.tfm \
tex-skts10.tfm \
texlive-sanskrit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-relsize.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
