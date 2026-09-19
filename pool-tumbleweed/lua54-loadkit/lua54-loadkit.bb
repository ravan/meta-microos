SUMMARY = "Loadkit allows you to load arbitrary files within the Lua package path"
DESCRIPTION = "Loadkit lets you register new file extension handlers that \
can be opened with require, or you can just search for files \
of any extension using the current search path."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua54-loadkit-1.1.0-6.3.noarch.rpm"
RPM_HASH = "84d9a541111dceb4d9d4c2c1012723583f937f602f9fc5a02fb1bcdb5c8f648235c7ddcae8dfee1e80a9644afd7337490dc68def0550605325189abf6ca79ee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-loadkit \
lua54-loadkit"

RDEPENDS:${PN} += "lua54"

inherit rpm
