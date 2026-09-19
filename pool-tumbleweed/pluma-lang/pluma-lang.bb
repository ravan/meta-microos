SUMMARY = "Translations for package pluma"
DESCRIPTION = "Provides translations for the 'pluma' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "pluma-lang-1.28.1-1.3.noarch.rpm"
RPM_HASH = "0a3034dd089a00e3835c144ef9d7184367896d3b77662f3e2da6630627a761cb1263d1292a3ae7e392f0bf8f03780a34d568089d0c41e8ac6422bb798adb8913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pluma-af \
locale-pluma-ar \
locale-pluma-as \
locale-pluma-ast \
locale-pluma-az \
locale-pluma-be \
locale-pluma-bg \
locale-pluma-bn \
locale-pluma-bn-IN \
locale-pluma-br \
locale-pluma-bs \
locale-pluma-ca \
locale-pluma-ca@valencia \
locale-pluma-cs \
locale-pluma-cy \
locale-pluma-da \
locale-pluma-de \
locale-pluma-dz \
locale-pluma-el \
locale-pluma-en-AU \
locale-pluma-en-CA \
locale-pluma-en-GB \
locale-pluma-eo \
locale-pluma-es \
locale-pluma-es-AR \
locale-pluma-es-CO \
locale-pluma-es-MX \
locale-pluma-et \
locale-pluma-eu \
locale-pluma-fa \
locale-pluma-fi \
locale-pluma-fr \
locale-pluma-fr-CA \
locale-pluma-fur \
locale-pluma-ga \
locale-pluma-gl \
locale-pluma-gu \
locale-pluma-he \
locale-pluma-hi \
locale-pluma-hr \
locale-pluma-hu \
locale-pluma-ia \
locale-pluma-id \
locale-pluma-is \
locale-pluma-it \
locale-pluma-ja \
locale-pluma-ka \
locale-pluma-kk \
locale-pluma-kn \
locale-pluma-ko \
locale-pluma-lt \
locale-pluma-lv \
locale-pluma-mai \
locale-pluma-mk \
locale-pluma-ml \
locale-pluma-mr \
locale-pluma-ms \
locale-pluma-nb \
locale-pluma-nds \
locale-pluma-ne \
locale-pluma-nl \
locale-pluma-nn \
locale-pluma-oc \
locale-pluma-or \
locale-pluma-pa \
locale-pluma-pl \
locale-pluma-pt \
locale-pluma-pt-BR \
locale-pluma-ro \
locale-pluma-ru \
locale-pluma-si \
locale-pluma-sk \
locale-pluma-sl \
locale-pluma-sq \
locale-pluma-sr \
locale-pluma-sr@latin \
locale-pluma-sv \
locale-pluma-ta \
locale-pluma-te \
locale-pluma-th \
locale-pluma-tr \
locale-pluma-ug \
locale-pluma-uk \
locale-pluma-vi \
locale-pluma-wa \
locale-pluma-zh-CN \
locale-pluma-zh-HK \
locale-pluma-zh-TW \
pluma-lang \
pluma-lang-all"

RDEPENDS:${PN} += "pluma"

inherit rpm
