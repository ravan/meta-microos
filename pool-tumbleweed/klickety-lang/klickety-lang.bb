SUMMARY = "Translations for package klickety"
DESCRIPTION = "Provides translations for the 'klickety' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "klickety-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "a1f2e539241159642cd1f037f0d21606f4159fbb175d4d47f235f2b41c52b009dbf7df2e6324fa8cdb48d88d610b4dc4a1032765201573cac71d209088f10ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klickety-lang \
klickety-lang-all \
locale-klickety-ar \
locale-klickety-ast \
locale-klickety-bs \
locale-klickety-ca \
locale-klickety-ca@valencia \
locale-klickety-cs \
locale-klickety-da \
locale-klickety-de \
locale-klickety-el \
locale-klickety-en-GB \
locale-klickety-eo \
locale-klickety-es \
locale-klickety-et \
locale-klickety-eu \
locale-klickety-fi \
locale-klickety-fr \
locale-klickety-ga \
locale-klickety-gl \
locale-klickety-he \
locale-klickety-hi \
locale-klickety-hu \
locale-klickety-ia \
locale-klickety-id \
locale-klickety-is \
locale-klickety-it \
locale-klickety-ja \
locale-klickety-ka \
locale-klickety-kk \
locale-klickety-ko \
locale-klickety-lt \
locale-klickety-lv \
locale-klickety-mai \
locale-klickety-ml \
locale-klickety-mr \
locale-klickety-nb \
locale-klickety-nds \
locale-klickety-nl \
locale-klickety-nn \
locale-klickety-pl \
locale-klickety-pt \
locale-klickety-pt-BR \
locale-klickety-ro \
locale-klickety-ru \
locale-klickety-sk \
locale-klickety-sl \
locale-klickety-sr \
locale-klickety-sr@ijekavian \
locale-klickety-sr@ijekavianlatin \
locale-klickety-sr@latin \
locale-klickety-sv \
locale-klickety-tr \
locale-klickety-ug \
locale-klickety-uk \
locale-klickety-zh-CN \
locale-klickety-zh-TW"

RDEPENDS:${PN} += "klickety"

inherit rpm
