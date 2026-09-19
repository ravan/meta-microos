SUMMARY = "Translations for package picard"
DESCRIPTION = "Provides translations for the 'picard' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.3"

RPM_NAME = "picard-lang-2.13.3-1.7.noarch.rpm"
RPM_HASH = "c04e6cccac33960f26bd173b07029fc7168461b9b28dde91f448f9ad1010b0765ea7a162f01fa163f3baf4143f54183f96f90bdc186ce69fb89205d9212d65e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-picard-ar \
locale-picard-ast \
locale-picard-bg \
locale-picard-bn \
locale-picard-ca \
locale-picard-cs \
locale-picard-cy \
locale-picard-da \
locale-picard-de \
locale-picard-el \
locale-picard-en-AU \
locale-picard-en-CA \
locale-picard-en-GB \
locale-picard-eo \
locale-picard-es \
locale-picard-et \
locale-picard-fa \
locale-picard-fi \
locale-picard-fr \
locale-picard-fr-CA \
locale-picard-gl \
locale-picard-he \
locale-picard-hi \
locale-picard-hr \
locale-picard-hu \
locale-picard-id \
locale-picard-is \
locale-picard-it \
locale-picard-ja \
locale-picard-kn \
locale-picard-ko \
locale-picard-lt \
locale-picard-mr \
locale-picard-ms \
locale-picard-nb \
locale-picard-nb-NO \
locale-picard-ne \
locale-picard-nl \
locale-picard-nl-BE \
locale-picard-oc \
locale-picard-pa \
locale-picard-pl \
locale-picard-pt \
locale-picard-pt-BR \
locale-picard-pt-PT \
locale-picard-ro \
locale-picard-ru \
locale-picard-sk \
locale-picard-sl \
locale-picard-sq \
locale-picard-sr \
locale-picard-sv \
locale-picard-te \
locale-picard-tr \
locale-picard-uk \
locale-picard-vi \
locale-picard-zh \
locale-picard-zh-CN \
locale-picard-zh-Hans \
locale-picard-zh-Hant \
locale-picard-zh-TW \
picard-lang \
picard-lang-all"

RDEPENDS:${PN} += "picard"

inherit rpm
