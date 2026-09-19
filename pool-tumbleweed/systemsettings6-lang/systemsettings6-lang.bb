SUMMARY = "Translations for package systemsettings6"
DESCRIPTION = "Provides translations for the 'systemsettings6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "systemsettings6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "52ea76e255d60b7ac9374483b35e1497082efba783d22fc0b3bfc73bb70a01235c99c1440ca687038c319dbda37a06d32407a2de95cdf3222e1c90507438d212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-systemsettings6-ar \
locale-systemsettings6-ast \
locale-systemsettings6-az \
locale-systemsettings6-be \
locale-systemsettings6-be@latin \
locale-systemsettings6-bg \
locale-systemsettings6-bn-IN \
locale-systemsettings6-bs \
locale-systemsettings6-ca \
locale-systemsettings6-ca@valencia \
locale-systemsettings6-cs \
locale-systemsettings6-da \
locale-systemsettings6-de \
locale-systemsettings6-el \
locale-systemsettings6-en-GB \
locale-systemsettings6-eo \
locale-systemsettings6-es \
locale-systemsettings6-et \
locale-systemsettings6-eu \
locale-systemsettings6-fa \
locale-systemsettings6-fi \
locale-systemsettings6-fr \
locale-systemsettings6-ga \
locale-systemsettings6-gl \
locale-systemsettings6-gu \
locale-systemsettings6-he \
locale-systemsettings6-hi \
locale-systemsettings6-hr \
locale-systemsettings6-hu \
locale-systemsettings6-ia \
locale-systemsettings6-id \
locale-systemsettings6-is \
locale-systemsettings6-it \
locale-systemsettings6-ja \
locale-systemsettings6-ka \
locale-systemsettings6-kk \
locale-systemsettings6-km \
locale-systemsettings6-ko \
locale-systemsettings6-lt \
locale-systemsettings6-lv \
locale-systemsettings6-mai \
locale-systemsettings6-mk \
locale-systemsettings6-ml \
locale-systemsettings6-mr \
locale-systemsettings6-ms \
locale-systemsettings6-nb \
locale-systemsettings6-nds \
locale-systemsettings6-ne \
locale-systemsettings6-nl \
locale-systemsettings6-nn \
locale-systemsettings6-oc \
locale-systemsettings6-or \
locale-systemsettings6-pa \
locale-systemsettings6-pl \
locale-systemsettings6-pt \
locale-systemsettings6-pt-BR \
locale-systemsettings6-ro \
locale-systemsettings6-ru \
locale-systemsettings6-si \
locale-systemsettings6-sk \
locale-systemsettings6-sl \
locale-systemsettings6-sq \
locale-systemsettings6-sr \
locale-systemsettings6-sr@ijekavian \
locale-systemsettings6-sr@ijekavianlatin \
locale-systemsettings6-sr@latin \
locale-systemsettings6-sv \
locale-systemsettings6-ta \
locale-systemsettings6-te \
locale-systemsettings6-th \
locale-systemsettings6-tr \
locale-systemsettings6-ug \
locale-systemsettings6-uk \
locale-systemsettings6-vi \
locale-systemsettings6-wa \
locale-systemsettings6-zh-CN \
locale-systemsettings6-zh-TW \
systemsettings6-lang \
systemsettings6-lang-all"

RDEPENDS:${PN} += "systemsettings6"

inherit rpm
