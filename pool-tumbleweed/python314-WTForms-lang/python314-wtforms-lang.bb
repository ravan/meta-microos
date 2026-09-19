SUMMARY = "Translations for builtin WTForms messages"
DESCRIPTION = "Translations for builtin WTForms messages. \
 \
WTForms is a forms validation and rendering library for Python web development."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python314-WTForms-lang-3.2.1-1.5.noarch.rpm"
RPM_HASH = "163e0a10ec585667042abf941a43f84b1237ce33be16bfda39ebe6476d61640e7cfe68b5502cfbbc2f2d5e2da883ed0e2b757967ea27e7aed6e250680d7053ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-python314-WTForms-ar \
locale-python314-WTForms-bg \
locale-python314-WTForms-ca \
locale-python314-WTForms-cs-CZ \
locale-python314-WTForms-cy \
locale-python314-WTForms-de \
locale-python314-WTForms-de-CH \
locale-python314-WTForms-el \
locale-python314-WTForms-en \
locale-python314-WTForms-es \
locale-python314-WTForms-et \
locale-python314-WTForms-fa \
locale-python314-WTForms-fi \
locale-python314-WTForms-fr \
locale-python314-WTForms-he \
locale-python314-WTForms-hu \
locale-python314-WTForms-it \
locale-python314-WTForms-ja \
locale-python314-WTForms-kk \
locale-python314-WTForms-ko \
locale-python314-WTForms-nb \
locale-python314-WTForms-nl \
locale-python314-WTForms-pl \
locale-python314-WTForms-pt \
locale-python314-WTForms-ro \
locale-python314-WTForms-ru \
locale-python314-WTForms-sk \
locale-python314-WTForms-sv \
locale-python314-WTForms-tr \
locale-python314-WTForms-uk \
locale-python314-WTForms-zh \
locale-python314-WTForms-zh-TW \
python314-WTForms-lang"

RDEPENDS:${PN} += "python314-WTForms"

inherit rpm
