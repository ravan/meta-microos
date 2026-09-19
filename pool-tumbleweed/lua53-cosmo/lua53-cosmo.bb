SUMMARY = "A “safe templates” engine for Lua"
DESCRIPTION = "Cosmo is a 'safe templates' engine.  It allows you to fill nested \
templates, providing many of the advantages of Turing-complete template \
engines, without the downside of allowing arbitrary code in the templates."
LICENSE = "MIT"

PV = "16.06.04"

RPM_NAME = "lua53-cosmo-16.06.04-6.2.noarch.rpm"
RPM_HASH = "ae87b77a1f66b4380696736961448fae4478454f0969e17360dcf8e7de9464f68827ebd47407a39fe553d9f7d32ed5c2109563e36823e55fd75981a6b02bce1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-cosmo"

RDEPENDS:${PN} += "lua53 \
lua53-lpeg"

inherit rpm
