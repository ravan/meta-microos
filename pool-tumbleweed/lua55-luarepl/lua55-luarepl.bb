SUMMARY = "A Lua REPL implemented in Lua for embedding in other programs"
DESCRIPTION = "This project has two uses: \
- An alternative to the standalone interpreter included with Lua, one that \
supports things like plugins, tab completion, and automatic insertion of \
return in front of expressions. \
- A REPL library you may embed in your application, to provide all of the \
niceties of the standalone interpreter included with Lua and then some."
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "lua55-luarepl-0.10-5.2.noarch.rpm"
RPM_HASH = "5cf203661d872881f41facbfcba922ce3bd6ce4ddf550c0c06cac3cb9cb84baf1b8463090f7346cc60f8aeefef0048e805688ab7962d85ac3176266d13fee263"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua55-luarepl"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-sh \
lua55 \
update-alternatives"

inherit rpm
