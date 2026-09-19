SUMMARY = "Translations for package notification-daemon"
DESCRIPTION = "Provides translations for the 'notification-daemon' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.20.0"

RPM_NAME = "notification-daemon-lang-3.20.0-8.7.noarch.rpm"
RPM_HASH = "1c2992bf198266a867796501366efba16a4055145aa5885471de44756e5da3edbbc947ceb17faaa6d95ac88f075eb5e78765af99a977676bd7f9d2a752a9adc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-notification-daemon-af \
locale-notification-daemon-ar \
locale-notification-daemon-as \
locale-notification-daemon-ast \
locale-notification-daemon-be \
locale-notification-daemon-bg \
locale-notification-daemon-bn \
locale-notification-daemon-bn-IN \
locale-notification-daemon-bs \
locale-notification-daemon-ca \
locale-notification-daemon-ca@valencia \
locale-notification-daemon-cs \
locale-notification-daemon-da \
locale-notification-daemon-de \
locale-notification-daemon-el \
locale-notification-daemon-en-GB \
locale-notification-daemon-eo \
locale-notification-daemon-es \
locale-notification-daemon-et \
locale-notification-daemon-eu \
locale-notification-daemon-fa \
locale-notification-daemon-fi \
locale-notification-daemon-fr \
locale-notification-daemon-fur \
locale-notification-daemon-gl \
locale-notification-daemon-gu \
locale-notification-daemon-he \
locale-notification-daemon-hi \
locale-notification-daemon-hu \
locale-notification-daemon-id \
locale-notification-daemon-it \
locale-notification-daemon-ja \
locale-notification-daemon-km \
locale-notification-daemon-kn \
locale-notification-daemon-ko \
locale-notification-daemon-lt \
locale-notification-daemon-lv \
locale-notification-daemon-ml \
locale-notification-daemon-mr \
locale-notification-daemon-ms \
locale-notification-daemon-nb \
locale-notification-daemon-nl \
locale-notification-daemon-nn \
locale-notification-daemon-oc \
locale-notification-daemon-or \
locale-notification-daemon-pa \
locale-notification-daemon-pl \
locale-notification-daemon-pt \
locale-notification-daemon-pt-BR \
locale-notification-daemon-ro \
locale-notification-daemon-ru \
locale-notification-daemon-sk \
locale-notification-daemon-sl \
locale-notification-daemon-sr \
locale-notification-daemon-sr@latin \
locale-notification-daemon-sv \
locale-notification-daemon-ta \
locale-notification-daemon-te \
locale-notification-daemon-th \
locale-notification-daemon-tr \
locale-notification-daemon-ug \
locale-notification-daemon-uk \
locale-notification-daemon-vi \
locale-notification-daemon-zh-CN \
locale-notification-daemon-zh-HK \
locale-notification-daemon-zh-TW \
notification-daemon-lang \
notification-daemon-lang-all"

RDEPENDS:${PN} += "notification-daemon"

inherit rpm
