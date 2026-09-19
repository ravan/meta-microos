SUMMARY = "Translations for package tuner"
DESCRIPTION = "Provides translations for the 'tuner' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "tuner-lang-2.1.0-1.3.noarch.rpm"
RPM_HASH = "20b0c9be57a42de48bddb833a54dab8e8fd7467f6e0638883ea925ce248147ddacf4187f74e53184d07ac0c2b536bcecff4473b3dd310da7e1c6a1d83f192d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tuner-ar \
locale-tuner-bg \
locale-tuner-cs \
locale-tuner-da \
locale-tuner-de \
locale-tuner-es \
locale-tuner-et \
locale-tuner-fa \
locale-tuner-fr \
locale-tuner-hu \
locale-tuner-id \
locale-tuner-is \
locale-tuner-it \
locale-tuner-ja \
locale-tuner-ko \
locale-tuner-lt \
locale-tuner-lv \
locale-tuner-ms \
locale-tuner-nb-NO \
locale-tuner-nl \
locale-tuner-pt-BR \
locale-tuner-ro \
locale-tuner-ru \
locale-tuner-sk \
locale-tuner-sl \
locale-tuner-sr \
locale-tuner-ta \
locale-tuner-th \
locale-tuner-tr \
locale-tuner-uk \
locale-tuner-vi \
locale-tuner-zh-Hant \
tuner-lang \
tuner-lang-all"

RDEPENDS:${PN} += "tuner"

inherit rpm
