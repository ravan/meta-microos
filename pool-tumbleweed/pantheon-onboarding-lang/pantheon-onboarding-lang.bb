SUMMARY = "Translations for package pantheon-onboarding"
DESCRIPTION = "Provides translations for the 'pantheon-onboarding' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-onboarding-lang-8.1.0-1.3.noarch.rpm"
RPM_HASH = "b10ea91852cc402cd149c547ce427661939e4cc8f92fb3c1bcaf76277038e4c7d4a1c8794f60f45cd69b561c84cd0443dc13c9770c05024a0d898ed6f4a96f2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-onboarding-af \
locale-pantheon-onboarding-ar \
locale-pantheon-onboarding-az \
locale-pantheon-onboarding-be \
locale-pantheon-onboarding-bg \
locale-pantheon-onboarding-bn \
locale-pantheon-onboarding-bs \
locale-pantheon-onboarding-ca \
locale-pantheon-onboarding-cs \
locale-pantheon-onboarding-da \
locale-pantheon-onboarding-de \
locale-pantheon-onboarding-el \
locale-pantheon-onboarding-en-AU \
locale-pantheon-onboarding-en-CA \
locale-pantheon-onboarding-en-GB \
locale-pantheon-onboarding-eo \
locale-pantheon-onboarding-es \
locale-pantheon-onboarding-et \
locale-pantheon-onboarding-eu \
locale-pantheon-onboarding-fa \
locale-pantheon-onboarding-fi \
locale-pantheon-onboarding-fr \
locale-pantheon-onboarding-fr-CA \
locale-pantheon-onboarding-ga \
locale-pantheon-onboarding-gl \
locale-pantheon-onboarding-he \
locale-pantheon-onboarding-hi \
locale-pantheon-onboarding-hr \
locale-pantheon-onboarding-hu \
locale-pantheon-onboarding-ia \
locale-pantheon-onboarding-id \
locale-pantheon-onboarding-is \
locale-pantheon-onboarding-it \
locale-pantheon-onboarding-ja \
locale-pantheon-onboarding-ka \
locale-pantheon-onboarding-kn \
locale-pantheon-onboarding-ko \
locale-pantheon-onboarding-lt \
locale-pantheon-onboarding-lv \
locale-pantheon-onboarding-mk \
locale-pantheon-onboarding-mr \
locale-pantheon-onboarding-ms \
locale-pantheon-onboarding-nb \
locale-pantheon-onboarding-nb-NO \
locale-pantheon-onboarding-nl \
locale-pantheon-onboarding-nn \
locale-pantheon-onboarding-pa \
locale-pantheon-onboarding-pl \
locale-pantheon-onboarding-pt \
locale-pantheon-onboarding-pt-BR \
locale-pantheon-onboarding-ro \
locale-pantheon-onboarding-ru \
locale-pantheon-onboarding-si \
locale-pantheon-onboarding-sk \
locale-pantheon-onboarding-sl \
locale-pantheon-onboarding-sq \
locale-pantheon-onboarding-sr \
locale-pantheon-onboarding-sv \
locale-pantheon-onboarding-ta \
locale-pantheon-onboarding-te \
locale-pantheon-onboarding-th \
locale-pantheon-onboarding-tr \
locale-pantheon-onboarding-ug \
locale-pantheon-onboarding-uk \
locale-pantheon-onboarding-vi \
locale-pantheon-onboarding-wa \
locale-pantheon-onboarding-zh \
locale-pantheon-onboarding-zh-CN \
locale-pantheon-onboarding-zh-TW \
pantheon-onboarding-lang \
pantheon-onboarding-lang-all"

RDEPENDS:${PN} += "pantheon-onboarding"

inherit rpm
