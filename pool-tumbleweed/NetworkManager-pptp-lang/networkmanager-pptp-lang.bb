SUMMARY = "Translations for package NetworkManager-pptp"
DESCRIPTION = "Provides translations for the 'NetworkManager-pptp' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.12"

RPM_NAME = "NetworkManager-pptp-lang-1.2.12-3.10.noarch.rpm"
RPM_HASH = "f0120517329a955c9262a4104baae084210c3fa39d4d5b3c217768f8e4f5d1893daa0714295252c22a174667084682f944b4c29cce1cc6628bc51db627520816"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-pptp-lang \
NetworkManager-pptp-lang-all \
locale-NetworkManager-pptp-ar \
locale-NetworkManager-pptp-as \
locale-NetworkManager-pptp-be@latin \
locale-NetworkManager-pptp-bg \
locale-NetworkManager-pptp-bn-IN \
locale-NetworkManager-pptp-bs \
locale-NetworkManager-pptp-ca \
locale-NetworkManager-pptp-ca@valencia \
locale-NetworkManager-pptp-cs \
locale-NetworkManager-pptp-da \
locale-NetworkManager-pptp-de \
locale-NetworkManager-pptp-el \
locale-NetworkManager-pptp-en-GB \
locale-NetworkManager-pptp-eo \
locale-NetworkManager-pptp-es \
locale-NetworkManager-pptp-et \
locale-NetworkManager-pptp-eu \
locale-NetworkManager-pptp-fa \
locale-NetworkManager-pptp-fi \
locale-NetworkManager-pptp-fr \
locale-NetworkManager-pptp-fur \
locale-NetworkManager-pptp-gl \
locale-NetworkManager-pptp-gu \
locale-NetworkManager-pptp-he \
locale-NetworkManager-pptp-hr \
locale-NetworkManager-pptp-hu \
locale-NetworkManager-pptp-id \
locale-NetworkManager-pptp-it \
locale-NetworkManager-pptp-ja \
locale-NetworkManager-pptp-ka \
locale-NetworkManager-pptp-kn \
locale-NetworkManager-pptp-ko \
locale-NetworkManager-pptp-lt \
locale-NetworkManager-pptp-lv \
locale-NetworkManager-pptp-mk \
locale-NetworkManager-pptp-mr \
locale-NetworkManager-pptp-nb \
locale-NetworkManager-pptp-nl \
locale-NetworkManager-pptp-oc \
locale-NetworkManager-pptp-pa \
locale-NetworkManager-pptp-pl \
locale-NetworkManager-pptp-pt \
locale-NetworkManager-pptp-pt-BR \
locale-NetworkManager-pptp-ro \
locale-NetworkManager-pptp-ru \
locale-NetworkManager-pptp-sk \
locale-NetworkManager-pptp-sl \
locale-NetworkManager-pptp-sr \
locale-NetworkManager-pptp-sr@latin \
locale-NetworkManager-pptp-sv \
locale-NetworkManager-pptp-ta \
locale-NetworkManager-pptp-te \
locale-NetworkManager-pptp-th \
locale-NetworkManager-pptp-tr \
locale-NetworkManager-pptp-ug \
locale-NetworkManager-pptp-uk \
locale-NetworkManager-pptp-vi \
locale-NetworkManager-pptp-zh-CN \
locale-NetworkManager-pptp-zh-HK \
locale-NetworkManager-pptp-zh-TW"

RDEPENDS:${PN} += "NetworkManager-pptp"

inherit rpm
