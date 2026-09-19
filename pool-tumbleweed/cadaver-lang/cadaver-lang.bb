SUMMARY = "Translations for package cadaver"
DESCRIPTION = "Provides translations for the 'cadaver' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.28"

RPM_NAME = "cadaver-lang-0.28-1.4.noarch.rpm"
RPM_HASH = "c8652cdeffb8f7e97d03194b0035e37bd49b5460b388df3e8ff29551a1034b8ef613c2f1aeaa2812877586f7f051efb5a9153b028de06091e80cb83ee16853c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cadaver-lang \
cadaver-lang-all \
locale-cadaver-en@quot \
locale-cadaver-es"

RDEPENDS:${PN} += "cadaver"

inherit rpm
