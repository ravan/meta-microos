SUMMARY = "Translations for package ghostwriter"
DESCRIPTION = "Provides translations for the 'ghostwriter' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "ghostwriter-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "acc7d93c57afa246d1f618e01e9c875ef3ad7cf7ea721da2b467ba17b151fdc24492e93a5631da9851e84c095b3bb6b0378cfda8361052c4ed31e7ed7536813f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostwriter-lang \
ghostwriter-lang-all \
locale-ghostwriter-ar \
locale-ghostwriter-ca \
locale-ghostwriter-ca@valencia \
locale-ghostwriter-cs \
locale-ghostwriter-de \
locale-ghostwriter-en \
locale-ghostwriter-en-GB \
locale-ghostwriter-eo \
locale-ghostwriter-es \
locale-ghostwriter-eu \
locale-ghostwriter-fi \
locale-ghostwriter-fr \
locale-ghostwriter-ga \
locale-ghostwriter-gl \
locale-ghostwriter-he \
locale-ghostwriter-hi \
locale-ghostwriter-ia \
locale-ghostwriter-id \
locale-ghostwriter-it \
locale-ghostwriter-ja \
locale-ghostwriter-ka \
locale-ghostwriter-ko \
locale-ghostwriter-lt \
locale-ghostwriter-lv \
locale-ghostwriter-nl \
locale-ghostwriter-pl \
locale-ghostwriter-pt \
locale-ghostwriter-pt-BR \
locale-ghostwriter-ru \
locale-ghostwriter-sk \
locale-ghostwriter-sl \
locale-ghostwriter-sv \
locale-ghostwriter-tr \
locale-ghostwriter-ug \
locale-ghostwriter-uk \
locale-ghostwriter-zh-CN \
locale-ghostwriter-zh-TW"

RDEPENDS:${PN} += "ghostwriter"

inherit rpm
