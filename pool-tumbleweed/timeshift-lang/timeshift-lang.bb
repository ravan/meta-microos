SUMMARY = "Translations for package timeshift"
DESCRIPTION = "Provides translations for the 'timeshift' package."
LICENSE = "GPL-3.0-only"

PV = "25.12.4"

RPM_NAME = "timeshift-lang-25.12.4-1.3.noarch.rpm"
RPM_HASH = "200d3b57811e15b13e0e6314c9804a028c71c04a8780a6c1d74ee52afd369112b5c644f97f35754efe06fbfc0f3e93ee80204d5a8b1133301569a187d580ff7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-timeshift-ar \
locale-timeshift-az \
locale-timeshift-be \
locale-timeshift-bg \
locale-timeshift-br \
locale-timeshift-ca \
locale-timeshift-ca@valencia \
locale-timeshift-cs \
locale-timeshift-cy \
locale-timeshift-da \
locale-timeshift-de \
locale-timeshift-el \
locale-timeshift-en-GB \
locale-timeshift-eo \
locale-timeshift-es \
locale-timeshift-et \
locale-timeshift-eu \
locale-timeshift-fa \
locale-timeshift-fi \
locale-timeshift-fr \
locale-timeshift-fr-CA \
locale-timeshift-he \
locale-timeshift-hi \
locale-timeshift-hr \
locale-timeshift-hu \
locale-timeshift-ia \
locale-timeshift-id \
locale-timeshift-is \
locale-timeshift-it \
locale-timeshift-ja \
locale-timeshift-ka \
locale-timeshift-ko \
locale-timeshift-lt \
locale-timeshift-lv \
locale-timeshift-mk \
locale-timeshift-nb \
locale-timeshift-ne \
locale-timeshift-nl \
locale-timeshift-nn \
locale-timeshift-oc \
locale-timeshift-pl \
locale-timeshift-pt \
locale-timeshift-pt-BR \
locale-timeshift-ro \
locale-timeshift-ru \
locale-timeshift-sk \
locale-timeshift-sl \
locale-timeshift-sq \
locale-timeshift-sr \
locale-timeshift-sr@latin \
locale-timeshift-sv \
locale-timeshift-te \
locale-timeshift-th \
locale-timeshift-tr \
locale-timeshift-uk \
locale-timeshift-vi \
locale-timeshift-zh-CN \
locale-timeshift-zh-TW \
timeshift-lang \
timeshift-lang-all"

RDEPENDS:${PN} += "timeshift"

inherit rpm
