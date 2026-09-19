SUMMARY = "Translations for package unknown-horizons"
DESCRIPTION = "Provides translations for the 'unknown-horizons' package."
LICENSE = "APL-1.0 & CC-BY-SA-3.0 & GPL-2.0-with-font-exception & MIT & OFL-1.1"

PV = "2019.1"

RPM_NAME = "unknown-horizons-lang-2019.1-10.4.noarch.rpm"
RPM_HASH = "fa242370cc4b52f3260fc0c1a80add01fef4aed743913cd8739595b0b980b5ee694ee2fc3cc299ce3fe4f0c7d6ea97cbbec0cf75f9b2daf62dea3aabf18b4ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-unknown-horizons-af \
locale-unknown-horizons-ar \
locale-unknown-horizons-bg \
locale-unknown-horizons-ca \
locale-unknown-horizons-ca@valencia \
locale-unknown-horizons-cs \
locale-unknown-horizons-da \
locale-unknown-horizons-de \
locale-unknown-horizons-el \
locale-unknown-horizons-eo \
locale-unknown-horizons-es \
locale-unknown-horizons-et \
locale-unknown-horizons-fi \
locale-unknown-horizons-fr \
locale-unknown-horizons-ga \
locale-unknown-horizons-gl \
locale-unknown-horizons-hi \
locale-unknown-horizons-hr \
locale-unknown-horizons-hu \
locale-unknown-horizons-id \
locale-unknown-horizons-it \
locale-unknown-horizons-ja \
locale-unknown-horizons-ko \
locale-unknown-horizons-lt \
locale-unknown-horizons-lv \
locale-unknown-horizons-ml \
locale-unknown-horizons-nb \
locale-unknown-horizons-nl \
locale-unknown-horizons-pl \
locale-unknown-horizons-pt \
locale-unknown-horizons-pt-BR \
locale-unknown-horizons-ro \
locale-unknown-horizons-ru \
locale-unknown-horizons-sk \
locale-unknown-horizons-sl \
locale-unknown-horizons-sr \
locale-unknown-horizons-sv \
locale-unknown-horizons-th \
locale-unknown-horizons-tr \
locale-unknown-horizons-uk \
locale-unknown-horizons-vi \
locale-unknown-horizons-zh-CN \
locale-unknown-horizons-zh-TW \
unknown-horizons-lang \
unknown-horizons-lang-all"

RDEPENDS:${PN} += "unknown-horizons"

inherit rpm
