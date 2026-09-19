SUMMARY = "Translations for package cantata"
DESCRIPTION = "Provides translations for the 'cantata' package."
LICENSE = "GPL-3.0-only"

PV = "3.5.0"

RPM_NAME = "cantata-lang-3.5.0-1.2.noarch.rpm"
RPM_HASH = "42ddd8b561b1cd6d5507283baaf3a8d7389b2aa74263b6d84b1ffa118bd46ff8a2f4882fe6c0f51931844c7fb3dede34b7cd0423d83d31949b022081c92ce191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cantata-lang \
cantata-lang-all"

RDEPENDS:${PN} += "cantata"

inherit rpm
