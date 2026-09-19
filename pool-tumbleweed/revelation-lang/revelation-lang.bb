SUMMARY = "Translations for package revelation"
DESCRIPTION = "Provides translations for the 'revelation' package."
LICENSE = "GPL-2.0-only"

PV = "0.5.6"

RPM_NAME = "revelation-lang-0.5.6-1.3.noarch.rpm"
RPM_HASH = "d7f71ebb6fdc8f32b73756c9f06aeaa1ecf8b9719a606ffc3a4f96a68a16fde77b3f95daad5fe06c11b0b121b0aea6a21b6356980e43b2f0866ab5cebeaf96f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-revelation-ca \
locale-revelation-cs \
locale-revelation-de \
locale-revelation-es \
locale-revelation-et \
locale-revelation-eu \
locale-revelation-fi \
locale-revelation-fr \
locale-revelation-it-IT \
locale-revelation-lt \
locale-revelation-nl \
locale-revelation-pl \
locale-revelation-pt-BR \
locale-revelation-ru \
locale-revelation-sv \
locale-revelation-uk \
locale-revelation-zh \
revelation-lang \
revelation-lang-all"

RDEPENDS:${PN} += "revelation"

inherit rpm
