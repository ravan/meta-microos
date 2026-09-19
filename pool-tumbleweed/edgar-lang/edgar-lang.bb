SUMMARY = "Translations for package edgar"
DESCRIPTION = "Provides translations for the 'edgar' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "edgar-lang-1.38-1.5.noarch.rpm"
RPM_HASH = "e79df0156db7d105b1d1ebf3afe7bede36f83498380ff2d8d38c7f72f57185eef05de52e09cf670fbfe5199a8e994176bd80ea001f06e60ac1fd1dd42ea98dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edgar-lang \
edgar-lang-all \
locale-edgar-ar \
locale-edgar-cs \
locale-edgar-da \
locale-edgar-de \
locale-edgar-el \
locale-edgar-en-GB \
locale-edgar-en-US \
locale-edgar-eo \
locale-edgar-es \
locale-edgar-fa \
locale-edgar-fr \
locale-edgar-hi \
locale-edgar-id \
locale-edgar-it \
locale-edgar-ja \
locale-edgar-ko \
locale-edgar-lv \
locale-edgar-ms \
locale-edgar-nl \
locale-edgar-pl \
locale-edgar-pt \
locale-edgar-pt-BR \
locale-edgar-ro \
locale-edgar-ru \
locale-edgar-sk \
locale-edgar-sr \
locale-edgar-sv \
locale-edgar-ta \
locale-edgar-tr \
locale-edgar-uk \
locale-edgar-vi \
locale-edgar-zh-CN"

RDEPENDS:${PN} += "edgar"

inherit rpm
