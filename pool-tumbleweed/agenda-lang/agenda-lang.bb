SUMMARY = "Translations for package agenda"
DESCRIPTION = "Provides translations for the 'agenda' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.1"

RPM_NAME = "agenda-lang-1.2.1-1.5.noarch.rpm"
RPM_HASH = "ec03d1a7502da0b3ff22917e765abe235e652e4659ffc9ebaefccc1e1d457f99df48211c2c31c754eccdfcb4d0dcf8775207879cc3ce3785ce65d639249ba0d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "agenda-lang \
agenda-lang-all \
locale-agenda-af \
locale-agenda-ca \
locale-agenda-da \
locale-agenda-de \
locale-agenda-el \
locale-agenda-en-GB \
locale-agenda-eo \
locale-agenda-es \
locale-agenda-et \
locale-agenda-fi \
locale-agenda-fr \
locale-agenda-fr-CA \
locale-agenda-gl \
locale-agenda-he \
locale-agenda-id \
locale-agenda-it \
locale-agenda-ja \
locale-agenda-ka \
locale-agenda-km \
locale-agenda-ko \
locale-agenda-lt \
locale-agenda-ms \
locale-agenda-nb \
locale-agenda-nl \
locale-agenda-nn \
locale-agenda-oc \
locale-agenda-pl \
locale-agenda-pt \
locale-agenda-pt-BR \
locale-agenda-ru \
locale-agenda-sr \
locale-agenda-sr@latin \
locale-agenda-sv \
locale-agenda-tr \
locale-agenda-ug \
locale-agenda-zh-CN"

RDEPENDS:${PN} += "agenda"

inherit rpm
