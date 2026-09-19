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

RPM_NAME = "lua55-shell-games-1.1.0-4.2.noarch.rpm"
RPM_HASH = "4a697f29d3c9bf4aad59d9b10a8b7f93a7dd78344f89bf734b87fd24922fc6aa13e44669c11454bc31c90c9f94f7d0306b240906e01ef4a8e1c4fa697b9ea74e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-shell-games"

RDEPENDS:${PN} += "lua55"

inherit rpm
