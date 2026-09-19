SUMMARY = "Translations for package bluedevil6"
DESCRIPTION = "Provides translations for the 'bluedevil6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "bluedevil6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "e46ad2ee7e456ee304041425d14f38998f142a45f498755a563b2dbe19220bcd7144ae46a306ff82eb2b26295cdeec939f009ec6e4d09d6f7fdc510c176abe15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluedevil6-lang \
bluedevil6-lang-all \
locale-bluedevil6-ar \
locale-bluedevil6-ast \
locale-bluedevil6-az \
locale-bluedevil6-bg \
locale-bluedevil6-bs \
locale-bluedevil6-ca \
locale-bluedevil6-ca@valencia \
locale-bluedevil6-cs \
locale-bluedevil6-da \
locale-bluedevil6-de \
locale-bluedevil6-el \
locale-bluedevil6-en-GB \
locale-bluedevil6-eo \
locale-bluedevil6-es \
locale-bluedevil6-et \
locale-bluedevil6-eu \
locale-bluedevil6-fi \
locale-bluedevil6-fr \
locale-bluedevil6-ga \
locale-bluedevil6-gl \
locale-bluedevil6-he \
locale-bluedevil6-hi \
locale-bluedevil6-hu \
locale-bluedevil6-ia \
locale-bluedevil6-id \
locale-bluedevil6-is \
locale-bluedevil6-it \
locale-bluedevil6-ja \
locale-bluedevil6-ka \
locale-bluedevil6-ko \
locale-bluedevil6-lt \
locale-bluedevil6-lv \
locale-bluedevil6-ml \
locale-bluedevil6-nb \
locale-bluedevil6-nl \
locale-bluedevil6-nn \
locale-bluedevil6-pa \
locale-bluedevil6-pl \
locale-bluedevil6-pt \
locale-bluedevil6-pt-BR \
locale-bluedevil6-ro \
locale-bluedevil6-ru \
locale-bluedevil6-sk \
locale-bluedevil6-sl \
locale-bluedevil6-sr \
locale-bluedevil6-sr@ijekavian \
locale-bluedevil6-sr@ijekavianlatin \
locale-bluedevil6-sr@latin \
locale-bluedevil6-sv \
locale-bluedevil6-ta \
locale-bluedevil6-th \
locale-bluedevil6-tr \
locale-bluedevil6-uk \
locale-bluedevil6-zh-CN \
locale-bluedevil6-zh-TW"

RDEPENDS:${PN} += "bluedevil6"

inherit rpm
