SUMMARY = "Translations for package plasmatube"
DESCRIPTION = "Provides translations for the 'plasmatube' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "plasmatube-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "5dfe102c62054528d0fcbdf0e00b180444ae298b574ba68f37f39ccfe9d5eb7a5753fc0d3012c0798af99a0603ec2f6f557318d620dd015b589b83f26f07abfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasmatube-ar \
locale-plasmatube-ast \
locale-plasmatube-az \
locale-plasmatube-be \
locale-plasmatube-ca \
locale-plasmatube-ca@valencia \
locale-plasmatube-cs \
locale-plasmatube-de \
locale-plasmatube-en-GB \
locale-plasmatube-eo \
locale-plasmatube-es \
locale-plasmatube-eu \
locale-plasmatube-fi \
locale-plasmatube-fr \
locale-plasmatube-ga \
locale-plasmatube-gl \
locale-plasmatube-he \
locale-plasmatube-hi \
locale-plasmatube-hu \
locale-plasmatube-ia \
locale-plasmatube-id \
locale-plasmatube-is \
locale-plasmatube-it \
locale-plasmatube-ja \
locale-plasmatube-ka \
locale-plasmatube-ko \
locale-plasmatube-lt \
locale-plasmatube-lv \
locale-plasmatube-nl \
locale-plasmatube-nn \
locale-plasmatube-pa \
locale-plasmatube-pl \
locale-plasmatube-pt \
locale-plasmatube-pt-BR \
locale-plasmatube-ro \
locale-plasmatube-ru \
locale-plasmatube-sk \
locale-plasmatube-sl \
locale-plasmatube-sv \
locale-plasmatube-tr \
locale-plasmatube-ug \
locale-plasmatube-uk \
locale-plasmatube-zh-CN \
locale-plasmatube-zh-TW \
plasmatube-lang \
plasmatube-lang-all"

RDEPENDS:${PN} += "plasmatube"

inherit rpm
