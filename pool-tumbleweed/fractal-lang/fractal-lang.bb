SUMMARY = "Translations for package fractal"
DESCRIPTION = "Provides translations for the 'fractal' package."
LICENSE = "GPL-3.0-or-later"

PV = "14.1"

RPM_NAME = "fractal-lang-14.1-1.1.noarch.rpm"
RPM_HASH = "ba304ac095314581b7009903a27afa7416f72a4684bb75fc9c6f4a2fc786bb91ee61b4491dc01ac50cc4d9a34e11c0060b53069770d607d0361ba7ecee2c6fb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fractal-lang \
fractal-lang-all \
locale-fractal-bg \
locale-fractal-ca \
locale-fractal-cs \
locale-fractal-da \
locale-fractal-de \
locale-fractal-el \
locale-fractal-en-GB \
locale-fractal-eo \
locale-fractal-es \
locale-fractal-eu \
locale-fractal-fa \
locale-fractal-fi \
locale-fractal-fr \
locale-fractal-fur \
locale-fractal-gl \
locale-fractal-he \
locale-fractal-hi \
locale-fractal-hr \
locale-fractal-hu \
locale-fractal-id \
locale-fractal-it \
locale-fractal-ja \
locale-fractal-ka \
locale-fractal-kk \
locale-fractal-nb \
locale-fractal-nl \
locale-fractal-nn \
locale-fractal-oc \
locale-fractal-pl \
locale-fractal-pt \
locale-fractal-pt-BR \
locale-fractal-ro \
locale-fractal-ru \
locale-fractal-sk \
locale-fractal-sl \
locale-fractal-sr \
locale-fractal-sr@latin \
locale-fractal-sv \
locale-fractal-th \
locale-fractal-tr \
locale-fractal-uk \
locale-fractal-zh-CN"

RDEPENDS:${PN} += "fractal"

inherit rpm
