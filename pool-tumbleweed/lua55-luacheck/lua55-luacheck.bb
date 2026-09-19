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

RPM_NAME = "lua55-luacheck-1.2.0-1.1.noarch.rpm"
RPM_HASH = "4ee6382dc0b2197835f594e384f64da75932512237bdef860740398b5ce84bdad18f8d5e7dd0bbc0782d4434c727780dfb5d1c6e5d0bd8e202ad8725e3865a12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-luacheck \
luacheck"

RDEPENDS:${PN} += "/usr/bin/sh \
lua55 \
lua55-argparse \
lua55-luafilesystem \
update-alternatives"

inherit rpm
