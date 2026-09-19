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

RPM_NAME = "lua53-luacheck-1.2.0-1.1.noarch.rpm"
RPM_HASH = "6fc97fed410c6143bbbc975745798069122b843f6f11082e92ae3a7bd039fd39ce8a2e7f36867e54a649288af627cdeb0f88b3bacfecf643fe1f26eb10c0191d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-luacheck \
luacheck"

RDEPENDS:${PN} += "/usr/bin/sh \
lua53 \
lua53-argparse \
lua53-luafilesystem \
update-alternatives"

inherit rpm
