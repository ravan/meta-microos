SUMMARY = "Translations for package plasma6-welcome"
DESCRIPTION = "Provides translations for the 'plasma6-welcome' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "plasma6-welcome-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "bdc593a4c0872efb1b121f09d43ff30b5d049a1bcbdd9535c4a906b9c029233c792f0871ed3c106c5154ccc91684196b245c21e81de718ce5a5234c78bf3c0b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-welcome-ar \
locale-plasma6-welcome-ast \
locale-plasma6-welcome-az \
locale-plasma6-welcome-be \
locale-plasma6-welcome-bg \
locale-plasma6-welcome-ca \
locale-plasma6-welcome-ca@valencia \
locale-plasma6-welcome-cs \
locale-plasma6-welcome-da \
locale-plasma6-welcome-de \
locale-plasma6-welcome-en-GB \
locale-plasma6-welcome-eo \
locale-plasma6-welcome-es \
locale-plasma6-welcome-eu \
locale-plasma6-welcome-fi \
locale-plasma6-welcome-fr \
locale-plasma6-welcome-ga \
locale-plasma6-welcome-gl \
locale-plasma6-welcome-he \
locale-plasma6-welcome-hi \
locale-plasma6-welcome-hu \
locale-plasma6-welcome-ia \
locale-plasma6-welcome-id \
locale-plasma6-welcome-is \
locale-plasma6-welcome-it \
locale-plasma6-welcome-ja \
locale-plasma6-welcome-ka \
locale-plasma6-welcome-ko \
locale-plasma6-welcome-lt \
locale-plasma6-welcome-lv \
locale-plasma6-welcome-nb \
locale-plasma6-welcome-nl \
locale-plasma6-welcome-nn \
locale-plasma6-welcome-pa \
locale-plasma6-welcome-pl \
locale-plasma6-welcome-pt \
locale-plasma6-welcome-pt-BR \
locale-plasma6-welcome-ro \
locale-plasma6-welcome-ru \
locale-plasma6-welcome-sk \
locale-plasma6-welcome-sl \
locale-plasma6-welcome-ta \
locale-plasma6-welcome-tr \
locale-plasma6-welcome-uk \
locale-plasma6-welcome-zh-CN \
locale-plasma6-welcome-zh-TW \
plasma6-welcome-lang \
plasma6-welcome-lang-all"

RDEPENDS:${PN} += "plasma6-welcome"

inherit rpm
