SUMMARY = "Semi-automatic detection of input encoding"
DESCRIPTION = "This package selects the input encoding by specifying pairs of \
input characters and their glyph names."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-selinput-2026.226.1.6svn77682-60.2.noarch.rpm"
RPM_HASH = "1f177e163cb0034b585e51461b347ff011884c5923b8742d8165c9ae665fe2ebee23009f396c8317cccd3af7f37b08cac79ab58c154c4d1c1728c82cdd6fd94d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-selinput.sty \
texlive-selinput"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-stringenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
