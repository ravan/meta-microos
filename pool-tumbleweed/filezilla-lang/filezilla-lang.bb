SUMMARY = "Translations for package filezilla"
DESCRIPTION = "Provides translations for the 'filezilla' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.71.1"

RPM_NAME = "filezilla-lang-3.71.1-1.1.noarch.rpm"
RPM_HASH = "f76d0d58feaa6a29d64f49687662ce31004e67d60492c470851c785dd7a93aac87771c388c0dec39e7c5d589cfb2e790b11e62c282ab9dda159567a95ca475a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "filezilla-lang \
filezilla-lang-all \
locale-filezilla-ar \
locale-filezilla-az \
locale-filezilla-ca \
locale-filezilla-cs-CZ \
locale-filezilla-cy \
locale-filezilla-da \
locale-filezilla-de \
locale-filezilla-el \
locale-filezilla-en \
locale-filezilla-es \
locale-filezilla-et \
locale-filezilla-eu \
locale-filezilla-fi-FI \
locale-filezilla-fr \
locale-filezilla-ga \
locale-filezilla-hr \
locale-filezilla-is \
locale-filezilla-it \
locale-filezilla-ka \
locale-filezilla-nb-NO \
locale-filezilla-ne \
locale-filezilla-nl \
locale-filezilla-nn-NO \
locale-filezilla-oc \
locale-filezilla-pl-PL \
locale-filezilla-pt-BR \
locale-filezilla-pt-PT \
locale-filezilla-ru \
locale-filezilla-sl-SI \
locale-filezilla-sr \
locale-filezilla-sv \
locale-filezilla-ta \
locale-filezilla-tr \
locale-filezilla-uk-UA \
locale-filezilla-zh-CN \
locale-filezilla-zh-TW"

RDEPENDS:${PN} += "filezilla"

inherit rpm
