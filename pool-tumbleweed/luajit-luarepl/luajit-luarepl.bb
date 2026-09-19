SUMMARY = "A Lua REPL implemented in Lua for embedding in other programs"
DESCRIPTION = "This project has two uses: \
- An alternative to the standalone interpreter included with Lua, one that \
supports things like plugins, tab completion, and automatic insertion of \
return in front of expressions. \
- A REPL library you may embed in your application, to provide all of the \
niceties of the standalone interpreter included with Lua and then some."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "luajit-luarepl-0.10-5.2.noarch.rpm"
RPM_HASH = "68a72cbce244b515879854e6fbb5543a2c15336df74660e7cd9c913c7710ffcf6aad28640ea7511ca569149637dc09f543a530da5414c9fc56c264ed85f01709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-luarepl"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-sh \
luajit \
update-alternatives"

inherit rpm
