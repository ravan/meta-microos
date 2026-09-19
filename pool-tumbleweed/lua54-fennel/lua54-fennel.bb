SUMMARY = "Lisp dialect that compiles to Lua"
DESCRIPTION = "Fennel is a lisp that compiles to Lua. Features include: \
 \
• Full Lua compatibility - You can use any function or library from \
  Lua. \
• Zero overhead - Compiled code should be just as or more efficient \
  than hand-written Lua. \
• Compile-time macros - Ship compiled code with no runtime \
  dependency on Fennel. \
• Embeddable - Fennel is a one-file library as well as an \
  executable. \
  Embed it in other programs to support runtime extensibility and \
  interactive development."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "lua54-fennel-1.6.0-2.2.noarch.rpm"
RPM_HASH = "22be8759bead2d7736ef162360259769d822322dfcc215fc4ac818adfac92111297ce3cb3e91110ff39989008b01c720f2421cbf9cc1a20c3d7ed1c5be0105ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-fennel \
lua54-fennel"

RDEPENDS:${PN} += "/usr/bin/lua5.4 \
alts \
lua54"

inherit rpm
