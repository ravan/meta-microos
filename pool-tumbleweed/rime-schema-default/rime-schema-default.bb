SUMMARY = "Default/Preset collection of rime schemas"
DESCRIPTION = "Default/Preset collection of rime schemas."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-default-20250315-1.4.noarch.rpm"
RPM_HASH = "4bf1dcb677eca03f30e2f84b5c15f24b209a14b28fb170d8ed3743871c1009bed1986b555f9a4858cd58ebdc064cbd99971a62a48afc6feb5cdad6e6b4598b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-default"

RDEPENDS:${PN} += "rime-schema-bopomofo \
rime-schema-cangjie \
rime-schema-custom \
rime-schema-essay \
rime-schema-luna-pinyin \
rime-schema-prelude \
rime-schema-stroke \
rime-schema-terra-pinyin"

inherit rpm
