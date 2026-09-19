SUMMARY = "Coroutine safe xpcall and pcall"
DESCRIPTION = "Encapsulates the protected calls with a coroutine based loop, so errors \
can be handled without the usual Lua 5.x pcall/xpcall issues with \
coroutines yielding inside the call to pcall or xpcall."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "luajit-coxpcall-1.17.0-6.2.noarch.rpm"
RPM_HASH = "1e001130725347866a1fa30a4039b93ff6be690333119fb935339ca468a3ef9c2c4767200c03c4f2cd551c3527108617bdb69e6a61f24900c1762b37e3304918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "luajit-coxpcall"

RDEPENDS:${PN} += "luajit"

inherit rpm
