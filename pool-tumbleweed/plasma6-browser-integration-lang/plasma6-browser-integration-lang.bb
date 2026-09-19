SUMMARY = "Translations for package plasma6-browser-integration"
DESCRIPTION = "Provides translations for the 'plasma6-browser-integration' package."
LICENSE = "GPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-browser-integration-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "e3f24708338067b259c5175fa47327394dbb9f4be1c2462c16cd61f1a9f2146f9a3d2faa7953402e63af38d6fec4d03066755ea41d6ecdf9aeb9dd2e5c8df1f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma6-browser-integration-ar \
locale-plasma6-browser-integration-ast \
locale-plasma6-browser-integration-az \
locale-plasma6-browser-integration-bg \
locale-plasma6-browser-integration-ca \
locale-plasma6-browser-integration-ca@valencia \
locale-plasma6-browser-integration-cs \
locale-plasma6-browser-integration-da \
locale-plasma6-browser-integration-de \
locale-plasma6-browser-integration-el \
locale-plasma6-browser-integration-en-GB \
locale-plasma6-browser-integration-eo \
locale-plasma6-browser-integration-es \
locale-plasma6-browser-integration-et \
locale-plasma6-browser-integration-eu \
locale-plasma6-browser-integration-fi \
locale-plasma6-browser-integration-fr \
locale-plasma6-browser-integration-ga \
locale-plasma6-browser-integration-gl \
locale-plasma6-browser-integration-he \
locale-plasma6-browser-integration-hi \
locale-plasma6-browser-integration-hu \
locale-plasma6-browser-integration-ia \
locale-plasma6-browser-integration-id \
locale-plasma6-browser-integration-is \
locale-plasma6-browser-integration-it \
locale-plasma6-browser-integration-ja \
locale-plasma6-browser-integration-ka \
locale-plasma6-browser-integration-ko \
locale-plasma6-browser-integration-lt \
locale-plasma6-browser-integration-lv \
locale-plasma6-browser-integration-ml \
locale-plasma6-browser-integration-nb \
locale-plasma6-browser-integration-nl \
locale-plasma6-browser-integration-nn \
locale-plasma6-browser-integration-pa \
locale-plasma6-browser-integration-pl \
locale-plasma6-browser-integration-pt \
locale-plasma6-browser-integration-pt-BR \
locale-plasma6-browser-integration-ro \
locale-plasma6-browser-integration-ru \
locale-plasma6-browser-integration-sk \
locale-plasma6-browser-integration-sl \
locale-plasma6-browser-integration-sv \
locale-plasma6-browser-integration-ta \
locale-plasma6-browser-integration-tr \
locale-plasma6-browser-integration-uk \
locale-plasma6-browser-integration-zh-CN \
locale-plasma6-browser-integration-zh-TW \
plasma6-browser-integration-lang \
plasma6-browser-integration-lang-all"

RDEPENDS:${PN} += "plasma6-browser-integration"

inherit rpm
