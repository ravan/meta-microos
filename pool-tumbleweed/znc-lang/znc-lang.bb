SUMMARY = "Translations for package znc"
DESCRIPTION = "Provides translations for the 'znc' package."
LICENSE = "Apache-2.0"

PV = "1.10.3"

RPM_NAME = "znc-lang-1.10.3-1.1.noarch.rpm"
RPM_HASH = "2d6c81638f6a02170ea0240ce728c7a12962393b2d8b9a967eac07016b0843620ce1826a23ef36d1767293055775f16048bacbcdd9fd36112a0a53d8feeea195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-znc-de-DE \
locale-znc-el-GR \
locale-znc-es-ES \
locale-znc-fr-FR \
locale-znc-it-IT \
locale-znc-pl-PL \
locale-znc-pt-BR \
locale-znc-pt-PT \
locale-znc-ru-RU \
locale-znc-tr-TR \
znc-lang \
znc-lang-all"

RDEPENDS:${PN} += "znc"

inherit rpm
