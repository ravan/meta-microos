SUMMARY = "Translations for package NetworkManager-libreswan"
DESCRIPTION = "Provides translations for the 'NetworkManager-libreswan' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.30"

RPM_NAME = "NetworkManager-libreswan-lang-1.2.30-1.4.noarch.rpm"
RPM_HASH = "59d12a9a89f5e5d438b62a521cc4b21be681227e21cf59ce008a44d723606b429a767c5d54ea272622aaf25e75fdfd894aa6d0fa9db39019fbacbda93dda3e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-libreswan-lang \
NetworkManager-libreswan-lang-all \
locale-NetworkManager-libreswan-ar \
locale-NetworkManager-libreswan-bg \
locale-NetworkManager-libreswan-bs \
locale-NetworkManager-libreswan-ca \
locale-NetworkManager-libreswan-cs \
locale-NetworkManager-libreswan-da \
locale-NetworkManager-libreswan-de \
locale-NetworkManager-libreswan-dz \
locale-NetworkManager-libreswan-el \
locale-NetworkManager-libreswan-en-GB \
locale-NetworkManager-libreswan-es \
locale-NetworkManager-libreswan-et \
locale-NetworkManager-libreswan-eu \
locale-NetworkManager-libreswan-fi \
locale-NetworkManager-libreswan-fr \
locale-NetworkManager-libreswan-fur \
locale-NetworkManager-libreswan-gl \
locale-NetworkManager-libreswan-gu \
locale-NetworkManager-libreswan-hi \
locale-NetworkManager-libreswan-hr \
locale-NetworkManager-libreswan-hu \
locale-NetworkManager-libreswan-id \
locale-NetworkManager-libreswan-it \
locale-NetworkManager-libreswan-ja \
locale-NetworkManager-libreswan-ka \
locale-NetworkManager-libreswan-ko \
locale-NetworkManager-libreswan-lt \
locale-NetworkManager-libreswan-lv \
locale-NetworkManager-libreswan-mk \
locale-NetworkManager-libreswan-mr \
locale-NetworkManager-libreswan-nb \
locale-NetworkManager-libreswan-nl \
locale-NetworkManager-libreswan-oc \
locale-NetworkManager-libreswan-or \
locale-NetworkManager-libreswan-pa \
locale-NetworkManager-libreswan-pl \
locale-NetworkManager-libreswan-pt \
locale-NetworkManager-libreswan-pt-BR \
locale-NetworkManager-libreswan-ro \
locale-NetworkManager-libreswan-ru \
locale-NetworkManager-libreswan-sl \
locale-NetworkManager-libreswan-sr \
locale-NetworkManager-libreswan-sr@latin \
locale-NetworkManager-libreswan-sv \
locale-NetworkManager-libreswan-ta \
locale-NetworkManager-libreswan-te \
locale-NetworkManager-libreswan-th \
locale-NetworkManager-libreswan-tr \
locale-NetworkManager-libreswan-uk \
locale-NetworkManager-libreswan-vi \
locale-NetworkManager-libreswan-zh-CN \
locale-NetworkManager-libreswan-zh-HK \
locale-NetworkManager-libreswan-zh-TW"

RDEPENDS:${PN} += "NetworkManager-libreswan"

inherit rpm
