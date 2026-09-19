SUMMARY = "Translations for package marknote"
DESCRIPTION = "Provides translations for the 'marknote' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "marknote-lang-1.6.0-2.1.noarch.rpm"
RPM_HASH = "1b5f7956e2176b3913980ee100f9a95f36a86ec1f56b8343ea0f32af4e7edea0c40340522ea3b1cb2aa15c95fc7bacb5f3ea50d84378dc991e5ea7ead5b65b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-marknote-ar \
locale-marknote-ast \
locale-marknote-ca \
locale-marknote-ca@valencia \
locale-marknote-cs \
locale-marknote-da \
locale-marknote-de \
locale-marknote-en-GB \
locale-marknote-eo \
locale-marknote-es \
locale-marknote-eu \
locale-marknote-fi \
locale-marknote-fr \
locale-marknote-ga \
locale-marknote-gl \
locale-marknote-he \
locale-marknote-hi \
locale-marknote-ia \
locale-marknote-is \
locale-marknote-it \
locale-marknote-ja \
locale-marknote-ka \
locale-marknote-ko \
locale-marknote-lt \
locale-marknote-lv \
locale-marknote-nl \
locale-marknote-nn \
locale-marknote-pa \
locale-marknote-pl \
locale-marknote-pt-BR \
locale-marknote-ru \
locale-marknote-sk \
locale-marknote-sl \
locale-marknote-sv \
locale-marknote-tr \
locale-marknote-uk \
locale-marknote-zh-CN \
locale-marknote-zh-TW \
marknote-lang \
marknote-lang-all"

RDEPENDS:${PN} += "marknote"

inherit rpm
