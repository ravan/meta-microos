SUMMARY = "Translations for package libkcddb-qt6"
DESCRIPTION = "Provides translations for the 'libkcddb-qt6' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkcddb-qt6-lang-26.08.1-15.1.noarch.rpm"
RPM_HASH = "21537b0b20f2717370284aeb2df3ae10821e0b6b71a28890ff95636563a48b11e3f1c3cbf34c05a42b22bafc596a2bbfc13e9fb606c8110d1ae34cddbc73aab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkcddb-qt6-lang \
libkcddb-qt6-lang-all \
locale-libkcddb-qt6-ar \
locale-libkcddb-qt6-be \
locale-libkcddb-qt6-bg \
locale-libkcddb-qt6-br \
locale-libkcddb-qt6-bs \
locale-libkcddb-qt6-ca \
locale-libkcddb-qt6-ca@valencia \
locale-libkcddb-qt6-cs \
locale-libkcddb-qt6-cy \
locale-libkcddb-qt6-da \
locale-libkcddb-qt6-de \
locale-libkcddb-qt6-el \
locale-libkcddb-qt6-en-GB \
locale-libkcddb-qt6-eo \
locale-libkcddb-qt6-es \
locale-libkcddb-qt6-et \
locale-libkcddb-qt6-eu \
locale-libkcddb-qt6-fa \
locale-libkcddb-qt6-fi \
locale-libkcddb-qt6-fr \
locale-libkcddb-qt6-ga \
locale-libkcddb-qt6-gl \
locale-libkcddb-qt6-he \
locale-libkcddb-qt6-hi \
locale-libkcddb-qt6-hr \
locale-libkcddb-qt6-hu \
locale-libkcddb-qt6-ia \
locale-libkcddb-qt6-is \
locale-libkcddb-qt6-it \
locale-libkcddb-qt6-ja \
locale-libkcddb-qt6-ka \
locale-libkcddb-qt6-kk \
locale-libkcddb-qt6-km \
locale-libkcddb-qt6-ko \
locale-libkcddb-qt6-lt \
locale-libkcddb-qt6-lv \
locale-libkcddb-qt6-mk \
locale-libkcddb-qt6-mr \
locale-libkcddb-qt6-ms \
locale-libkcddb-qt6-nb \
locale-libkcddb-qt6-nds \
locale-libkcddb-qt6-ne \
locale-libkcddb-qt6-nl \
locale-libkcddb-qt6-nn \
locale-libkcddb-qt6-oc \
locale-libkcddb-qt6-pa \
locale-libkcddb-qt6-pl \
locale-libkcddb-qt6-pt \
locale-libkcddb-qt6-pt-BR \
locale-libkcddb-qt6-ro \
locale-libkcddb-qt6-ru \
locale-libkcddb-qt6-sk \
locale-libkcddb-qt6-sl \
locale-libkcddb-qt6-sq \
locale-libkcddb-qt6-sr \
locale-libkcddb-qt6-sr@ijekavian \
locale-libkcddb-qt6-sr@ijekavianlatin \
locale-libkcddb-qt6-sr@latin \
locale-libkcddb-qt6-sv \
locale-libkcddb-qt6-ta \
locale-libkcddb-qt6-th \
locale-libkcddb-qt6-tr \
locale-libkcddb-qt6-ug \
locale-libkcddb-qt6-uk \
locale-libkcddb-qt6-zh-CN \
locale-libkcddb-qt6-zh-HK \
locale-libkcddb-qt6-zh-TW"

RDEPENDS:${PN} += "libkcddb-qt6"

inherit rpm
