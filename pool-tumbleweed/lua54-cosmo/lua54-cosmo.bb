SUMMARY = "A “safe templates” engine for Lua"
DESCRIPTION = "Cosmo is a 'safe templates' engine.  It allows you to fill nested \
templates, providing many of the advantages of Turing-complete template \
engines, without the downside of allowing arbitrary code in the templates."
LICENSE = "MIT"

PV = "16.06.04"

RPM_NAME = "lua54-cosmo-16.06.04-6.2.noarch.rpm"
RPM_HASH = "e6a0784544eedfebac42943a92c8824bc3a112fa5b1fb59ea48b4f0e8de54e88665a954d32b25d787627d862ed40048f28d009dde5ef1d0c181c5dfe7ac20636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-cosmo \
lua54-cosmo"

RDEPENDS:${PN} += "lua54 \
lua54-lpeg"

inherit rpm
