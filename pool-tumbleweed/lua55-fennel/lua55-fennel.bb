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

RPM_NAME = "lua55-fennel-1.6.0-2.2.noarch.rpm"
RPM_HASH = "8d9c4135d2734832531c5ba1c201e9f1c7aeec7979691c6406e6fc764f8fee81e9e77aff8f69f9779dd573a06ddb6b0391c220a1e3c1c785f1decc8a5d9382c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-fennel"

RDEPENDS:${PN} += "/usr/bin/lua5.5 \
alts \
lua55"

inherit rpm
