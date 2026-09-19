SUMMARY = "Translations for package alkimia"
DESCRIPTION = "Provides translations for the 'alkimia' package."
LICENSE = "LGPL-2.1-or-later"

PV = "8.2.1"

RPM_NAME = "alkimia-lang-8.2.1-1.6.noarch.rpm"
RPM_HASH = "25533484c1738bed228cc27f11f82f69ab6fde405c84c01c89ac4ac94ccab7a1da9fcbc4ca639066dfba2bf3be06bb2e2fcb543718f1d912f742c62510d01c89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alkimia-lang \
alkimia-lang-all \
locale-alkimia-ca \
locale-alkimia-ca@valencia \
locale-alkimia-cs \
locale-alkimia-de \
locale-alkimia-el \
locale-alkimia-en-GB \
locale-alkimia-eo \
locale-alkimia-es \
locale-alkimia-et \
locale-alkimia-fi \
locale-alkimia-fr \
locale-alkimia-gl \
locale-alkimia-hu \
locale-alkimia-ia \
locale-alkimia-it \
locale-alkimia-ja \
locale-alkimia-ka \
locale-alkimia-ko \
locale-alkimia-nb \
locale-alkimia-nl \
locale-alkimia-nn \
locale-alkimia-pl \
locale-alkimia-pt \
locale-alkimia-pt-BR \
locale-alkimia-ru \
locale-alkimia-sk \
locale-alkimia-sl \
locale-alkimia-sv \
locale-alkimia-tr \
locale-alkimia-uk \
locale-alkimia-zh-CN \
locale-alkimia-zh-TW"

RDEPENDS:${PN} += "alkimia"

inherit rpm
