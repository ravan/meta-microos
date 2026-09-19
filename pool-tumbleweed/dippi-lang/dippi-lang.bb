SUMMARY = "Translations for package dippi"
DESCRIPTION = "Provides translations for the 'dippi' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.2"

RPM_NAME = "dippi-lang-5.0.2-1.3.noarch.rpm"
RPM_HASH = "af177ba215e47fe7ddc32533881c6d8b42fc940e111aab56a5df86dea006f34a9bc58234764746477b95dadbc36d858520dc39e0386acf7e903a0a0ef68c4abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dippi-lang \
dippi-lang-all \
locale-dippi-af \
locale-dippi-ar \
locale-dippi-as \
locale-dippi-ast \
locale-dippi-az \
locale-dippi-be \
locale-dippi-bg \
locale-dippi-bn \
locale-dippi-br \
locale-dippi-bs \
locale-dippi-ca \
locale-dippi-cs \
locale-dippi-cy \
locale-dippi-da \
locale-dippi-de \
locale-dippi-dz \
locale-dippi-el \
locale-dippi-en-AU \
locale-dippi-en-CA \
locale-dippi-en-GB \
locale-dippi-eo \
locale-dippi-es \
locale-dippi-et \
locale-dippi-eu \
locale-dippi-fa \
locale-dippi-fi \
locale-dippi-fr \
locale-dippi-fr-CA \
locale-dippi-ga \
locale-dippi-gd \
locale-dippi-gl \
locale-dippi-gu \
locale-dippi-he \
locale-dippi-hi \
locale-dippi-hr \
locale-dippi-hu \
locale-dippi-ia \
locale-dippi-id \
locale-dippi-is \
locale-dippi-it \
locale-dippi-ja \
locale-dippi-ka \
locale-dippi-kk \
locale-dippi-km \
locale-dippi-kn \
locale-dippi-ko \
locale-dippi-lt \
locale-dippi-lv \
locale-dippi-mk \
locale-dippi-ml \
locale-dippi-mr \
locale-dippi-ms \
locale-dippi-nb \
locale-dippi-ne \
locale-dippi-nl \
locale-dippi-nn \
locale-dippi-oc \
locale-dippi-or \
locale-dippi-pa \
locale-dippi-pl \
locale-dippi-pt \
locale-dippi-pt-BR \
locale-dippi-ro \
locale-dippi-ru \
locale-dippi-si \
locale-dippi-sk \
locale-dippi-sl \
locale-dippi-sq \
locale-dippi-sr \
locale-dippi-sv \
locale-dippi-ta \
locale-dippi-te \
locale-dippi-th \
locale-dippi-tr \
locale-dippi-ug \
locale-dippi-uk \
locale-dippi-vi \
locale-dippi-wa \
locale-dippi-zh \
locale-dippi-zh-CN \
locale-dippi-zh-HK \
locale-dippi-zh-TW"

RDEPENDS:${PN} += "dippi"

inherit rpm
