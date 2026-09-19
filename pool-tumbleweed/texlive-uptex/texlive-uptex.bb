SUMMARY = "Unicode version of pTeX"
DESCRIPTION = "upTeX is an extension of pTeX, using UTF-8 input and producing \
UTF-8 output. It was originally designed to improve support for \
Japanese, but is also useful for documents in Chinese and \
Korean. It can process Chinese simplified, Chinese traditional, \
Japanese, and Korean simultaneously, and can also process \
original LaTeX with \\inputenc{utf8} and Babel \
(Latin/Cyrillic/Greek etc.) by switching its \\kcatcode tables."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-uptex-2026.226.svn77830-60.2.noarch.rpm"
RPM_HASH = "091ae0c6c7b52a02f08e3161bd9024deaa327d5777e75f6356333a5610ff4b3d9438e3187966f6a077453a5e62c3f205892d0dccdc68fb0fb62fb3134f58d7ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-euptex.1 \
man-upbibtex.1 \
man-uppltotf.1 \
man-uptex.1 \
man-uptftopl.1 \
texlive-uptex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-updmap.cfg \
texlive \
texlive-cm \
texlive-etex \
texlive-filesystem \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-plain \
texlive-ptex-base \
texlive-scripts \
texlive-scripts-bin \
texlive-uptex-base \
texlive-uptex-bin \
texlive-uptex-fonts"

inherit rpm
