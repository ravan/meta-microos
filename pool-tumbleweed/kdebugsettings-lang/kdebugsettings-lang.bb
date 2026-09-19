SUMMARY = "Translations for package kdebugsettings"
DESCRIPTION = "Provides translations for the 'kdebugsettings' package."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdebugsettings-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "59a7de5c192e456d717a470e440eab837c47fdc0c7d71790733faf46cdd2473178c406d57defcb17c2f2e1e01b53ce750f73dfa69b809c7f0f17b8aaea4a27ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdebugsettings-lang \
kdebugsettings-lang-all \
locale-kdebugsettings-ar \
locale-kdebugsettings-ast \
locale-kdebugsettings-az \
locale-kdebugsettings-ca \
locale-kdebugsettings-ca@valencia \
locale-kdebugsettings-cs \
locale-kdebugsettings-da \
locale-kdebugsettings-de \
locale-kdebugsettings-el \
locale-kdebugsettings-en-GB \
locale-kdebugsettings-eo \
locale-kdebugsettings-es \
locale-kdebugsettings-et \
locale-kdebugsettings-eu \
locale-kdebugsettings-fi \
locale-kdebugsettings-fr \
locale-kdebugsettings-ga \
locale-kdebugsettings-gl \
locale-kdebugsettings-he \
locale-kdebugsettings-hi \
locale-kdebugsettings-hu \
locale-kdebugsettings-ia \
locale-kdebugsettings-it \
locale-kdebugsettings-ja \
locale-kdebugsettings-ka \
locale-kdebugsettings-ko \
locale-kdebugsettings-lt \
locale-kdebugsettings-nl \
locale-kdebugsettings-nn \
locale-kdebugsettings-pl \
locale-kdebugsettings-pt \
locale-kdebugsettings-pt-BR \
locale-kdebugsettings-ro \
locale-kdebugsettings-ru \
locale-kdebugsettings-sk \
locale-kdebugsettings-sl \
locale-kdebugsettings-sr \
locale-kdebugsettings-sr@ijekavian \
locale-kdebugsettings-sr@ijekavianlatin \
locale-kdebugsettings-sr@latin \
locale-kdebugsettings-sv \
locale-kdebugsettings-tr \
locale-kdebugsettings-ug \
locale-kdebugsettings-uk \
locale-kdebugsettings-zh-CN \
locale-kdebugsettings-zh-TW"

RDEPENDS:${PN} += "kdebugsettings"

inherit rpm
