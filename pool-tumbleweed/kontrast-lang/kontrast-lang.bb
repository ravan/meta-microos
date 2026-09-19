SUMMARY = "Translations for package kontrast"
DESCRIPTION = "Provides translations for the 'kontrast' package."
LICENSE = "CC0-1.0 & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kontrast-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "93235cc31812bdcd942712f0c85c41c2f4542fd66efba443fdd0e3c5a33cf8c62a7057409ddf8012a718351d0ba30eea163a8391a4d524d88e48cafa98bd1378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kontrast-lang \
kontrast-lang-all \
locale-kontrast-ar \
locale-kontrast-ast \
locale-kontrast-ca \
locale-kontrast-ca@valencia \
locale-kontrast-cs \
locale-kontrast-da \
locale-kontrast-de \
locale-kontrast-el \
locale-kontrast-en-GB \
locale-kontrast-eo \
locale-kontrast-es \
locale-kontrast-eu \
locale-kontrast-fi \
locale-kontrast-fr \
locale-kontrast-ga \
locale-kontrast-gl \
locale-kontrast-he \
locale-kontrast-hi \
locale-kontrast-ia \
locale-kontrast-it \
locale-kontrast-ja \
locale-kontrast-ka \
locale-kontrast-ko \
locale-kontrast-lt \
locale-kontrast-lv \
locale-kontrast-nl \
locale-kontrast-nn \
locale-kontrast-pa \
locale-kontrast-pl \
locale-kontrast-pt \
locale-kontrast-pt-BR \
locale-kontrast-ro \
locale-kontrast-ru \
locale-kontrast-sk \
locale-kontrast-sl \
locale-kontrast-sv \
locale-kontrast-tr \
locale-kontrast-ug \
locale-kontrast-uk \
locale-kontrast-zh-CN \
locale-kontrast-zh-TW"

RDEPENDS:${PN} += "kontrast"

inherit rpm
