SUMMARY = "A programmer friendly language that compiles to Lua"
DESCRIPTION = "A programmer friendly language that compiles to Lua."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "lua53-moonscript-0.5.0-7.2.noarch.rpm"
RPM_HASH = "b71413f95652ad1157c8941563c02929ae3ab61ed1779735e810e61fa4e4f7399c2480f858d81ffe3cda1ba127a05c0cedda2f89e4bcf8b87ac90572bf768723"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-moonscript"

RDEPENDS:${PN} += "alts \
lua53 \
lua53-alt-getopt \
lua53-argparse \
lua53-loadkit \
lua53-lpeg \
lua53-luafilesystem"

inherit rpm
