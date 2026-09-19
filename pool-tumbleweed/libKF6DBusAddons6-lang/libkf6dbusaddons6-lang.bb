SUMMARY = "Translations for package libKF6DBusAddons6"
DESCRIPTION = "Provides translations for the 'libKF6DBusAddons6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6DBusAddons6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "7595fedf61845ed8aa83ef8b31c493375fa03af6a70a62af5c91a22f044d50ebdeec53759de54d7bf77483f9ac03f495cd8c67841dfce581a520e44dbd14d7d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6DBusAddons6-lang \
libKF6DBusAddons6-lang-all \
locale-libKF6DBusAddons6-ar \
locale-libKF6DBusAddons6-ast \
locale-libKF6DBusAddons6-az \
locale-libKF6DBusAddons6-bg \
locale-libKF6DBusAddons6-bs \
locale-libKF6DBusAddons6-ca \
locale-libKF6DBusAddons6-ca@valencia \
locale-libKF6DBusAddons6-cs \
locale-libKF6DBusAddons6-da \
locale-libKF6DBusAddons6-de \
locale-libKF6DBusAddons6-el \
locale-libKF6DBusAddons6-en-GB \
locale-libKF6DBusAddons6-eo \
locale-libKF6DBusAddons6-es \
locale-libKF6DBusAddons6-et \
locale-libKF6DBusAddons6-eu \
locale-libKF6DBusAddons6-fi \
locale-libKF6DBusAddons6-fr \
locale-libKF6DBusAddons6-ga \
locale-libKF6DBusAddons6-gd \
locale-libKF6DBusAddons6-gl \
locale-libKF6DBusAddons6-he \
locale-libKF6DBusAddons6-hi \
locale-libKF6DBusAddons6-hr \
locale-libKF6DBusAddons6-hu \
locale-libKF6DBusAddons6-ia \
locale-libKF6DBusAddons6-id \
locale-libKF6DBusAddons6-is \
locale-libKF6DBusAddons6-it \
locale-libKF6DBusAddons6-ja \
locale-libKF6DBusAddons6-ka \
locale-libKF6DBusAddons6-ko \
locale-libKF6DBusAddons6-lt \
locale-libKF6DBusAddons6-lv \
locale-libKF6DBusAddons6-ml \
locale-libKF6DBusAddons6-nb \
locale-libKF6DBusAddons6-nds \
locale-libKF6DBusAddons6-nl \
locale-libKF6DBusAddons6-nn \
locale-libKF6DBusAddons6-pa \
locale-libKF6DBusAddons6-pl \
locale-libKF6DBusAddons6-pt \
locale-libKF6DBusAddons6-pt-BR \
locale-libKF6DBusAddons6-ro \
locale-libKF6DBusAddons6-ru \
locale-libKF6DBusAddons6-sk \
locale-libKF6DBusAddons6-sl \
locale-libKF6DBusAddons6-sr \
locale-libKF6DBusAddons6-sr@ijekavian \
locale-libKF6DBusAddons6-sr@ijekavianlatin \
locale-libKF6DBusAddons6-sr@latin \
locale-libKF6DBusAddons6-sv \
locale-libKF6DBusAddons6-ta \
locale-libKF6DBusAddons6-tr \
locale-libKF6DBusAddons6-ug \
locale-libKF6DBusAddons6-uk \
locale-libKF6DBusAddons6-zh-CN \
locale-libKF6DBusAddons6-zh-TW"

RDEPENDS:${PN} += "libKF6DBusAddons6"

inherit rpm
