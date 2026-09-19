SUMMARY = "Translations for package ktrip"
DESCRIPTION = "Provides translations for the 'ktrip' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ktrip-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "c8183b36c198068d03360d576f57ce7c80ba01c053b8f812bb33fdfa97e6289e9c8e45a7472b8ce679c2c355f1170727850f9f3ecc2e898b24b662551df45a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktrip-lang \
ktrip-lang-all \
locale-ktrip-ar \
locale-ktrip-ast \
locale-ktrip-ca \
locale-ktrip-ca@valencia \
locale-ktrip-cs \
locale-ktrip-de \
locale-ktrip-en-GB \
locale-ktrip-eo \
locale-ktrip-es \
locale-ktrip-et \
locale-ktrip-eu \
locale-ktrip-fi \
locale-ktrip-fr \
locale-ktrip-ga \
locale-ktrip-gl \
locale-ktrip-he \
locale-ktrip-hi \
locale-ktrip-hu \
locale-ktrip-ia \
locale-ktrip-it \
locale-ktrip-ja \
locale-ktrip-ka \
locale-ktrip-ko \
locale-ktrip-lt \
locale-ktrip-lv \
locale-ktrip-nl \
locale-ktrip-nn \
locale-ktrip-pl \
locale-ktrip-pt \
locale-ktrip-pt-BR \
locale-ktrip-ru \
locale-ktrip-sk \
locale-ktrip-sl \
locale-ktrip-sv \
locale-ktrip-tr \
locale-ktrip-ug \
locale-ktrip-uk \
locale-ktrip-zh-CN \
locale-ktrip-zh-TW"

RDEPENDS:${PN} += "ktrip"

inherit rpm
