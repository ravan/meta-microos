SUMMARY = "Translations for package udiskie"
DESCRIPTION = "Provides translations for the 'udiskie' package."
LICENSE = "MIT"

PV = "2.6.1"

RPM_NAME = "udiskie-lang-2.6.1-1.2.noarch.rpm"
RPM_HASH = "b2944b7a1860ea09074d64c90d3ac06b18ab9eb5ef2cc7ddd12dfd69ce10b1346e0fe329f94977366f856bd7ee5a83893f9ea65e74a9c82b54e06983bbaf39b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-udiskie-de \
locale-udiskie-en-US \
locale-udiskie-es-ES \
locale-udiskie-it-IT \
locale-udiskie-ru-RU \
locale-udiskie-tr-TR \
locale-udiskie-zh-CN \
udiskie-lang \
udiskie-lang-all"

RDEPENDS:${PN} += "udiskie"

inherit rpm
