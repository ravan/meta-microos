SUMMARY = "Translations for package wasistlos"
DESCRIPTION = "Provides translations for the 'wasistlos' package."
LICENSE = "GPL-3.0-only"

PV = "1.7.0~20241019.b483456"

RPM_NAME = "wasistlos-lang-1.7.0~20241019.b483456-1.7.noarch.rpm"
RPM_HASH = "ddec4f1018902d877bff5d7cbd545954f42258021bea91a4399115e26f0e3ca5a81b94f0a6cc18469fba6c08cd7c05cd92597a1d296a4180a9ff853910379fc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wasistlos-bn \
locale-wasistlos-cs \
locale-wasistlos-de \
locale-wasistlos-es \
locale-wasistlos-fr \
locale-wasistlos-hu \
locale-wasistlos-it \
locale-wasistlos-ka \
locale-wasistlos-nl \
locale-wasistlos-pl \
locale-wasistlos-pt-BR \
locale-wasistlos-ru \
locale-wasistlos-si \
locale-wasistlos-tr \
locale-wasistlos-uk \
wasistlos-lang \
wasistlos-lang-all"

RDEPENDS:${PN} += "wasistlos"

inherit rpm
