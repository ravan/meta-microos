SUMMARY = "A programmer friendly language that compiles to Lua"
DESCRIPTION = "A programmer friendly language that compiles to Lua."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "lua55-moonscript-0.5.0-7.2.noarch.rpm"
RPM_HASH = "792f5dc6e58f23d6622540f575b91c2063dd369e2722c6063d711fd4ef623b38171395ad57597b8d27da50d8f2f0c210c2ea37f1ecda2755e548b3324af4bcd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-moonscript"

RDEPENDS:${PN} += "alts \
lua55 \
lua55-alt-getopt \
lua55-argparse \
lua55-loadkit \
lua55-lpeg \
lua55-luafilesystem"

inherit rpm
