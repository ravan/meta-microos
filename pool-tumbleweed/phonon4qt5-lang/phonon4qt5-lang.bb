SUMMARY = "Translations for package phonon4qt5"
DESCRIPTION = "Provides translations for the 'phonon4qt5' package."
LICENSE = "LGPL-2.0-or-later"

PV = "4.12.0"

RPM_NAME = "phonon4qt5-lang-4.12.0-2.8.noarch.rpm"
RPM_HASH = "097237a91b179bc0fe24940eaac4eb8792f89e0ec865395fa37505306bc0ed0d9119bb7c9eb1c4ce374f407134cc0f10161a65ab5a39d2873c04e1e97952b56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-phonon4qt5-ar \
locale-phonon4qt5-az \
locale-phonon4qt5-be \
locale-phonon4qt5-bg \
locale-phonon4qt5-bs \
locale-phonon4qt5-ca \
locale-phonon4qt5-ca@valencia \
locale-phonon4qt5-cs \
locale-phonon4qt5-da \
locale-phonon4qt5-de \
locale-phonon4qt5-el \
locale-phonon4qt5-en-GB \
locale-phonon4qt5-eo \
locale-phonon4qt5-es \
locale-phonon4qt5-et \
locale-phonon4qt5-eu \
locale-phonon4qt5-fa \
locale-phonon4qt5-fi \
locale-phonon4qt5-fr \
locale-phonon4qt5-ga \
locale-phonon4qt5-gl \
locale-phonon4qt5-gu \
locale-phonon4qt5-he \
locale-phonon4qt5-hi \
locale-phonon4qt5-hr \
locale-phonon4qt5-hu \
locale-phonon4qt5-ia \
locale-phonon4qt5-id \
locale-phonon4qt5-is \
locale-phonon4qt5-it \
locale-phonon4qt5-ja \
locale-phonon4qt5-ka \
locale-phonon4qt5-kk \
locale-phonon4qt5-km \
locale-phonon4qt5-ko \
locale-phonon4qt5-lt \
locale-phonon4qt5-lv \
locale-phonon4qt5-mai \
locale-phonon4qt5-mk \
locale-phonon4qt5-ml \
locale-phonon4qt5-mr \
locale-phonon4qt5-nb \
locale-phonon4qt5-nds \
locale-phonon4qt5-ne \
locale-phonon4qt5-nl \
locale-phonon4qt5-nn \
locale-phonon4qt5-oc \
locale-phonon4qt5-pa \
locale-phonon4qt5-pl \
locale-phonon4qt5-pt \
locale-phonon4qt5-pt-BR \
locale-phonon4qt5-ro \
locale-phonon4qt5-ru \
locale-phonon4qt5-sk \
locale-phonon4qt5-sl \
locale-phonon4qt5-sq \
locale-phonon4qt5-sr \
locale-phonon4qt5-sr@ijekavian \
locale-phonon4qt5-sr@ijekavianlatin \
locale-phonon4qt5-sr@latin \
locale-phonon4qt5-sv \
locale-phonon4qt5-ta \
locale-phonon4qt5-th \
locale-phonon4qt5-tr \
locale-phonon4qt5-ug \
locale-phonon4qt5-uk \
locale-phonon4qt5-vi \
locale-phonon4qt5-wa \
locale-phonon4qt5-zh-CN \
locale-phonon4qt5-zh-TW \
phonon4qt5-lang \
phonon4qt5-lang-all"

RDEPENDS:${PN} += "phonon4qt5"

inherit rpm
