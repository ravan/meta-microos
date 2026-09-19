SUMMARY = "Translations for package skrooge"
DESCRIPTION = "Provides translations for the 'skrooge' package."
LICENSE = "GPL-3.0-only"

PV = "26.8.0"

RPM_NAME = "skrooge-lang-26.8.0-1.2.noarch.rpm"
RPM_HASH = "3f91f585e9989aa4e1df2b7808e8726aaa8743f80c903232ab5e36484caf7831fdafcc990c73d9565e52edfc29ef293f7459fd078cc509fc396bdac2beeaf38c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-skrooge-ar \
locale-skrooge-bs \
locale-skrooge-ca \
locale-skrooge-ca@valencia \
locale-skrooge-cs \
locale-skrooge-da \
locale-skrooge-de \
locale-skrooge-el \
locale-skrooge-en-GB \
locale-skrooge-eo \
locale-skrooge-es \
locale-skrooge-et \
locale-skrooge-eu \
locale-skrooge-fi \
locale-skrooge-fr \
locale-skrooge-ga \
locale-skrooge-gl \
locale-skrooge-hu \
locale-skrooge-ia \
locale-skrooge-it \
locale-skrooge-ja \
locale-skrooge-ka \
locale-skrooge-ko \
locale-skrooge-lt \
locale-skrooge-mr \
locale-skrooge-ms \
locale-skrooge-nb \
locale-skrooge-nds \
locale-skrooge-nl \
locale-skrooge-pl \
locale-skrooge-pt \
locale-skrooge-pt-BR \
locale-skrooge-ro \
locale-skrooge-ru \
locale-skrooge-sk \
locale-skrooge-sl \
locale-skrooge-sv \
locale-skrooge-tr \
locale-skrooge-ug \
locale-skrooge-uk \
locale-skrooge-zh-CN \
locale-skrooge-zh-TW \
skrooge-lang \
skrooge-lang-all"

RDEPENDS:${PN} += "skrooge"

inherit rpm
