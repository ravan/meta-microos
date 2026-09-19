SUMMARY = "Translations for package caja-extension-terminal"
DESCRIPTION = "Provides translations for the 'caja-extension-terminal' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.10"

RPM_NAME = "caja-extension-terminal-lang-0.10-3.15.noarch.rpm"
RPM_HASH = "f5d4fcd929b8187eeb2edc2018124a96bf030acd1cac36ab0c4e392a9b1c74c39c205a499c42b948a105ee29842109b94090c848120f8523cd5c11ba5f0edf76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-terminal-lang \
caja-extension-terminal-lang-all \
locale-caja-extension-terminal-bg \
locale-caja-extension-terminal-ca \
locale-caja-extension-terminal-cs \
locale-caja-extension-terminal-de \
locale-caja-extension-terminal-es \
locale-caja-extension-terminal-fr \
locale-caja-extension-terminal-he \
locale-caja-extension-terminal-hu \
locale-caja-extension-terminal-it \
locale-caja-extension-terminal-lv \
locale-caja-extension-terminal-nb \
locale-caja-extension-terminal-nl \
locale-caja-extension-terminal-pl \
locale-caja-extension-terminal-pt \
locale-caja-extension-terminal-pt-BR \
locale-caja-extension-terminal-ro \
locale-caja-extension-terminal-ru \
locale-caja-extension-terminal-sv \
locale-caja-extension-terminal-tr"

RDEPENDS:${PN} += "caja-extension-terminal"

inherit rpm
