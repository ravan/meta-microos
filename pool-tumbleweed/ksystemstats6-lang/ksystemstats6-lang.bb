SUMMARY = "Translations for package ksystemstats6"
DESCRIPTION = "Provides translations for the 'ksystemstats6' package."
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "ksystemstats6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "d0ff451cd324635964e932ce817e71ef1ea204a30070bf97c766ccd61215f6bcf87154078c86881cd488b20843381dc92609a973d46c12b5059e3fc4888e5520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksystemstats6-lang \
ksystemstats6-lang-all \
locale-ksystemstats6-ar \
locale-ksystemstats6-ast \
locale-ksystemstats6-az \
locale-ksystemstats6-bg \
locale-ksystemstats6-ca \
locale-ksystemstats6-ca@valencia \
locale-ksystemstats6-cs \
locale-ksystemstats6-da \
locale-ksystemstats6-de \
locale-ksystemstats6-en-GB \
locale-ksystemstats6-eo \
locale-ksystemstats6-es \
locale-ksystemstats6-et \
locale-ksystemstats6-eu \
locale-ksystemstats6-fi \
locale-ksystemstats6-fr \
locale-ksystemstats6-ga \
locale-ksystemstats6-gl \
locale-ksystemstats6-he \
locale-ksystemstats6-hi \
locale-ksystemstats6-hu \
locale-ksystemstats6-ia \
locale-ksystemstats6-id \
locale-ksystemstats6-is \
locale-ksystemstats6-it \
locale-ksystemstats6-ja \
locale-ksystemstats6-ka \
locale-ksystemstats6-ko \
locale-ksystemstats6-lt \
locale-ksystemstats6-nl \
locale-ksystemstats6-nn \
locale-ksystemstats6-pa \
locale-ksystemstats6-pl \
locale-ksystemstats6-pt \
locale-ksystemstats6-pt-BR \
locale-ksystemstats6-ro \
locale-ksystemstats6-ru \
locale-ksystemstats6-sk \
locale-ksystemstats6-sl \
locale-ksystemstats6-sv \
locale-ksystemstats6-ta \
locale-ksystemstats6-tr \
locale-ksystemstats6-uk \
locale-ksystemstats6-vi \
locale-ksystemstats6-zh-CN \
locale-ksystemstats6-zh-TW"

RDEPENDS:${PN} += "ksystemstats6"

inherit rpm
