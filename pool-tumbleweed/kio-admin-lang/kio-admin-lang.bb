SUMMARY = "Translations for package kio-admin"
DESCRIPTION = "Provides translations for the 'kio-admin' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "kio-admin-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "11514b255c40de4cd1c58eb92f5d223ad17dd3674f2074996d51cd024933bd13046303b44ee85ea0d62f02a243ed81b3c1635e64919bc7c722a67df0c2255b94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-admin-lang \
kio-admin-lang-all \
locale-kio-admin-ar \
locale-kio-admin-be \
locale-kio-admin-bg \
locale-kio-admin-ca \
locale-kio-admin-ca@valencia \
locale-kio-admin-cs \
locale-kio-admin-de \
locale-kio-admin-en-GB \
locale-kio-admin-eo \
locale-kio-admin-es \
locale-kio-admin-eu \
locale-kio-admin-fi \
locale-kio-admin-fr \
locale-kio-admin-ga \
locale-kio-admin-gl \
locale-kio-admin-he \
locale-kio-admin-hu \
locale-kio-admin-ia \
locale-kio-admin-is \
locale-kio-admin-it \
locale-kio-admin-ja \
locale-kio-admin-ka \
locale-kio-admin-ko \
locale-kio-admin-lt \
locale-kio-admin-nl \
locale-kio-admin-nn \
locale-kio-admin-pl \
locale-kio-admin-pt \
locale-kio-admin-pt-BR \
locale-kio-admin-ro \
locale-kio-admin-ru \
locale-kio-admin-sk \
locale-kio-admin-sl \
locale-kio-admin-sv \
locale-kio-admin-tr \
locale-kio-admin-ug \
locale-kio-admin-uk \
locale-kio-admin-zh-CN \
locale-kio-admin-zh-TW"

RDEPENDS:${PN} += "kio-admin"

inherit rpm
