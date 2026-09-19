SUMMARY = "A “safe templates” engine for Lua"
DESCRIPTION = "Cosmo is a 'safe templates' engine.  It allows you to fill nested \
templates, providing many of the advantages of Turing-complete template \
engines, without the downside of allowing arbitrary code in the templates."
LICENSE = "MIT"

PV = "16.06.04"

RPM_NAME = "luajit-cosmo-16.06.04-6.2.noarch.rpm"
RPM_HASH = "d806f1b1519f86950de32417d6ea2703fccb06575b10b2989d4ff13f4d9ba3fe2f18bf371dc99d0ab0193e0af1e443dccb884a2f1c2e961d7a717bda3b710444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-cosmo"

RDEPENDS:${PN} += "luajit \
luajit-lpeg"

inherit rpm
