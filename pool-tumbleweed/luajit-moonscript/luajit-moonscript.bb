SUMMARY = "A programmer friendly language that compiles to Lua"
DESCRIPTION = "A programmer friendly language that compiles to Lua."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "luajit-moonscript-0.5.0-7.2.noarch.rpm"
RPM_HASH = "522c2808b2feed1bf8f0d5f3bb949ddb34623b2089790b37ea0b5e2d64d4fda072258ffa232b8cfeb17d817df0e802ff3ba46139143e49b19c47b75f4019fd7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-moonscript"

RDEPENDS:${PN} += "alts \
luajit \
luajit-alt-getopt \
luajit-argparse \
luajit-loadkit \
luajit-lpeg \
luajit-luafilesystem"

inherit rpm
