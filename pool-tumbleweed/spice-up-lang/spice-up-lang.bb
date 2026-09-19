SUMMARY = "Translations for package spice-up"
DESCRIPTION = "Provides translations for the 'spice-up' package."
LICENSE = "GPL-3.0-only"

PV = "1.9.1"

RPM_NAME = "spice-up-lang-1.9.1-2.9.noarch.rpm"
RPM_HASH = "59f703d20c49a899f8fb9d441fa1a0e13d3dacddc106aa0cded84d7c3007195ca301e686e94e6732ae1e8b03b5132a6e5fdeeb186a8ccefec21f257ab069809c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-spice-up-ca \
locale-spice-up-de \
locale-spice-up-es \
locale-spice-up-fr \
locale-spice-up-ja \
locale-spice-up-pt-BR \
locale-spice-up-pt-PT \
locale-spice-up-sr \
locale-spice-up-sr@latin \
spice-up-lang \
spice-up-lang-all"

RDEPENDS:${PN} += "spice-up"

inherit rpm
