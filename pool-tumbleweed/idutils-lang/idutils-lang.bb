SUMMARY = "Translations for package idutils"
DESCRIPTION = "Provides translations for the 'idutils' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.6"

RPM_NAME = "idutils-lang-4.6-5.9.noarch.rpm"
RPM_HASH = "bf85e0100efba4f1a0d563dc11687158909c2e75f0a75c083df486545c3c7a9b28ab7eb3fabcb7d09cb5edf0c04d69b26364285402034df97740e84cd49ff0e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "idutils-lang \
idutils-lang-all \
locale-idutils-da \
locale-idutils-de \
locale-idutils-fi \
locale-idutils-fr \
locale-idutils-ga \
locale-idutils-hu \
locale-idutils-id \
locale-idutils-it \
locale-idutils-nl \
locale-idutils-pl \
locale-idutils-pt-BR \
locale-idutils-ro \
locale-idutils-ru \
locale-idutils-sv \
locale-idutils-tr \
locale-idutils-vi \
locale-idutils-zh-CN"

RDEPENDS:${PN} += "idutils"

inherit rpm
