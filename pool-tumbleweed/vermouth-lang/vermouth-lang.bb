SUMMARY = "Translations for package vermouth"
DESCRIPTION = "Provides translations for the 'vermouth' package."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "vermouth-lang-2.2.1-1.1.noarch.rpm"
RPM_HASH = "e22376ded53bf62edd90d086927d9cdce5bdb389373feec591ec1981abd67ac0c05810af6d14052395ff27b5765c931097092b99d7fd9e77cdb7196429ac1d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vermouth-de \
locale-vermouth-es \
locale-vermouth-fr \
locale-vermouth-it \
locale-vermouth-ja \
locale-vermouth-mk \
locale-vermouth-nl \
locale-vermouth-pl \
locale-vermouth-pt-BR \
locale-vermouth-ru \
locale-vermouth-tr \
locale-vermouth-uk \
locale-vermouth-zh-CN \
vermouth-lang \
vermouth-lang-all"

RDEPENDS:${PN} += "vermouth"

inherit rpm
