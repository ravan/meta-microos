SUMMARY = "Translations for package audiotube"
DESCRIPTION = "Provides translations for the 'audiotube' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "audiotube-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "ad935f82c0df37edc8aec56df32e87c5d452ef1f9b2556f8b2e1cc2adfc2918d5e7bcd40d55df911f805fadd105890d737c366abbea33aa268de23dd4f63a49a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audiotube-lang \
audiotube-lang-all \
locale-audiotube-ar \
locale-audiotube-ast \
locale-audiotube-az \
locale-audiotube-ca \
locale-audiotube-ca@valencia \
locale-audiotube-cs \
locale-audiotube-de \
locale-audiotube-en-GB \
locale-audiotube-eo \
locale-audiotube-es \
locale-audiotube-eu \
locale-audiotube-fi \
locale-audiotube-fr \
locale-audiotube-ga \
locale-audiotube-gl \
locale-audiotube-he \
locale-audiotube-hi \
locale-audiotube-hu \
locale-audiotube-ia \
locale-audiotube-id \
locale-audiotube-is \
locale-audiotube-it \
locale-audiotube-ja \
locale-audiotube-ka \
locale-audiotube-ko \
locale-audiotube-lt \
locale-audiotube-lv \
locale-audiotube-nl \
locale-audiotube-nn \
locale-audiotube-pa \
locale-audiotube-pl \
locale-audiotube-pt \
locale-audiotube-pt-BR \
locale-audiotube-ru \
locale-audiotube-sk \
locale-audiotube-sl \
locale-audiotube-sv \
locale-audiotube-tr \
locale-audiotube-ug \
locale-audiotube-uk \
locale-audiotube-zh-CN \
locale-audiotube-zh-TW"

RDEPENDS:${PN} += "audiotube"

inherit rpm
