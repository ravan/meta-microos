SUMMARY = "Coverage analysis tool for Lua scripts"
DESCRIPTION = "LuaCov is a simple coverage analysis tool for Lua scripts. When a Lua \
script is run with the luacov module, it generates a stats file. The \
luacov command-line script then processes this file generating a report \
indicating which code paths were not traversed, which is useful for \
verifying the effectiveness of a test suite."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "lua55-luacov-0.17.0-2.1.noarch.rpm"
RPM_HASH = "0ec86e43fc713eaa9b8d061b3970128922337ec4c09129dcb4adb57a8d43e030b4031238aad97bfaab4ed3fbc8d3b96250f3c97f8585d76096008985e57a292e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-luacov"

RDEPENDS:${PN} += "alts \
lua55"

inherit rpm
