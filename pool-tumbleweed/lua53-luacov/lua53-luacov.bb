SUMMARY = "Coverage analysis tool for Lua scripts"
DESCRIPTION = "LuaCov is a simple coverage analysis tool for Lua scripts. When a Lua \
script is run with the luacov module, it generates a stats file. The \
luacov command-line script then processes this file generating a report \
indicating which code paths were not traversed, which is useful for \
verifying the effectiveness of a test suite."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "lua53-luacov-0.17.0-2.1.noarch.rpm"
RPM_HASH = "51fa064e1be63e0dffda759c080a3eb6dbbde6d0e51e33a7a9571e5f61baa0777ec2af8a03975a47491dc6c884f238af0dac4d72da00d73342a26131f6981204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-luacov"

RDEPENDS:${PN} += "alts \
lua53"

inherit rpm
