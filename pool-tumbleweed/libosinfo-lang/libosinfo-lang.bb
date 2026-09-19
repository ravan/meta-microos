SUMMARY = "Translations for package libosinfo"
DESCRIPTION = "Provides translations for the 'libosinfo' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.12.0"

RPM_NAME = "libosinfo-lang-1.12.0-3.6.noarch.rpm"
RPM_HASH = "e2bdf785e66741f2fa3886a7568df9397eee1b9f7b92966fee4b32491aa1e90d53d80be65d6a3fe55ef9b808dd74e204062e191db41e59972d08b02873b4802e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libosinfo-lang \
libosinfo-lang-all \
locale-libosinfo-ca \
locale-libosinfo-cs \
locale-libosinfo-de \
locale-libosinfo-es \
locale-libosinfo-eu \
locale-libosinfo-fi \
locale-libosinfo-fr \
locale-libosinfo-fur \
locale-libosinfo-id \
locale-libosinfo-it \
locale-libosinfo-ja \
locale-libosinfo-ka \
locale-libosinfo-ko \
locale-libosinfo-pl \
locale-libosinfo-pt-BR \
locale-libosinfo-pt-PT \
locale-libosinfo-ru \
locale-libosinfo-si \
locale-libosinfo-tr \
locale-libosinfo-uk \
locale-libosinfo-zh-Hans"

RDEPENDS:${PN} += "libosinfo"

inherit rpm
