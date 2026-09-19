SUMMARY = "Coroutine safe xpcall and pcall"
DESCRIPTION = "Encapsulates the protected calls with a coroutine based loop, so errors \
can be handled without the usual Lua 5.x pcall/xpcall issues with \
coroutines yielding inside the call to pcall or xpcall."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "lua53-coxpcall-1.17.0-6.2.noarch.rpm"
RPM_HASH = "c311934bde63023050fbc94eb60a8b7b97cee1517ba37760c080842d7cbb57a943daf502d7984c9107d51fcf1fe823dd668b2e510025a772bbd63308b791643a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-coxpcall"

RDEPENDS:${PN} += "lua53"

inherit rpm
