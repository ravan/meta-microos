SUMMARY = "Translations for package NetworkManager-fortisslvpn"
DESCRIPTION = "Provides translations for the 'NetworkManager-fortisslvpn' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "NetworkManager-fortisslvpn-lang-1.4.0-5.11.noarch.rpm"
RPM_HASH = "975c9b1d849769f38cfd5afb447522119438f773594b6d56d3de1554b2480aa35e941523921ac81866ef2fe421e2a2c9e78538951d09dbc7f7bf449c4e9b18ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-fortisslvpn-lang \
NetworkManager-fortisslvpn-lang-all \
locale-NetworkManager-fortisslvpn-ar \
locale-NetworkManager-fortisslvpn-as \
locale-NetworkManager-fortisslvpn-be@latin \
locale-NetworkManager-fortisslvpn-bg \
locale-NetworkManager-fortisslvpn-bn-IN \
locale-NetworkManager-fortisslvpn-bs \
locale-NetworkManager-fortisslvpn-ca \
locale-NetworkManager-fortisslvpn-ca@valencia \
locale-NetworkManager-fortisslvpn-cs \
locale-NetworkManager-fortisslvpn-da \
locale-NetworkManager-fortisslvpn-de \
locale-NetworkManager-fortisslvpn-el \
locale-NetworkManager-fortisslvpn-en-GB \
locale-NetworkManager-fortisslvpn-eo \
locale-NetworkManager-fortisslvpn-es \
locale-NetworkManager-fortisslvpn-et \
locale-NetworkManager-fortisslvpn-eu \
locale-NetworkManager-fortisslvpn-fa \
locale-NetworkManager-fortisslvpn-fi \
locale-NetworkManager-fortisslvpn-fr \
locale-NetworkManager-fortisslvpn-fur \
locale-NetworkManager-fortisslvpn-gl \
locale-NetworkManager-fortisslvpn-gu \
locale-NetworkManager-fortisslvpn-he \
locale-NetworkManager-fortisslvpn-hr \
locale-NetworkManager-fortisslvpn-hu \
locale-NetworkManager-fortisslvpn-id \
locale-NetworkManager-fortisslvpn-it \
locale-NetworkManager-fortisslvpn-ja \
locale-NetworkManager-fortisslvpn-ka \
locale-NetworkManager-fortisslvpn-kn \
locale-NetworkManager-fortisslvpn-ko \
locale-NetworkManager-fortisslvpn-lt \
locale-NetworkManager-fortisslvpn-lv \
locale-NetworkManager-fortisslvpn-mk \
locale-NetworkManager-fortisslvpn-mr \
locale-NetworkManager-fortisslvpn-nb \
locale-NetworkManager-fortisslvpn-nl \
locale-NetworkManager-fortisslvpn-oc \
locale-NetworkManager-fortisslvpn-pa \
locale-NetworkManager-fortisslvpn-pl \
locale-NetworkManager-fortisslvpn-pt \
locale-NetworkManager-fortisslvpn-pt-BR \
locale-NetworkManager-fortisslvpn-ro \
locale-NetworkManager-fortisslvpn-ru \
locale-NetworkManager-fortisslvpn-sl \
locale-NetworkManager-fortisslvpn-sr \
locale-NetworkManager-fortisslvpn-sr@latin \
locale-NetworkManager-fortisslvpn-sv \
locale-NetworkManager-fortisslvpn-ta \
locale-NetworkManager-fortisslvpn-te \
locale-NetworkManager-fortisslvpn-th \
locale-NetworkManager-fortisslvpn-tr \
locale-NetworkManager-fortisslvpn-ug \
locale-NetworkManager-fortisslvpn-uk \
locale-NetworkManager-fortisslvpn-vi \
locale-NetworkManager-fortisslvpn-zh-CN \
locale-NetworkManager-fortisslvpn-zh-HK \
locale-NetworkManager-fortisslvpn-zh-TW"

RDEPENDS:${PN} += "NetworkManager-fortisslvpn"

inherit rpm
