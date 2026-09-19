SUMMARY = "Translations for package neochat"
DESCRIPTION = "Provides translations for the 'neochat' package."
LICENSE = "BSD-2-Clause & GPL-3.0-only & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "neochat-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "440241585791b6c5c733f91f5706b17d858cf83537f69184917aaffb59b84f5be77e493818d1cabe1ffbcb54c93170a851f2d1b69c35a25e852211bc0cfd81ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-neochat-ar \
locale-neochat-ast \
locale-neochat-az \
locale-neochat-ca \
locale-neochat-ca@valencia \
locale-neochat-cs \
locale-neochat-da \
locale-neochat-de \
locale-neochat-el \
locale-neochat-en-GB \
locale-neochat-eo \
locale-neochat-es \
locale-neochat-eu \
locale-neochat-fi \
locale-neochat-fr \
locale-neochat-ga \
locale-neochat-gl \
locale-neochat-he \
locale-neochat-hi \
locale-neochat-hu \
locale-neochat-ia \
locale-neochat-id \
locale-neochat-it \
locale-neochat-ja \
locale-neochat-ka \
locale-neochat-ko \
locale-neochat-lt \
locale-neochat-lv \
locale-neochat-nl \
locale-neochat-nn \
locale-neochat-pa \
locale-neochat-pl \
locale-neochat-pt \
locale-neochat-pt-BR \
locale-neochat-ro \
locale-neochat-ru \
locale-neochat-sk \
locale-neochat-sl \
locale-neochat-sv \
locale-neochat-ta \
locale-neochat-tr \
locale-neochat-ug \
locale-neochat-uk \
locale-neochat-zh-CN \
locale-neochat-zh-TW \
neochat-lang \
neochat-lang-all"

RDEPENDS:${PN} += "neochat"

inherit rpm
