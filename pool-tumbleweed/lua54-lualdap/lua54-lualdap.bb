SUMMARY = "Lua binding to OpenLDAP"
DESCRIPTION = "LuaLDAP is a simple interface from Lua to an LDAP client, in fact it is a bind to OpenLDAP client or ADSI"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "lua54-lualdap-1.3.0-5.3.aarch64.rpm"
RPM_HASH = "8c7fafb2d57ee7ce6ce38ea9ac575550ad074f01aa297e5a7894cb4b3dc31d1af9305d0577d7d9edbb0adf6b6b01d70ca766b003952ad217a5f5f758a4a8722c"

RPROVIDES:${PN} += "lua-lualdap \
lua54-lualdap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
lua54"

inherit rpm
