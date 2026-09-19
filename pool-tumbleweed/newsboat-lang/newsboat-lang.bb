SUMMARY = "Translations for package newsboat"
DESCRIPTION = "Provides translations for the 'newsboat' package."
LICENSE = "MIT"

PV = "2.44"

RPM_NAME = "newsboat-lang-2.44-1.2.noarch.rpm"
RPM_HASH = "92eb15feef4742a6f2fc64a34d3d5f34bcf0c45b72a9b4de485858f786311f5c7a535a2bade975efee9dd3a5f0310dacb235da9bffbc1cfdc570a18d6fb646d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-newsboat-ca \
locale-newsboat-de \
locale-newsboat-es \
locale-newsboat-fr \
locale-newsboat-hu \
locale-newsboat-it \
locale-newsboat-ja \
locale-newsboat-nb \
locale-newsboat-nl \
locale-newsboat-pl \
locale-newsboat-pt-BR \
locale-newsboat-ru \
locale-newsboat-sk \
locale-newsboat-sv \
locale-newsboat-tr \
locale-newsboat-uk \
locale-newsboat-zh-TW \
newsboat-lang \
newsboat-lang-all"

RDEPENDS:${PN} += "newsboat"

inherit rpm
