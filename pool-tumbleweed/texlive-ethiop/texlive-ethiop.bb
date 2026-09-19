SUMMARY = "LaTeX macros and fonts for typesetting Amharic"
DESCRIPTION = "Ethiopian language support for the babel package, including a \
collection of fonts and TeX macros for typesetting the \
characters of the languages of Ethiopia, with Metafont fonts \
based on EthTeX's. The macros use the Babel framework."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-ethiop-2026.226.0.0.7svn77682-59.2.noarch.rpm"
RPM_HASH = "4f3a847b40d5690f406b5601626a83e85e6e9c758904d3ca19f2d5966608a5012d246445dc970e2505bf3d428a262988c532f15b1b1862c594a70db2c6aa86c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etha10.tfm \
tex-etha6.tfm \
tex-etha7.tfm \
tex-etha8.tfm \
tex-ethab10.tfm \
tex-ethab11.tfm \
tex-ethab12.tfm \
tex-ethab14.tfm \
tex-ethab18.tfm \
tex-ethab24.tfm \
tex-ethab36.tfm \
tex-ethab9.tfm \
tex-etharab.sty \
tex-ethas10.tfm \
tex-ethasb10.tfm \
tex-ethasb11.tfm \
tex-ethasb12.tfm \
tex-ethasb14.tfm \
tex-ethasb18.tfm \
tex-ethasb24.tfm \
tex-ethasb36.tfm \
tex-ethasb9.tfm \
tex-ethatt10.tfm \
tex-ethb10.tfm \
tex-ethb6.tfm \
tex-ethb7.tfm \
tex-ethb8.tfm \
tex-ethbb10.tfm \
tex-ethbb11.tfm \
tex-ethbb12.tfm \
tex-ethbb14.tfm \
tex-ethbb18.tfm \
tex-ethbb24.tfm \
tex-ethbb36.tfm \
tex-ethbb9.tfm \
tex-ethbs10.tfm \
tex-ethbsb10.tfm \
tex-ethbsb11.tfm \
tex-ethbsb12.tfm \
tex-ethbsb14.tfm \
tex-ethbsb18.tfm \
tex-ethbsb24.tfm \
tex-ethbsb36.tfm \
tex-ethbsb9.tfm \
tex-ethbtt10.tfm \
tex-ethiop.ldf \
tex-ethiop.sty \
tex-uetha.fd \
tex-uethb.fd \
tex-uetho.fd \
texlive-ethiop"

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
