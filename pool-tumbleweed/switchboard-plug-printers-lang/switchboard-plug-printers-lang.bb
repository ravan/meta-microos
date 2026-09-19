SUMMARY = "Translations for package switchboard-plug-printers"
DESCRIPTION = "Provides translations for the 'switchboard-plug-printers' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "switchboard-plug-printers-lang-8.0.2-1.4.noarch.rpm"
RPM_HASH = "5943fe54d38fc910a89df51176ffee58874251cd6ee0c35210bb91de4ccaef47fb17ec2b83d116a7af5fe5866d688608712ea37ff88ec7ff5fafda76407a43cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-switchboard-plug-printers-af \
locale-switchboard-plug-printers-ar \
locale-switchboard-plug-printers-as \
locale-switchboard-plug-printers-ast \
locale-switchboard-plug-printers-az \
locale-switchboard-plug-printers-be \
locale-switchboard-plug-printers-bg \
locale-switchboard-plug-printers-bn \
locale-switchboard-plug-printers-br \
locale-switchboard-plug-printers-bs \
locale-switchboard-plug-printers-ca \
locale-switchboard-plug-printers-cs \
locale-switchboard-plug-printers-cy \
locale-switchboard-plug-printers-da \
locale-switchboard-plug-printers-de \
locale-switchboard-plug-printers-dz \
locale-switchboard-plug-printers-el \
locale-switchboard-plug-printers-en-AU \
locale-switchboard-plug-printers-en-CA \
locale-switchboard-plug-printers-en-GB \
locale-switchboard-plug-printers-eo \
locale-switchboard-plug-printers-es \
locale-switchboard-plug-printers-et \
locale-switchboard-plug-printers-eu \
locale-switchboard-plug-printers-fa \
locale-switchboard-plug-printers-fi \
locale-switchboard-plug-printers-fr \
locale-switchboard-plug-printers-fr-CA \
locale-switchboard-plug-printers-ga \
locale-switchboard-plug-printers-gd \
locale-switchboard-plug-printers-gl \
locale-switchboard-plug-printers-gu \
locale-switchboard-plug-printers-he \
locale-switchboard-plug-printers-hi \
locale-switchboard-plug-printers-hr \
locale-switchboard-plug-printers-hu \
locale-switchboard-plug-printers-ia \
locale-switchboard-plug-printers-id \
locale-switchboard-plug-printers-is \
locale-switchboard-plug-printers-it \
locale-switchboard-plug-printers-ja \
locale-switchboard-plug-printers-ka \
locale-switchboard-plug-printers-kk \
locale-switchboard-plug-printers-km \
locale-switchboard-plug-printers-kn \
locale-switchboard-plug-printers-ko \
locale-switchboard-plug-printers-lt \
locale-switchboard-plug-printers-lv \
locale-switchboard-plug-printers-mk \
locale-switchboard-plug-printers-ml \
locale-switchboard-plug-printers-mr \
locale-switchboard-plug-printers-ms \
locale-switchboard-plug-printers-nb \
locale-switchboard-plug-printers-ne \
locale-switchboard-plug-printers-nl \
locale-switchboard-plug-printers-nn \
locale-switchboard-plug-printers-oc \
locale-switchboard-plug-printers-or \
locale-switchboard-plug-printers-pa \
locale-switchboard-plug-printers-pl \
locale-switchboard-plug-printers-pt \
locale-switchboard-plug-printers-pt-BR \
locale-switchboard-plug-printers-ro \
locale-switchboard-plug-printers-ru \
locale-switchboard-plug-printers-si \
locale-switchboard-plug-printers-sk \
locale-switchboard-plug-printers-sl \
locale-switchboard-plug-printers-sq \
locale-switchboard-plug-printers-sr \
locale-switchboard-plug-printers-sr@latin \
locale-switchboard-plug-printers-sv \
locale-switchboard-plug-printers-ta \
locale-switchboard-plug-printers-te \
locale-switchboard-plug-printers-th \
locale-switchboard-plug-printers-tr \
locale-switchboard-plug-printers-ug \
locale-switchboard-plug-printers-uk \
locale-switchboard-plug-printers-vi \
locale-switchboard-plug-printers-wa \
locale-switchboard-plug-printers-zh \
locale-switchboard-plug-printers-zh-CN \
locale-switchboard-plug-printers-zh-TW \
switchboard-plug-printers-lang \
switchboard-plug-printers-lang-all"

RDEPENDS:${PN} += "switchboard-plug-printers"

inherit rpm
