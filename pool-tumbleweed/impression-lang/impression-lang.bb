SUMMARY = "Translations for package impression"
DESCRIPTION = "Provides translations for the 'impression' package."
LICENSE = "GPL-3.0-only"

PV = "3.7.0"

RPM_NAME = "impression-lang-3.7.0-1.3.noarch.rpm"
RPM_HASH = "fc2eb110d67ac05dcccf9cafbefc2d79333f0aeadce4612dff4537a4a5df27f02dc6043a8af38bedbe2ab12f66570607e95edb4c5359fb48db76d36ca6a7a810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "impression-lang \
impression-lang-all \
locale-impression-ar \
locale-impression-cs \
locale-impression-de \
locale-impression-es \
locale-impression-fi \
locale-impression-fr \
locale-impression-hr \
locale-impression-it \
locale-impression-ja \
locale-impression-ka \
locale-impression-nb \
locale-impression-nl \
locale-impression-nn \
locale-impression-oc \
locale-impression-pl \
locale-impression-pt-BR \
locale-impression-ru \
locale-impression-sk \
locale-impression-tr \
locale-impression-zh-CN"

RDEPENDS:${PN} += "impression"

inherit rpm
