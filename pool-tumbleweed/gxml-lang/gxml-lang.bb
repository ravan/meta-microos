SUMMARY = "Translations for gxml"
DESCRIPTION = "Translations for gxml."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.4"

RPM_NAME = "gxml-lang-0.20.4-2.7.noarch.rpm"
RPM_HASH = "cac803b4987205e3622e6752e6bd66e2e63b1bbaf62ec4848f73efcb549a1348e9e9f7640b19fcc54d842e79237b8c4702f85100b502d299c595b80b35ac493d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gxml-lang \
locale-gxml-ca \
locale-gxml-cs \
locale-gxml-da \
locale-gxml-de \
locale-gxml-el \
locale-gxml-en-GB \
locale-gxml-es \
locale-gxml-eu \
locale-gxml-fr \
locale-gxml-hu \
locale-gxml-id \
locale-gxml-pl \
locale-gxml-pt \
locale-gxml-pt-BR \
locale-gxml-ro \
locale-gxml-sl \
locale-gxml-sr \
locale-gxml-sr@latin \
locale-gxml-sv \
locale-gxml-tr \
locale-gxml-uk \
locale-gxml-zh-CN"

RDEPENDS:${PN} += ""

inherit rpm
