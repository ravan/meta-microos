SUMMARY = "Translations for package AdwSteamGtk"
DESCRIPTION = "Provides translations for the 'AdwSteamGtk' package."
LICENSE = "GPL-3.0-only"

PV = "0.8.0"

RPM_NAME = "AdwSteamGtk-lang-0.8.0-1.5.noarch.rpm"
RPM_HASH = "affcedf231c3c6c514459d383dbddb8cd0f305f074eb93da9eb458f06632eec23ea5d73b79ff7441d8c7eaa00a7a08e5fc5224d32020fe89528387fa6c4a3267"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "AdwSteamGtk-lang \
AdwSteamGtk-lang-all \
locale-AdwSteamGtk-be \
locale-AdwSteamGtk-ca \
locale-AdwSteamGtk-cs \
locale-AdwSteamGtk-de \
locale-AdwSteamGtk-es \
locale-AdwSteamGtk-fi \
locale-AdwSteamGtk-fr \
locale-AdwSteamGtk-hi \
locale-AdwSteamGtk-it \
locale-AdwSteamGtk-nl \
locale-AdwSteamGtk-pt \
locale-AdwSteamGtk-pt-BR \
locale-AdwSteamGtk-ru \
locale-AdwSteamGtk-sr \
locale-AdwSteamGtk-sv \
locale-AdwSteamGtk-ta \
locale-AdwSteamGtk-tr \
locale-AdwSteamGtk-uk \
locale-AdwSteamGtk-zh-Hans"

RDEPENDS:${PN} += "AdwSteamGtk"

inherit rpm
