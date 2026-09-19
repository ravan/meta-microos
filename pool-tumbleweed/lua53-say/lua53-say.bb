SUMMARY = "Lua string hashing library, useful for internationalization"
DESCRIPTION = "Useful for internationalization."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "lua53-say-1.4.1-3.2.noarch.rpm"
RPM_HASH = "222b05316f47cc4f1441a00ae308b0abf61a888840a8662c50dc4bb738e9836ffdd5ca3daf973d62aa7c4769e155d014f6256904b5ec7c0d32b51489abc82eae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-say"

RDEPENDS:${PN} += "lua53"

inherit rpm
