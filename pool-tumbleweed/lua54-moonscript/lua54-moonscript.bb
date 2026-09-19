SUMMARY = "A programmer friendly language that compiles to Lua"
DESCRIPTION = "A programmer friendly language that compiles to Lua."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "lua54-moonscript-0.5.0-7.2.noarch.rpm"
RPM_HASH = "887363ed25b873bbca5ad3525f07cc132ae33704f009e71048814baa99d7d34981a8f2af78903cde3373766d5794ea3a6779e5ec56df544eeb2815cb2c38214b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-moonscript \
lua54-moonscript"

RDEPENDS:${PN} += "alts \
lua54 \
lua54-alt-getopt \
lua54-argparse \
lua54-loadkit \
lua54-lpeg \
lua54-luafilesystem"

inherit rpm
