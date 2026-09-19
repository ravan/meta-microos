SUMMARY = "Translations for package pantheon-calendar"
DESCRIPTION = "Provides translations for the 'pantheon-calendar' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "pantheon-calendar-lang-8.0.2-1.1.noarch.rpm"
RPM_HASH = "29b11efd98fe4e96f77b91c47c96eed906ef56900d86a73ccbc46bda13817fd11806f210c0bdf60df2662d1c535b087e53af26dc5d9a29a1d7895526cbe8c717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-calendar-af \
locale-pantheon-calendar-ar \
locale-pantheon-calendar-az \
locale-pantheon-calendar-be \
locale-pantheon-calendar-bg \
locale-pantheon-calendar-bn \
locale-pantheon-calendar-bs \
locale-pantheon-calendar-ca \
locale-pantheon-calendar-cs \
locale-pantheon-calendar-da \
locale-pantheon-calendar-de \
locale-pantheon-calendar-el \
locale-pantheon-calendar-en-AU \
locale-pantheon-calendar-en-CA \
locale-pantheon-calendar-en-GB \
locale-pantheon-calendar-eo \
locale-pantheon-calendar-es \
locale-pantheon-calendar-et \
locale-pantheon-calendar-eu \
locale-pantheon-calendar-fa \
locale-pantheon-calendar-fi \
locale-pantheon-calendar-fr \
locale-pantheon-calendar-fr-CA \
locale-pantheon-calendar-ga \
locale-pantheon-calendar-gl \
locale-pantheon-calendar-he \
locale-pantheon-calendar-hi \
locale-pantheon-calendar-hr \
locale-pantheon-calendar-hu \
locale-pantheon-calendar-id \
locale-pantheon-calendar-is \
locale-pantheon-calendar-it \
locale-pantheon-calendar-ja \
locale-pantheon-calendar-ka \
locale-pantheon-calendar-kn \
locale-pantheon-calendar-ko \
locale-pantheon-calendar-lt \
locale-pantheon-calendar-lv \
locale-pantheon-calendar-mk \
locale-pantheon-calendar-mr \
locale-pantheon-calendar-ms \
locale-pantheon-calendar-nb \
locale-pantheon-calendar-nb-NO \
locale-pantheon-calendar-nl \
locale-pantheon-calendar-nn \
locale-pantheon-calendar-oc \
locale-pantheon-calendar-pa \
locale-pantheon-calendar-pl \
locale-pantheon-calendar-pt \
locale-pantheon-calendar-pt-BR \
locale-pantheon-calendar-ro \
locale-pantheon-calendar-ru \
locale-pantheon-calendar-si \
locale-pantheon-calendar-sk \
locale-pantheon-calendar-sl \
locale-pantheon-calendar-sq \
locale-pantheon-calendar-sr \
locale-pantheon-calendar-sv \
locale-pantheon-calendar-ta \
locale-pantheon-calendar-te \
locale-pantheon-calendar-th \
locale-pantheon-calendar-tr \
locale-pantheon-calendar-ug \
locale-pantheon-calendar-uk \
locale-pantheon-calendar-vi \
locale-pantheon-calendar-zh \
locale-pantheon-calendar-zh-CN \
locale-pantheon-calendar-zh-Hant \
locale-pantheon-calendar-zh-TW \
pantheon-calendar-lang \
pantheon-calendar-lang-all"

RDEPENDS:${PN} += "pantheon-calendar"

inherit rpm
