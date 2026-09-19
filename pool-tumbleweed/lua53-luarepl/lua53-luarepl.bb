SUMMARY = "A Lua REPL implemented in Lua for embedding in other programs"
DESCRIPTION = "This project has two uses: \
- An alternative to the standalone interpreter included with Lua, one that \
supports things like plugins, tab completion, and automatic insertion of \
return in front of expressions. \
- A REPL library you may embed in your application, to provide all of the \
niceties of the standalone interpreter included with Lua and then some."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "lua53-luarepl-0.10-5.2.noarch.rpm"
RPM_HASH = "29b1efbe190ece32d7b3578a4eecb3027b9f86d913cfe612f572bea522f3b8d681bdf9d57f0c1b09debec5abcd0f0fa9b1c9d5c1b6b097566edb11b70a919b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-luarepl"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-sh \
lua53 \
update-alternatives"

inherit rpm
