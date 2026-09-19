SUMMARY = "Translations for package dialog"
DESCRIPTION = "Provides translations for the 'dialog' package."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "dialog-lang-1.3-14.1.noarch.rpm"
RPM_HASH = "cd5e79139846a8c7e21b82388edbbe6d22ee485d5dc8d08af080942a8da5547e814219a60bc1a2f5cf1997cd73229ae00555380b5b91f347290b9ec40e983406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dialog-lang \
dialog-lang-all \
locale-dialog-ar \
locale-dialog-ast \
locale-dialog-be@latin \
locale-dialog-bg \
locale-dialog-ca \
locale-dialog-cs \
locale-dialog-cy \
locale-dialog-da \
locale-dialog-de \
locale-dialog-el \
locale-dialog-eo \
locale-dialog-es \
locale-dialog-et \
locale-dialog-eu \
locale-dialog-fa \
locale-dialog-fi \
locale-dialog-fr \
locale-dialog-fur \
locale-dialog-ga \
locale-dialog-gd \
locale-dialog-gl \
locale-dialog-hi \
locale-dialog-hr \
locale-dialog-hu \
locale-dialog-ia \
locale-dialog-id \
locale-dialog-is \
locale-dialog-it \
locale-dialog-ja \
locale-dialog-ka \
locale-dialog-lt \
locale-dialog-lv \
locale-dialog-mk \
locale-dialog-ms \
locale-dialog-nb \
locale-dialog-nl \
locale-dialog-pl \
locale-dialog-pt \
locale-dialog-pt-BR \
locale-dialog-ro \
locale-dialog-ru \
locale-dialog-sk \
locale-dialog-sl \
locale-dialog-sq \
locale-dialog-sr \
locale-dialog-sv \
locale-dialog-th \
locale-dialog-tr \
locale-dialog-uk \
locale-dialog-vi \
locale-dialog-wa \
locale-dialog-zh-CN \
locale-dialog-zh-TW"

RDEPENDS:${PN} += "dialog"

inherit rpm
