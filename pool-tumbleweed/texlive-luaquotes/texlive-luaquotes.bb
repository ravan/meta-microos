SUMMARY = "Smart setting of quotation marks"
DESCRIPTION = "This package automatically generates quotation marks and \
punctuation depending on the selected language."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn65652"

RPM_NAME = "texlive-luaquotes-2026.226.1.4.0svn65652-59.2.noarch.rpm"
RPM_HASH = "fd6ae563f0b188acc35dd7a5182cc52a3e94cc288264f5a040793e4846de0ea8b372c30f1a496a27738411d9b2e8754881f28bb8e6df4d8b149edbe82bd7513b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luaquotes.sty \
texlive-luaquotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
