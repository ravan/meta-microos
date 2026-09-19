SUMMARY = "Translations for package whatsapp-for-linux"
DESCRIPTION = "Provides translations for the 'whatsapp-for-linux' package."
LICENSE = "GPL-3.0-only"

PV = "1.6.5"

RPM_NAME = "whatsapp-for-linux-lang-1.6.5-1.7.noarch.rpm"
RPM_HASH = "ae2f7b2a05d0219ed135f3d14981bdaff298a760e17bba475befbf1d21b6a885494c76dde1b605d91c18c6b1973be176605313ac8f5f276a97d8f747701f5c7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-whatsapp-for-linux-bn \
locale-whatsapp-for-linux-cs \
locale-whatsapp-for-linux-de \
locale-whatsapp-for-linux-es \
locale-whatsapp-for-linux-fr \
locale-whatsapp-for-linux-hu \
locale-whatsapp-for-linux-it \
locale-whatsapp-for-linux-ka \
locale-whatsapp-for-linux-nl \
locale-whatsapp-for-linux-pl \
locale-whatsapp-for-linux-ru \
locale-whatsapp-for-linux-si \
locale-whatsapp-for-linux-tr \
whatsapp-for-linux-lang \
whatsapp-for-linux-lang-all"

RDEPENDS:${PN} += "whatsapp-for-linux"

inherit rpm
