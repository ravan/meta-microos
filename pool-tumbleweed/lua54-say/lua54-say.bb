SUMMARY = "Lua string hashing library, useful for internationalization"
DESCRIPTION = "Useful for internationalization."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "lua54-say-1.4.1-3.2.noarch.rpm"
RPM_HASH = "fbabdce13e91822ce0bfefff6447d18487309a547844fc6226a8efa1fd1193cbec69bacabfbfb73189396109a01ab46b06464447a93d4a9d87614df9e21f391e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-say \
lua54-say"

RDEPENDS:${PN} += "lua54"

inherit rpm
