SUMMARY = "Translations for package baloo-widgets"
DESCRIPTION = "Provides translations for the 'baloo-widgets' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "baloo-widgets-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "92fa3a8fc91b8da6b9f218011d610e220f0976bc2f5030b19fb28c79a32f7e2646b4f8649da8d72c24a4a278cd0635054abd12cf27f1717c99833a2497a8b144"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "baloo-widgets-lang \
baloo-widgets-lang-all \
locale-baloo-widgets-ar \
locale-baloo-widgets-az \
locale-baloo-widgets-bg \
locale-baloo-widgets-bs \
locale-baloo-widgets-ca \
locale-baloo-widgets-ca@valencia \
locale-baloo-widgets-cs \
locale-baloo-widgets-da \
locale-baloo-widgets-de \
locale-baloo-widgets-el \
locale-baloo-widgets-en-GB \
locale-baloo-widgets-eo \
locale-baloo-widgets-es \
locale-baloo-widgets-et \
locale-baloo-widgets-eu \
locale-baloo-widgets-fi \
locale-baloo-widgets-fr \
locale-baloo-widgets-ga \
locale-baloo-widgets-gl \
locale-baloo-widgets-he \
locale-baloo-widgets-hi \
locale-baloo-widgets-hu \
locale-baloo-widgets-ia \
locale-baloo-widgets-id \
locale-baloo-widgets-it \
locale-baloo-widgets-ja \
locale-baloo-widgets-ka \
locale-baloo-widgets-kk \
locale-baloo-widgets-ko \
locale-baloo-widgets-lt \
locale-baloo-widgets-lv \
locale-baloo-widgets-ml \
locale-baloo-widgets-mr \
locale-baloo-widgets-nb \
locale-baloo-widgets-nds \
locale-baloo-widgets-nl \
locale-baloo-widgets-nn \
locale-baloo-widgets-pa \
locale-baloo-widgets-pl \
locale-baloo-widgets-pt \
locale-baloo-widgets-pt-BR \
locale-baloo-widgets-ro \
locale-baloo-widgets-ru \
locale-baloo-widgets-sk \
locale-baloo-widgets-sl \
locale-baloo-widgets-sr \
locale-baloo-widgets-sr@ijekavian \
locale-baloo-widgets-sr@ijekavianlatin \
locale-baloo-widgets-sr@latin \
locale-baloo-widgets-sv \
locale-baloo-widgets-ta \
locale-baloo-widgets-tr \
locale-baloo-widgets-ug \
locale-baloo-widgets-uk \
locale-baloo-widgets-zh-CN \
locale-baloo-widgets-zh-TW"

RDEPENDS:${PN} += "baloo-widgets"

inherit rpm
