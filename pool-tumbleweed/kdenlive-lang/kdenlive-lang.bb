SUMMARY = "Translations for package kdenlive"
DESCRIPTION = "Provides translations for the 'kdenlive' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdenlive-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "52f535939dab3e4d26bc7635ff3e625e56d6944cbe94f66514768301f95e281927320c53c35d4d0aa3e70cadc323cc2c283699aacb280390b182c9b6544d018d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdenlive-lang \
kdenlive-lang-all \
locale-kdenlive-ar \
locale-kdenlive-ast \
locale-kdenlive-az \
locale-kdenlive-bs \
locale-kdenlive-ca \
locale-kdenlive-ca@valencia \
locale-kdenlive-cs \
locale-kdenlive-da \
locale-kdenlive-de \
locale-kdenlive-el \
locale-kdenlive-en-GB \
locale-kdenlive-eo \
locale-kdenlive-es \
locale-kdenlive-et \
locale-kdenlive-eu \
locale-kdenlive-fi \
locale-kdenlive-fr \
locale-kdenlive-ga \
locale-kdenlive-gl \
locale-kdenlive-he \
locale-kdenlive-hi \
locale-kdenlive-hr \
locale-kdenlive-hu \
locale-kdenlive-id \
locale-kdenlive-it \
locale-kdenlive-ja \
locale-kdenlive-ka \
locale-kdenlive-ko \
locale-kdenlive-lt \
locale-kdenlive-lv \
locale-kdenlive-mr \
locale-kdenlive-nb \
locale-kdenlive-nds \
locale-kdenlive-nl \
locale-kdenlive-pl \
locale-kdenlive-pt \
locale-kdenlive-pt-BR \
locale-kdenlive-ro \
locale-kdenlive-ru \
locale-kdenlive-sk \
locale-kdenlive-sl \
locale-kdenlive-sv \
locale-kdenlive-tr \
locale-kdenlive-ug \
locale-kdenlive-uk \
locale-kdenlive-zh-CN \
locale-kdenlive-zh-TW"

RDEPENDS:${PN} += "kdenlive"

inherit rpm
