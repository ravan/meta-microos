SUMMARY = "Translations for package kdevelop-plugin-php"
DESCRIPTION = "Provides translations to the package kdevelop-plugin-php"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdevelop-plugin-php-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "996c91e95e22a9ba063bab07f63a2bec57d7029e986157f33deb39b5263fa4689e43ca8f3a26494582110317999960f6a84f0a47cb0ed5ca5120a3af0e4d11e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdevelop-plugin-php-lang \
kdevelop-plugin-php-lang-all \
locale-kdevelop-plugin-php-ar \
locale-kdevelop-plugin-php-bs \
locale-kdevelop-plugin-php-ca \
locale-kdevelop-plugin-php-ca@valencia \
locale-kdevelop-plugin-php-cs \
locale-kdevelop-plugin-php-da \
locale-kdevelop-plugin-php-de \
locale-kdevelop-plugin-php-el \
locale-kdevelop-plugin-php-en-GB \
locale-kdevelop-plugin-php-eo \
locale-kdevelop-plugin-php-es \
locale-kdevelop-plugin-php-et \
locale-kdevelop-plugin-php-eu \
locale-kdevelop-plugin-php-fi \
locale-kdevelop-plugin-php-fr \
locale-kdevelop-plugin-php-ga \
locale-kdevelop-plugin-php-gl \
locale-kdevelop-plugin-php-he \
locale-kdevelop-plugin-php-hi \
locale-kdevelop-plugin-php-hr \
locale-kdevelop-plugin-php-hu \
locale-kdevelop-plugin-php-ia \
locale-kdevelop-plugin-php-it \
locale-kdevelop-plugin-php-ja \
locale-kdevelop-plugin-php-ka \
locale-kdevelop-plugin-php-kk \
locale-kdevelop-plugin-php-ko \
locale-kdevelop-plugin-php-lt \
locale-kdevelop-plugin-php-mr \
locale-kdevelop-plugin-php-nb \
locale-kdevelop-plugin-php-nds \
locale-kdevelop-plugin-php-nl \
locale-kdevelop-plugin-php-nn \
locale-kdevelop-plugin-php-pl \
locale-kdevelop-plugin-php-pt \
locale-kdevelop-plugin-php-pt-BR \
locale-kdevelop-plugin-php-ro \
locale-kdevelop-plugin-php-ru \
locale-kdevelop-plugin-php-sk \
locale-kdevelop-plugin-php-sl \
locale-kdevelop-plugin-php-sv \
locale-kdevelop-plugin-php-th \
locale-kdevelop-plugin-php-tr \
locale-kdevelop-plugin-php-ug \
locale-kdevelop-plugin-php-uk \
locale-kdevelop-plugin-php-zh-CN \
locale-kdevelop-plugin-php-zh-TW"

RDEPENDS:${PN} += "kdevelop-plugin-php"

inherit rpm
