SUMMARY = "Translations for package kdeconnect-kde"
DESCRIPTION = "Provides translations for the 'kdeconnect-kde' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdeconnect-kde-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "27d2e5ce11dd8c560072411d6d3feef89e5712c88510b7f4f453c4f8a42fe3e4df7ef54f08b9690e197fa4c800647340368aefef29e4ba122d77e0543dee550b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdeconnect-kde-lang \
kdeconnect-kde-lang-all \
locale-kdeconnect-kde-ar \
locale-kdeconnect-kde-ast \
locale-kdeconnect-kde-az \
locale-kdeconnect-kde-bg \
locale-kdeconnect-kde-bs \
locale-kdeconnect-kde-ca \
locale-kdeconnect-kde-ca@valencia \
locale-kdeconnect-kde-cs \
locale-kdeconnect-kde-da \
locale-kdeconnect-kde-de \
locale-kdeconnect-kde-el \
locale-kdeconnect-kde-en-GB \
locale-kdeconnect-kde-eo \
locale-kdeconnect-kde-es \
locale-kdeconnect-kde-et \
locale-kdeconnect-kde-eu \
locale-kdeconnect-kde-fi \
locale-kdeconnect-kde-fr \
locale-kdeconnect-kde-ga \
locale-kdeconnect-kde-gl \
locale-kdeconnect-kde-he \
locale-kdeconnect-kde-hi \
locale-kdeconnect-kde-hu \
locale-kdeconnect-kde-ia \
locale-kdeconnect-kde-id \
locale-kdeconnect-kde-is \
locale-kdeconnect-kde-it \
locale-kdeconnect-kde-ja \
locale-kdeconnect-kde-ka \
locale-kdeconnect-kde-ko \
locale-kdeconnect-kde-lt \
locale-kdeconnect-kde-lv \
locale-kdeconnect-kde-ml \
locale-kdeconnect-kde-nb \
locale-kdeconnect-kde-nl \
locale-kdeconnect-kde-nn \
locale-kdeconnect-kde-pa \
locale-kdeconnect-kde-pl \
locale-kdeconnect-kde-pt \
locale-kdeconnect-kde-pt-BR \
locale-kdeconnect-kde-ro \
locale-kdeconnect-kde-ru \
locale-kdeconnect-kde-sk \
locale-kdeconnect-kde-sl \
locale-kdeconnect-kde-sr \
locale-kdeconnect-kde-sr@ijekavian \
locale-kdeconnect-kde-sr@ijekavianlatin \
locale-kdeconnect-kde-sr@latin \
locale-kdeconnect-kde-sv \
locale-kdeconnect-kde-ta \
locale-kdeconnect-kde-tr \
locale-kdeconnect-kde-ug \
locale-kdeconnect-kde-uk \
locale-kdeconnect-kde-zh-CN \
locale-kdeconnect-kde-zh-TW"

RDEPENDS:${PN} += "kdeconnect-kde"

inherit rpm
