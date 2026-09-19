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

RPM_NAME = "luajit-shell-games-1.1.0-4.2.noarch.rpm"
RPM_HASH = "846606c6e79e1d39f4fd2598a7344cbce48ac8040d283e34f189350fe43b8ad023ef5e504ac896126d6c0911203c2548fe8ceea6b4d3b9d0fcf1c62ddef86e13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-shell-games"

RDEPENDS:${PN} += "luajit"

inherit rpm
