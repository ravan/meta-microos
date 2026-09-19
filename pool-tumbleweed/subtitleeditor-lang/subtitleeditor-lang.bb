SUMMARY = "Translations for package subtitleeditor"
DESCRIPTION = "Provides translations for the 'subtitleeditor' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.56.2"

RPM_NAME = "subtitleeditor-lang-0.56.2-1.4.noarch.rpm"
RPM_HASH = "04523b6a47ce1b52be32da742cdb2546f539699da780b736c9320704e805f92f37bd885dfb5f6f575070ba6b591b33cf8bbe6e217319701d1e6c9894de39f52c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-subtitleeditor-bg \
locale-subtitleeditor-ca \
locale-subtitleeditor-cs \
locale-subtitleeditor-da \
locale-subtitleeditor-de \
locale-subtitleeditor-el \
locale-subtitleeditor-en-GB \
locale-subtitleeditor-eo \
locale-subtitleeditor-es \
locale-subtitleeditor-eu \
locale-subtitleeditor-fr \
locale-subtitleeditor-gl \
locale-subtitleeditor-hu \
locale-subtitleeditor-it \
locale-subtitleeditor-lt \
locale-subtitleeditor-nl \
locale-subtitleeditor-pl \
locale-subtitleeditor-pt \
locale-subtitleeditor-pt-BR \
locale-subtitleeditor-pt-PT \
locale-subtitleeditor-ru \
locale-subtitleeditor-sr \
locale-subtitleeditor-tr \
locale-subtitleeditor-zh-CN \
locale-subtitleeditor-zh-TW \
subtitleeditor-lang \
subtitleeditor-lang-all"

RDEPENDS:${PN} += "subtitleeditor"

inherit rpm
