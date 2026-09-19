SUMMARY = "A “safe templates” engine for Lua"
DESCRIPTION = "Cosmo is a 'safe templates' engine.  It allows you to fill nested \
templates, providing many of the advantages of Turing-complete template \
engines, without the downside of allowing arbitrary code in the templates."
LICENSE = "MIT"

PV = "16.06.04"

RPM_NAME = "lua55-cosmo-16.06.04-6.2.noarch.rpm"
RPM_HASH = "7f7bcaf09b6b54e718d72a1785cfc9f835c51c8583f61ecd571eaa3bf8be01ea6cff6c370b149bd79113812a454aba2f70a428b12da8507adffa76bbc6157099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-cosmo"

RDEPENDS:${PN} += "lua55 \
lua55-lpeg"

inherit rpm
