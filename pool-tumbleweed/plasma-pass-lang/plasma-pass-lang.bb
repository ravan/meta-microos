SUMMARY = "Translations for package plasma-pass"
DESCRIPTION = "Provides translations for the 'plasma-pass' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "plasma-pass-lang-1.3.1-1.3.noarch.rpm"
RPM_HASH = "f0a918ed545b1d14fcaac79ba11624b6ae758910784ccfa592e9170837b42c64b5a743d616925e7d074aea1e93942bda142de375b848b516b76ff8beb163430e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma-pass-ar \
locale-plasma-pass-ast \
locale-plasma-pass-az \
locale-plasma-pass-bg \
locale-plasma-pass-ca \
locale-plasma-pass-ca@valencia \
locale-plasma-pass-cs \
locale-plasma-pass-da \
locale-plasma-pass-de \
locale-plasma-pass-el \
locale-plasma-pass-en-GB \
locale-plasma-pass-eo \
locale-plasma-pass-es \
locale-plasma-pass-et \
locale-plasma-pass-eu \
locale-plasma-pass-fi \
locale-plasma-pass-fr \
locale-plasma-pass-ga \
locale-plasma-pass-gl \
locale-plasma-pass-he \
locale-plasma-pass-hi \
locale-plasma-pass-hu \
locale-plasma-pass-ia \
locale-plasma-pass-is \
locale-plasma-pass-it \
locale-plasma-pass-ja \
locale-plasma-pass-ka \
locale-plasma-pass-ko \
locale-plasma-pass-lt \
locale-plasma-pass-lv \
locale-plasma-pass-nl \
locale-plasma-pass-nn \
locale-plasma-pass-pa \
locale-plasma-pass-pl \
locale-plasma-pass-pt \
locale-plasma-pass-pt-BR \
locale-plasma-pass-ro \
locale-plasma-pass-ru \
locale-plasma-pass-sk \
locale-plasma-pass-sl \
locale-plasma-pass-sv \
locale-plasma-pass-ta \
locale-plasma-pass-tr \
locale-plasma-pass-uk \
locale-plasma-pass-vi \
locale-plasma-pass-zh-CN \
locale-plasma-pass-zh-TW \
plasma-pass-lang \
plasma-pass-lang-all"

RDEPENDS:${PN} += "plasma-pass"

inherit rpm
