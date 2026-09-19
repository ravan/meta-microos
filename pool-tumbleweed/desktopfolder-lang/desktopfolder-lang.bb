SUMMARY = "Translations for package desktopfolder"
DESCRIPTION = "Provides translations for the 'desktopfolder' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "desktopfolder-lang-1.1.3-4.8.noarch.rpm"
RPM_HASH = "4305fac976506aa97947c7bac5fdeea692adf5095a9aa8cda210060dbb769daa7b6eef019425839e278d90df2c4abef0ef83de76a259c89e087ed3350eaeec8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "desktopfolder-lang \
desktopfolder-lang-all \
locale-desktopfolder-bg \
locale-desktopfolder-ca \
locale-desktopfolder-cs \
locale-desktopfolder-da \
locale-desktopfolder-de-DE \
locale-desktopfolder-en-GB \
locale-desktopfolder-eo \
locale-desktopfolder-es \
locale-desktopfolder-fi \
locale-desktopfolder-fr \
locale-desktopfolder-fr-FR \
locale-desktopfolder-hu \
locale-desktopfolder-it \
locale-desktopfolder-ja \
locale-desktopfolder-lt \
locale-desktopfolder-oc \
locale-desktopfolder-pl \
locale-desktopfolder-pt-BR \
locale-desktopfolder-pt-PT \
locale-desktopfolder-ru \
locale-desktopfolder-tr \
locale-desktopfolder-uk \
locale-desktopfolder-zh-CN"

RDEPENDS:${PN} += "desktopfolder"

inherit rpm
