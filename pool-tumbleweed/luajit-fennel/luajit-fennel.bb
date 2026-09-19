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

RPM_NAME = "luajit-fennel-1.6.0-2.2.noarch.rpm"
RPM_HASH = "96a18a4d9bb0d4f3e9d179986c55db320fe2ad3a90eb17e4968d3016fde49a473eb5324653c2cb02bb57c996cdda0d361930a9d56c91abec000d3442d34865a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-fennel"

RDEPENDS:${PN} += "/usr/bin/luajit \
alts \
luajit"

inherit rpm
