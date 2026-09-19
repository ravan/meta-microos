SUMMARY = "A Lua REPL implemented in Lua for embedding in other programs"
DESCRIPTION = "This project has two uses: \
- An alternative to the standalone interpreter included with Lua, one that \
supports things like plugins, tab completion, and automatic insertion of \
return in front of expressions. \
- A REPL library you may embed in your application, to provide all of the \
niceties of the standalone interpreter included with Lua and then some."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "lua54-luarepl-0.10-5.2.noarch.rpm"
RPM_HASH = "a716c2dacb7c490b5ebec10bbc8af277ec8f5504b20b9ccbfc9c9300518d569840eef574a08eaa9c81a08a07506d39cee5ab6cf5d6273e2857913f2eee32727a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-luarepl \
lua54-luarepl"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-sh \
lua54 \
update-alternatives"

inherit rpm
