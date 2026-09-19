SUMMARY = "Translations for package alligator"
DESCRIPTION = "Provides translations for the 'alligator' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "alligator-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "eb76b9a2a2cb9448e914c9e640ece5ace7d63056522f1126e731c4ec0991213a587a4a10e16e7f583131158c6b235ef26058101e3bad6fb2428a0a5ce0828061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alligator-lang \
alligator-lang-all \
locale-alligator-ar \
locale-alligator-ast \
locale-alligator-ca \
locale-alligator-ca@valencia \
locale-alligator-cs \
locale-alligator-de \
locale-alligator-en-GB \
locale-alligator-eo \
locale-alligator-es \
locale-alligator-et \
locale-alligator-eu \
locale-alligator-fi \
locale-alligator-fr \
locale-alligator-ga \
locale-alligator-gl \
locale-alligator-he \
locale-alligator-hi \
locale-alligator-hu \
locale-alligator-ia \
locale-alligator-it \
locale-alligator-ja \
locale-alligator-ka \
locale-alligator-ko \
locale-alligator-lt \
locale-alligator-lv \
locale-alligator-nl \
locale-alligator-nn \
locale-alligator-pa \
locale-alligator-pl \
locale-alligator-pt \
locale-alligator-pt-BR \
locale-alligator-ru \
locale-alligator-sk \
locale-alligator-sl \
locale-alligator-sv \
locale-alligator-tr \
locale-alligator-ug \
locale-alligator-uk \
locale-alligator-zh-CN \
locale-alligator-zh-TW"

RDEPENDS:${PN} += "alligator"

inherit rpm
