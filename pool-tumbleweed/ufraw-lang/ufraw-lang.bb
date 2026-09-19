SUMMARY = "Translations for package ufraw"
DESCRIPTION = "Provides translations for the 'ufraw' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.22"

RPM_NAME = "ufraw-lang-0.22-13.8.noarch.rpm"
RPM_HASH = "858a63f44c581f48a9ff0af07618cd76bd854634db4ef178a4fa20ddba357535a04718ad925f5425c5c019db5d5892f7fb49372552321f578e1e9a627edb59de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ufraw-ca \
locale-ufraw-cs \
locale-ufraw-da \
locale-ufraw-de \
locale-ufraw-es \
locale-ufraw-fr \
locale-ufraw-it \
locale-ufraw-ja \
locale-ufraw-ko \
locale-ufraw-nb \
locale-ufraw-nl \
locale-ufraw-pl \
locale-ufraw-pt \
locale-ufraw-ru \
locale-ufraw-sr \
locale-ufraw-sr@latin \
locale-ufraw-sv \
locale-ufraw-zh-CN \
locale-ufraw-zh-TW \
ufraw-lang \
ufraw-lang-all"

RDEPENDS:${PN} += "ufraw"

inherit rpm
