SUMMARY = "Translations for package libKWeatherCore6"
DESCRIPTION = "Provides translations for the 'libKWeatherCore6' package."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKWeatherCore6-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "4b53fc998213bde3311e3a0d0747d4db57130b41d5087babc7c71b857eb69f7d2020f0867eb604c5703ae5e1b8d8fed9860aac9ffd2dd93ca8934b79bd7d8fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKWeatherCore6-lang \
libKWeatherCore6-lang-all \
locale-libKWeatherCore6-ar \
locale-libKWeatherCore6-ast \
locale-libKWeatherCore6-az \
locale-libKWeatherCore6-bg \
locale-libKWeatherCore6-ca \
locale-libKWeatherCore6-ca@valencia \
locale-libKWeatherCore6-cs \
locale-libKWeatherCore6-de \
locale-libKWeatherCore6-el \
locale-libKWeatherCore6-en-GB \
locale-libKWeatherCore6-eo \
locale-libKWeatherCore6-es \
locale-libKWeatherCore6-eu \
locale-libKWeatherCore6-fi \
locale-libKWeatherCore6-fr \
locale-libKWeatherCore6-ga \
locale-libKWeatherCore6-gl \
locale-libKWeatherCore6-he \
locale-libKWeatherCore6-hi \
locale-libKWeatherCore6-hu \
locale-libKWeatherCore6-ia \
locale-libKWeatherCore6-is \
locale-libKWeatherCore6-it \
locale-libKWeatherCore6-ja \
locale-libKWeatherCore6-ka \
locale-libKWeatherCore6-ko \
locale-libKWeatherCore6-lt \
locale-libKWeatherCore6-lv \
locale-libKWeatherCore6-nb \
locale-libKWeatherCore6-nl \
locale-libKWeatherCore6-nn \
locale-libKWeatherCore6-pa \
locale-libKWeatherCore6-pl \
locale-libKWeatherCore6-pt \
locale-libKWeatherCore6-pt-BR \
locale-libKWeatherCore6-ru \
locale-libKWeatherCore6-sk \
locale-libKWeatherCore6-sl \
locale-libKWeatherCore6-sv \
locale-libKWeatherCore6-tr \
locale-libKWeatherCore6-ug \
locale-libKWeatherCore6-uk \
locale-libKWeatherCore6-zh-CN \
locale-libKWeatherCore6-zh-TW"

RDEPENDS:${PN} += "libKWeatherCore6"

inherit rpm
