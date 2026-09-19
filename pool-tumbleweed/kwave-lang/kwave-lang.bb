SUMMARY = "Translations for package kwave"
DESCRIPTION = "Provides translations for the 'kwave' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kwave-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "cc83029e2b894f367fde4a198f6c7443f9d3e82828c960df5abd27feccfd66fa98a7b6d0a2af71427c58c8de280909249eec4445d82c9c8045579d1f6230be21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwave-lang \
kwave-lang-all \
locale-kwave-ar \
locale-kwave-bs \
locale-kwave-ca \
locale-kwave-ca@valencia \
locale-kwave-cs \
locale-kwave-da \
locale-kwave-de \
locale-kwave-el \
locale-kwave-en-GB \
locale-kwave-eo \
locale-kwave-es \
locale-kwave-et \
locale-kwave-eu \
locale-kwave-fi \
locale-kwave-fr \
locale-kwave-ga \
locale-kwave-gl \
locale-kwave-he \
locale-kwave-hi \
locale-kwave-ia \
locale-kwave-it \
locale-kwave-ja \
locale-kwave-ka \
locale-kwave-ko \
locale-kwave-lt \
locale-kwave-nl \
locale-kwave-pl \
locale-kwave-pt \
locale-kwave-pt-BR \
locale-kwave-ru \
locale-kwave-sk \
locale-kwave-sl \
locale-kwave-sv \
locale-kwave-tr \
locale-kwave-ug \
locale-kwave-uk \
locale-kwave-zh-CN \
locale-kwave-zh-TW"

RDEPENDS:${PN} += "kwave"

inherit rpm
