SUMMARY = "Translations for package selinux-sandbox"
DESCRIPTION = "Provides translations for the 'selinux-sandbox' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "selinux-sandbox-lang-3.11-3.1.noarch.rpm"
RPM_HASH = "0d60927c575d459aeaeffb7e40b71be2bdbfd8bf8825de6ddd1a326e4897f64c31959b125f31a6ce317bcfe27fc0669019a501b05f1da0844f5fd1c8cf02e582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-selinux-sandbox-cs \
locale-selinux-sandbox-da \
locale-selinux-sandbox-de \
locale-selinux-sandbox-es \
locale-selinux-sandbox-fi \
locale-selinux-sandbox-fr \
locale-selinux-sandbox-hu \
locale-selinux-sandbox-it \
locale-selinux-sandbox-ja \
locale-selinux-sandbox-ka \
locale-selinux-sandbox-ko \
locale-selinux-sandbox-nl \
locale-selinux-sandbox-pl \
locale-selinux-sandbox-pt-BR \
locale-selinux-sandbox-ru \
locale-selinux-sandbox-si \
locale-selinux-sandbox-sv \
locale-selinux-sandbox-tr \
locale-selinux-sandbox-uk \
locale-selinux-sandbox-zh-CN \
locale-selinux-sandbox-zh-TW \
selinux-sandbox-lang \
selinux-sandbox-lang-all"

RDEPENDS:${PN} += "selinux-sandbox"

inherit rpm
