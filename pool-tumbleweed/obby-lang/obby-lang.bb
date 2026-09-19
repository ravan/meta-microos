SUMMARY = "Translations for package obby"
DESCRIPTION = "Provides translations for the 'obby' package."
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "obby-lang-0.4.8-11.39.noarch.rpm"
RPM_HASH = "a0f3024038bf13a59d50b78314e5dd4de52f7bb784fab13fd21e15d62e21081950ec9df703c674e16395538145ed0952f4ae8ebdf31549ed019be496b25c9ba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-obby-ast \
locale-obby-ca \
locale-obby-da \
locale-obby-de \
locale-obby-en-GB \
locale-obby-es \
locale-obby-fr \
locale-obby-it \
locale-obby-nl \
locale-obby-oc \
locale-obby-pt-BR \
locale-obby-sv \
locale-obby-uk \
obby-lang \
obby-lang-all"

RDEPENDS:${PN} += "obby"

inherit rpm
