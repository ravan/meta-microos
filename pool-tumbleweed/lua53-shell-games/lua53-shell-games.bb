SUMMARY = "Lua library to help execute shell commands"
DESCRIPTION = "A Lua library to help execute shell commands more easily and safely. \
 \
* Easily execute shell commands, while capturing the command's output and exit \
code. Includes compatibility across versions of Lua, LuaJIT, and OpenResty \
where io.popen may not return exit codes (pre Lua 5.2 behavior). \
* Utilities to quote and escape shell arguments for safer, less error-prone \
execution. \
 \
When executing shell commands, shell-games wraps either os.execute or io.popen \
(depending on whether the output is being captured)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua53-shell-games-1.1.0-4.2.noarch.rpm"
RPM_HASH = "1cca71f6f0abc96bdb27429d0084b7e1429fca4a1eee61abd3460b0e5cecd68044eccdfa777e5270593a5529c53c0315d3f39506349eda93a945080ebb413660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-shell-games"

RDEPENDS:${PN} += "lua53"

inherit rpm
