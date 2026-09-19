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

RPM_NAME = "luajit-luacheck-1.2.0-1.1.noarch.rpm"
RPM_HASH = "73e5fb86f06515c9dfc6bbe6afba6f1063f55ebb60401f78efb29206d38684e76885bbb80a2c2ca0b2fc132dd6ebdd04e4308ffd886e3dd2d056ba47765f57bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luacheck \
luajit-luacheck"

RDEPENDS:${PN} += "/usr/bin/sh \
luajit \
luajit-argparse \
luajit-luafilesystem \
update-alternatives"

inherit rpm
