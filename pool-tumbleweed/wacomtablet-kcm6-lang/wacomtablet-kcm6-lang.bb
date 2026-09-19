SUMMARY = "Translations for package wacomtablet-kcm6"
DESCRIPTION = "Provides translations for the 'wacomtablet-kcm6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "wacomtablet-kcm6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "a9159c2402fd9f0ce510871803df7c0f3458ee2bb3db8a237530ea32291080a7d7ef6e207861f94b985e00cbd29384785aee1100774ed35a3f5cb75b16cde7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wacomtablet-kcm6-ar \
locale-wacomtablet-kcm6-ast \
locale-wacomtablet-kcm6-bs \
locale-wacomtablet-kcm6-ca \
locale-wacomtablet-kcm6-ca@valencia \
locale-wacomtablet-kcm6-cs \
locale-wacomtablet-kcm6-da \
locale-wacomtablet-kcm6-de \
locale-wacomtablet-kcm6-el \
locale-wacomtablet-kcm6-en-GB \
locale-wacomtablet-kcm6-eo \
locale-wacomtablet-kcm6-es \
locale-wacomtablet-kcm6-et \
locale-wacomtablet-kcm6-eu \
locale-wacomtablet-kcm6-fi \
locale-wacomtablet-kcm6-fr \
locale-wacomtablet-kcm6-ga \
locale-wacomtablet-kcm6-gl \
locale-wacomtablet-kcm6-he \
locale-wacomtablet-kcm6-hi \
locale-wacomtablet-kcm6-hu \
locale-wacomtablet-kcm6-ia \
locale-wacomtablet-kcm6-id \
locale-wacomtablet-kcm6-is \
locale-wacomtablet-kcm6-it \
locale-wacomtablet-kcm6-ja \
locale-wacomtablet-kcm6-ka \
locale-wacomtablet-kcm6-kk \
locale-wacomtablet-kcm6-km \
locale-wacomtablet-kcm6-ko \
locale-wacomtablet-kcm6-lt \
locale-wacomtablet-kcm6-mai \
locale-wacomtablet-kcm6-mr \
locale-wacomtablet-kcm6-nb \
locale-wacomtablet-kcm6-nds \
locale-wacomtablet-kcm6-nl \
locale-wacomtablet-kcm6-nn \
locale-wacomtablet-kcm6-pa \
locale-wacomtablet-kcm6-pl \
locale-wacomtablet-kcm6-pt \
locale-wacomtablet-kcm6-pt-BR \
locale-wacomtablet-kcm6-ro \
locale-wacomtablet-kcm6-ru \
locale-wacomtablet-kcm6-sk \
locale-wacomtablet-kcm6-sl \
locale-wacomtablet-kcm6-sv \
locale-wacomtablet-kcm6-tr \
locale-wacomtablet-kcm6-ug \
locale-wacomtablet-kcm6-uk \
locale-wacomtablet-kcm6-zh-CN \
locale-wacomtablet-kcm6-zh-TW \
wacomtablet-kcm6-lang \
wacomtablet-kcm6-lang-all"

RDEPENDS:${PN} += "wacomtablet-kcm6"

inherit rpm
