SUMMARY = "Translations for package compiz"
DESCRIPTION = "Provides translations for the 'compiz' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "compiz-lang-0.8.18-4.5.noarch.rpm"
RPM_HASH = "7bbad47b6c9df93f2bc63b1358f436377428824bf3813dd6416846e4693b877209142c2b78a699d910910aca93939a04af779e83d05ebeaccfb6e95f78815a1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-lang \
compiz-lang-all \
locale-compiz-ar \
locale-compiz-bg \
locale-compiz-bn \
locale-compiz-bn-IN \
locale-compiz-ca \
locale-compiz-cs \
locale-compiz-da \
locale-compiz-de \
locale-compiz-el \
locale-compiz-en-GB \
locale-compiz-es \
locale-compiz-et \
locale-compiz-eu \
locale-compiz-fi \
locale-compiz-fr \
locale-compiz-gl \
locale-compiz-gu \
locale-compiz-he \
locale-compiz-hi \
locale-compiz-hr \
locale-compiz-hu \
locale-compiz-it \
locale-compiz-ja \
locale-compiz-ko \
locale-compiz-nb \
locale-compiz-nl \
locale-compiz-or \
locale-compiz-pa \
locale-compiz-pl \
locale-compiz-pt \
locale-compiz-pt-BR \
locale-compiz-ro \
locale-compiz-ru \
locale-compiz-sk \
locale-compiz-sl \
locale-compiz-sr \
locale-compiz-sv \
locale-compiz-ta \
locale-compiz-tr \
locale-compiz-uk \
locale-compiz-zh-CN \
locale-compiz-zh-TW"

RDEPENDS:${PN} += "compiz"

inherit rpm
