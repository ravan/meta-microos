SUMMARY = "Translations for package opensuse-welcome"
DESCRIPTION = "Provides translations for the 'opensuse-welcome' package."
LICENSE = "GPL-3.0-or-later"

PV = "50.0.openSUSE+git20260413.334ffbd"

RPM_NAME = "opensuse-welcome-lang-50.0.openSUSE+git20260413.334ffbd-1.3.noarch.rpm"
RPM_HASH = "954289d46f909911ce4df4f780aca58ee22e8401ce45152e90734e47d1a185ff79a9dd403ce9a31ad9d5f81cec8edcd44d348771d1f190b3d36a2a15df5c251d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-opensuse-welcome-ar \
locale-opensuse-welcome-be \
locale-opensuse-welcome-bg \
locale-opensuse-welcome-bn \
locale-opensuse-welcome-ca \
locale-opensuse-welcome-cs \
locale-opensuse-welcome-da \
locale-opensuse-welcome-de \
locale-opensuse-welcome-el \
locale-opensuse-welcome-en-GB \
locale-opensuse-welcome-eo \
locale-opensuse-welcome-es \
locale-opensuse-welcome-eu \
locale-opensuse-welcome-fa \
locale-opensuse-welcome-fi \
locale-opensuse-welcome-fr \
locale-opensuse-welcome-fur \
locale-opensuse-welcome-gl \
locale-opensuse-welcome-he \
locale-opensuse-welcome-hi \
locale-opensuse-welcome-hr \
locale-opensuse-welcome-hu \
locale-opensuse-welcome-ia \
locale-opensuse-welcome-id \
locale-opensuse-welcome-is \
locale-opensuse-welcome-it \
locale-opensuse-welcome-ja \
locale-opensuse-welcome-ka \
locale-opensuse-welcome-kk \
locale-opensuse-welcome-ko \
locale-opensuse-welcome-lt \
locale-opensuse-welcome-lv \
locale-opensuse-welcome-ml \
locale-opensuse-welcome-nb \
locale-opensuse-welcome-ne \
locale-opensuse-welcome-nl \
locale-opensuse-welcome-nn \
locale-opensuse-welcome-oc \
locale-opensuse-welcome-pa \
locale-opensuse-welcome-pl \
locale-opensuse-welcome-pt \
locale-opensuse-welcome-pt-BR \
locale-opensuse-welcome-ro \
locale-opensuse-welcome-ru \
locale-opensuse-welcome-sk \
locale-opensuse-welcome-sl \
locale-opensuse-welcome-sr \
locale-opensuse-welcome-sr@latin \
locale-opensuse-welcome-sv \
locale-opensuse-welcome-ta \
locale-opensuse-welcome-th \
locale-opensuse-welcome-tr \
locale-opensuse-welcome-ug \
locale-opensuse-welcome-uk \
locale-opensuse-welcome-vi \
locale-opensuse-welcome-zh-CN \
locale-opensuse-welcome-zh-TW \
opensuse-welcome-lang \
opensuse-welcome-lang-all"

RDEPENDS:${PN} += "opensuse-welcome"

inherit rpm
