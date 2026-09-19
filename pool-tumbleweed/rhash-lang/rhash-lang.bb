SUMMARY = "Translations for package rhash"
DESCRIPTION = "Provides translations for the 'rhash' package."
LICENSE = "0BSD"

PV = "1.4.6"

RPM_NAME = "rhash-lang-1.4.6-2.3.noarch.rpm"
RPM_HASH = "02e92bf4a9c988d32e98acb68d9ebfa6f2a82a14961dc4797d39896c9a93393399da5362549ee656d5fb142cc396358c9df317c9fdd8e72b622d0fa814b87f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rhash-ca \
locale-rhash-de \
locale-rhash-en-AU \
locale-rhash-es \
locale-rhash-fr \
locale-rhash-gl \
locale-rhash-it \
locale-rhash-pt-BR \
locale-rhash-ro \
locale-rhash-ru \
locale-rhash-uk \
rhash-lang \
rhash-lang-all"

RDEPENDS:${PN} += "rhash"

inherit rpm
