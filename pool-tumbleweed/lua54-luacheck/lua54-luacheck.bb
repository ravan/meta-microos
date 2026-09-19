SUMMARY = "Command-line tool for linting and static analysis of Lua code"
DESCRIPTION = "Luacheck is a static analyzer and a linter for Lua. Luacheck detects \
various issues such as usage of undefined global variables, unused variables \
and values, accessing uninitialized variables, unreachable code and more. \
Most aspects of checking are configurable: there are options for defining \
custom project-related globals, for selecting set of standard globals \
(version of Lua standard library), for filtering warnings by type and name of \
related variable, etc. \
The options can be used on the command line, put into a config or directly into \
checked files as Lua comments."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "lua54-luacheck-1.2.0-1.1.noarch.rpm"
RPM_HASH = "c99b15605e332cdda8c9205b46720f32e6d054620b9d2cdb620e7f3363bc25b6449b9bb55d6ccc9372cb397e6ca10ffc6bc7a3e2c7fa21d594330bd057cde94f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-luacheck \
lua54-luacheck \
luacheck"

RDEPENDS:${PN} += "/usr/bin/sh \
lua54 \
lua54-argparse \
lua54-luafilesystem \
update-alternatives"

inherit rpm
