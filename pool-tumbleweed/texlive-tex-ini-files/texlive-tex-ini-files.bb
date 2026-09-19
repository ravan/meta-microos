SUMMARY = "Model TeX format creation files"
DESCRIPTION = "This bundle provides a collection of model .ini files for \
creating TeX formats. These files are commonly used to \
introduce distribution-dependent variations in formats. They \
are also used to allow existing format source files to be used \
with newer engines, for example to adapt the plain e-TeX source \
file to work with XeTeX and LuaTeX."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.svn73863"

RPM_NAME = "texlive-tex-ini-files-2026.227.svn73863-62.2.noarch.rpm"
RPM_HASH = "8ad2115b2b181521133522d300d08051724a2162fdb8c0405a5bda1de00d3351b34fd7497604ef7747e8803e9100358ba02e76bb71ead7bbc285a3be1a34b156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-tex-ini-files \
tex-luatexconfig.tex \
tex-luatexiniconfig.tex \
tex-pdftexconfig.tex \
texlive-tex-ini-files"

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
