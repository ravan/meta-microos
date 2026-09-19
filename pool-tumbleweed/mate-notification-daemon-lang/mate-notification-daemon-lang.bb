SUMMARY = "Translations for package mate-notification-daemon"
DESCRIPTION = "Provides translations for the 'mate-notification-daemon' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-notification-daemon-lang-1.28.0-1.12.noarch.rpm"
RPM_HASH = "511e0aff344b7b03570ccfe8033ffb565577ecbecb75d6bbffd53295304063eb2b2fb4efd5ba160169f57a2a78e573555fb996a7b22a18f559406446670a41ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-notification-daemon-af \
locale-mate-notification-daemon-ar \
locale-mate-notification-daemon-as \
locale-mate-notification-daemon-ast \
locale-mate-notification-daemon-az \
locale-mate-notification-daemon-be \
locale-mate-notification-daemon-bg \
locale-mate-notification-daemon-bn \
locale-mate-notification-daemon-bn-IN \
locale-mate-notification-daemon-br \
locale-mate-notification-daemon-bs \
locale-mate-notification-daemon-ca \
locale-mate-notification-daemon-ca@valencia \
locale-mate-notification-daemon-cs \
locale-mate-notification-daemon-cy \
locale-mate-notification-daemon-da \
locale-mate-notification-daemon-de \
locale-mate-notification-daemon-dz \
locale-mate-notification-daemon-el \
locale-mate-notification-daemon-en-AU \
locale-mate-notification-daemon-en-CA \
locale-mate-notification-daemon-en-GB \
locale-mate-notification-daemon-eo \
locale-mate-notification-daemon-es \
locale-mate-notification-daemon-es-AR \
locale-mate-notification-daemon-es-CL \
locale-mate-notification-daemon-es-CO \
locale-mate-notification-daemon-es-MX \
locale-mate-notification-daemon-et \
locale-mate-notification-daemon-eu \
locale-mate-notification-daemon-fa \
locale-mate-notification-daemon-fi \
locale-mate-notification-daemon-fr \
locale-mate-notification-daemon-fr-CA \
locale-mate-notification-daemon-ga \
locale-mate-notification-daemon-gl \
locale-mate-notification-daemon-gu \
locale-mate-notification-daemon-he \
locale-mate-notification-daemon-hi \
locale-mate-notification-daemon-hr \
locale-mate-notification-daemon-hu \
locale-mate-notification-daemon-id \
locale-mate-notification-daemon-is \
locale-mate-notification-daemon-it \
locale-mate-notification-daemon-ja \
locale-mate-notification-daemon-ka \
locale-mate-notification-daemon-kk \
locale-mate-notification-daemon-kn \
locale-mate-notification-daemon-ko \
locale-mate-notification-daemon-lt \
locale-mate-notification-daemon-lv \
locale-mate-notification-daemon-mai \
locale-mate-notification-daemon-mk \
locale-mate-notification-daemon-ml \
locale-mate-notification-daemon-mr \
locale-mate-notification-daemon-ms \
locale-mate-notification-daemon-nb \
locale-mate-notification-daemon-nds \
locale-mate-notification-daemon-ne \
locale-mate-notification-daemon-nl \
locale-mate-notification-daemon-nn \
locale-mate-notification-daemon-oc \
locale-mate-notification-daemon-or \
locale-mate-notification-daemon-pa \
locale-mate-notification-daemon-pl \
locale-mate-notification-daemon-pt \
locale-mate-notification-daemon-pt-BR \
locale-mate-notification-daemon-ro \
locale-mate-notification-daemon-ru \
locale-mate-notification-daemon-si \
locale-mate-notification-daemon-sk \
locale-mate-notification-daemon-sl \
locale-mate-notification-daemon-sq \
locale-mate-notification-daemon-sr \
locale-mate-notification-daemon-sr@latin \
locale-mate-notification-daemon-sv \
locale-mate-notification-daemon-ta \
locale-mate-notification-daemon-te \
locale-mate-notification-daemon-th \
locale-mate-notification-daemon-tr \
locale-mate-notification-daemon-ug \
locale-mate-notification-daemon-uk \
locale-mate-notification-daemon-vi \
locale-mate-notification-daemon-wa \
locale-mate-notification-daemon-zh-CN \
locale-mate-notification-daemon-zh-HK \
locale-mate-notification-daemon-zh-TW \
mate-notification-daemon-lang \
mate-notification-daemon-lang-all"

RDEPENDS:${PN} += "mate-notification-daemon"

inherit rpm
