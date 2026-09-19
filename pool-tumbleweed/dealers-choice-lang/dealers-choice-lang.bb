SUMMARY = "Translations for package dealers-choice"
DESCRIPTION = "Provides translations for the 'dealers-choice' package."
LICENSE = "MIT"

PV = "0.0.15"

RPM_NAME = "dealers-choice-lang-0.0.15-1.2.noarch.rpm"
RPM_HASH = "8ebfc9cb1d343c6aaa7b463ff925e18c92ae709eb210c5d1f08853b80567391cf064666692ea4e8cce4ded747de96793a5f890848f29e7aa21ed19cd38cf0ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dealers-choice-lang \
dealers-choice-lang-all \
locale-dealers-choice-de \
locale-dealers-choice-es \
locale-dealers-choice-es-CO \
locale-dealers-choice-es-MX \
locale-dealers-choice-fr \
locale-dealers-choice-it \
locale-dealers-choice-ru \
locale-dealers-choice-sv \
locale-dealers-choice-uk"

RDEPENDS:${PN} += "dealers-choice"

inherit rpm
