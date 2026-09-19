SUMMARY = "Zsh completion for bluez"
DESCRIPTION = "This package contain the zsh completion command for the Bluetooth Stack for Linux."
LICENSE = "GPL-2.0-or-later"

PV = "5.82"

RPM_NAME = "bluez-zsh-completion-5.82-2.4.noarch.rpm"
RPM_HASH = "170eaefb75e8d07a946ef2ac2f8bae9bcff58fc99d4aaa5847ebd4daa570c138159afbea51cee97ad72679a6d84d2cacfb47a32f0c353da5b4ed1b9cc2846522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluez-zsh-completion"

RDEPENDS:${PN} += "bluez \
zsh"

inherit rpm
