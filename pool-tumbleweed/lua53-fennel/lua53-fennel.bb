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

RPM_NAME = "lua53-fennel-1.6.0-2.2.noarch.rpm"
RPM_HASH = "b45dae95094b54b20083e6bc262f9817af6bdd2259e896e8aafd8f4e3e6a636e6538ebdac7965c762486aa27a53f92ed3b3352ead91420180074472b5de9ede3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-fennel"

RDEPENDS:${PN} += "/usr/bin/lua5.3 \
alts \
lua53"

inherit rpm
