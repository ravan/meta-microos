SUMMARY = "Coverage analysis tool for Lua scripts"
DESCRIPTION = "LuaCov is a simple coverage analysis tool for Lua scripts. When a Lua \
script is run with the luacov module, it generates a stats file. The \
luacov command-line script then processes this file generating a report \
indicating which code paths were not traversed, which is useful for \
verifying the effectiveness of a test suite."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "luajit-luacov-0.17.0-2.1.noarch.rpm"
RPM_HASH = "4894334a752a986a3c38b08521a052b0c754bede24b093e2724adedec2f44ec73a166381e735947c70e2871ca1ecf98253a49867389458967dc7fc33ad09388a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-luacov"

RDEPENDS:${PN} += "alts \
luajit"

inherit rpm
