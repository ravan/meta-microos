SUMMARY = "Translations for package 4pane"
DESCRIPTION = "Provides translations for the '4pane' package."
LICENSE = "GPL-3.0-only"

PV = "8.0"

RPM_NAME = "4pane-lang-8.0-2.6.noarch.rpm"
RPM_HASH = "6c088b1e9e7f7fd1825d9eabdfcb71343d125d5bc31455faa50dc6a119ea3b36a26f0caf1d5a5ee907d874c40086eedc315c984a27914f592917067b985c3bed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "4pane-lang \
4pane-lang-all \
locale-4pane-ar \
locale-4pane-ca \
locale-4pane-da \
locale-4pane-de \
locale-4pane-el \
locale-4pane-es \
locale-4pane-et \
locale-4pane-fa \
locale-4pane-fi-FI \
locale-4pane-fr \
locale-4pane-fr-FR \
locale-4pane-it \
locale-4pane-ja \
locale-4pane-nl \
locale-4pane-pl \
locale-4pane-pt-BR \
locale-4pane-ru \
locale-4pane-tr \
locale-4pane-uk-UA \
locale-4pane-vi \
locale-4pane-zh \
locale-4pane-zh-CN \
locale-4pane-zh-TW"

RDEPENDS:${PN} += "4pane"

inherit rpm
