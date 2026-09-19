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

RPM_NAME = "lua54-shell-games-1.1.0-4.2.noarch.rpm"
RPM_HASH = "b4ca59b3a6894982198af75a7f3c7adc1080b4ca5263fa5a2f0421b1fa6a0cbdd2b7cbac974ef766f8e882be2fcf8359b77a78e8ad24c6bee318cb540fc416a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-shell-games \
lua54-shell-games"

RDEPENDS:${PN} += "lua54"

inherit rpm
