SUMMARY = "Translations for package audex"
DESCRIPTION = "Provides translations for the 'audex' package."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "audex-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "dbd7d1e7d6af08e388d10270e31027cb47bc935005268b714414e0805410c8cf022be0fe0d4b0f65affb9bdd5dc8560d83a2d7f822a7211ebf0d5544cfd00f3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audex-lang \
audex-lang-all \
locale-audex-ar \
locale-audex-ast \
locale-audex-bs \
locale-audex-ca \
locale-audex-ca@valencia \
locale-audex-cs \
locale-audex-da \
locale-audex-de \
locale-audex-en-GB \
locale-audex-eo \
locale-audex-es \
locale-audex-et \
locale-audex-eu \
locale-audex-fi \
locale-audex-fr \
locale-audex-ga \
locale-audex-gl \
locale-audex-he \
locale-audex-hi \
locale-audex-hu \
locale-audex-ia \
locale-audex-it \
locale-audex-ja \
locale-audex-ka \
locale-audex-km \
locale-audex-ko \
locale-audex-lt \
locale-audex-mai \
locale-audex-mr \
locale-audex-nds \
locale-audex-nl \
locale-audex-pl \
locale-audex-pt \
locale-audex-pt-BR \
locale-audex-ro \
locale-audex-ru \
locale-audex-sk \
locale-audex-sl \
locale-audex-sv \
locale-audex-tr \
locale-audex-ug \
locale-audex-uk \
locale-audex-zh-CN \
locale-audex-zh-TW"

RDEPENDS:${PN} += "audex"

inherit rpm
