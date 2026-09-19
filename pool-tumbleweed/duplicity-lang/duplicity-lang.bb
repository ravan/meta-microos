SUMMARY = "Translations for package duplicity"
DESCRIPTION = "Provides translations for the 'duplicity' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.0.2"

RPM_NAME = "duplicity-lang-3.2.0.2-1.1.noarch.rpm"
RPM_HASH = "92ad3b94112717e2402b4c9ce78377988f16a6af145ec842c1c6de7c215d7c5ea66439024eaf4131b7a88593b31af56bc93f04f3f8d712876bddf57026ab5783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "duplicity-lang \
duplicity-lang-all \
locale-duplicity-cs-CZ \
locale-duplicity-de-AT \
locale-duplicity-de-DE \
locale-duplicity-el-GR \
locale-duplicity-en-AU \
locale-duplicity-en-GB \
locale-duplicity-en-US \
locale-duplicity-es-ES \
locale-duplicity-es-MX \
locale-duplicity-es-PR \
locale-duplicity-fi-FI \
locale-duplicity-fr-FR \
locale-duplicity-it-IT \
locale-duplicity-nl-BE \
locale-duplicity-pl-PL \
locale-duplicity-pt-BR \
locale-duplicity-pt-PT \
locale-duplicity-ru-RU \
locale-duplicity-tr-TR \
locale-duplicity-uk-UA \
locale-duplicity-zh-CN \
locale-duplicity-zh-HK \
locale-duplicity-zh-TW"

RDEPENDS:${PN} += "duplicity"

inherit rpm
