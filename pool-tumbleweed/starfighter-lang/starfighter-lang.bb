SUMMARY = "Translations for package starfighter"
DESCRIPTION = "Provides translations for the 'starfighter' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "starfighter-lang-2.4-2.9.noarch.rpm"
RPM_HASH = "e4fc7d41daf4bcd7a56cd51a5ad3c7b60192bdd0efa672190bb9d54c9c4e9066aea783054868c8eff6774c5a39b292b27ce4f96450b5129596da84a2a10de997"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-starfighter-en \
locale-starfighter-ja \
locale-starfighter-nl \
starfighter-lang \
starfighter-lang-all"

RDEPENDS:${PN} += "starfighter"

inherit rpm
