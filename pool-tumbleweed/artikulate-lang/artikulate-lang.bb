SUMMARY = "Translations for package artikulate"
DESCRIPTION = "Provides translations for the 'artikulate' package."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "artikulate-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "1b996dcf5b5751e9bbd96e4d71df158bc081f34e92b453ecdbf68d6de34016be0b127ce66d0a2f8a63c18eadfbecdf0fad009aa1227056f0b5af137a253f81a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "artikulate-lang \
artikulate-lang-all \
locale-artikulate-ar \
locale-artikulate-az \
locale-artikulate-bs \
locale-artikulate-ca \
locale-artikulate-ca@valencia \
locale-artikulate-cs \
locale-artikulate-da \
locale-artikulate-de \
locale-artikulate-el \
locale-artikulate-en-GB \
locale-artikulate-eo \
locale-artikulate-es \
locale-artikulate-et \
locale-artikulate-eu \
locale-artikulate-fi \
locale-artikulate-fr \
locale-artikulate-ga \
locale-artikulate-gl \
locale-artikulate-he \
locale-artikulate-hi \
locale-artikulate-hu \
locale-artikulate-ia \
locale-artikulate-it \
locale-artikulate-ja \
locale-artikulate-ka \
locale-artikulate-ko \
locale-artikulate-lt \
locale-artikulate-lv \
locale-artikulate-ml \
locale-artikulate-mr \
locale-artikulate-nds \
locale-artikulate-nl \
locale-artikulate-nn \
locale-artikulate-pl \
locale-artikulate-pt \
locale-artikulate-pt-BR \
locale-artikulate-ro \
locale-artikulate-ru \
locale-artikulate-sk \
locale-artikulate-sl \
locale-artikulate-sv \
locale-artikulate-tr \
locale-artikulate-ug \
locale-artikulate-uk \
locale-artikulate-zh-CN \
locale-artikulate-zh-TW"

RDEPENDS:${PN} += "artikulate"

inherit rpm
