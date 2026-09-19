SUMMARY = "Translations for package angelfish"
DESCRIPTION = "Provides translations for the 'angelfish' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "angelfish-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "e090fd82368467cc5011e14de8f27c6e5388a31519caf98dd69f9f32eccf8352bece3db97a604e8f234dfe141fb1d7208dc032ed084d644445802da53d596f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "angelfish-lang \
angelfish-lang-all \
locale-angelfish-ar \
locale-angelfish-ast \
locale-angelfish-az \
locale-angelfish-ca \
locale-angelfish-ca@valencia \
locale-angelfish-cs \
locale-angelfish-da \
locale-angelfish-de \
locale-angelfish-el \
locale-angelfish-en-GB \
locale-angelfish-eo \
locale-angelfish-es \
locale-angelfish-et \
locale-angelfish-eu \
locale-angelfish-fi \
locale-angelfish-fr \
locale-angelfish-ga \
locale-angelfish-gl \
locale-angelfish-he \
locale-angelfish-hi \
locale-angelfish-hu \
locale-angelfish-ia \
locale-angelfish-id \
locale-angelfish-it \
locale-angelfish-ja \
locale-angelfish-ka \
locale-angelfish-ko \
locale-angelfish-lt \
locale-angelfish-lv \
locale-angelfish-nl \
locale-angelfish-nn \
locale-angelfish-pa \
locale-angelfish-pl \
locale-angelfish-pt \
locale-angelfish-pt-BR \
locale-angelfish-ru \
locale-angelfish-sk \
locale-angelfish-sl \
locale-angelfish-sv \
locale-angelfish-ta \
locale-angelfish-tr \
locale-angelfish-ug \
locale-angelfish-uk \
locale-angelfish-zh-CN \
locale-angelfish-zh-TW"

RDEPENDS:${PN} += "angelfish"

inherit rpm
