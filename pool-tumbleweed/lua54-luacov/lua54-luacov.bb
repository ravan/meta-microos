SUMMARY = "Coverage analysis tool for Lua scripts"
DESCRIPTION = "LuaCov is a simple coverage analysis tool for Lua scripts. When a Lua \
script is run with the luacov module, it generates a stats file. The \
luacov command-line script then processes this file generating a report \
indicating which code paths were not traversed, which is useful for \
verifying the effectiveness of a test suite."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "lua54-luacov-0.17.0-2.1.noarch.rpm"
RPM_HASH = "73a148033a130773f4271c70f1d46bad8eafdb58defc630a508ad421f0ce4712282e9af69f5a570aa4f255708405a1d1dd97af04bb650aceb8fdc07fb3f5d1b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-luacov \
lua54-luacov"

RDEPENDS:${PN} += "alts \
lua54"

inherit rpm
