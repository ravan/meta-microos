SUMMARY = "Lua binding to OpenLDAP"
DESCRIPTION = "LuaLDAP is a simple interface from Lua to an LDAP client, in fact it is a bind to OpenLDAP client or ADSI"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "lua53-lualdap-1.3.0-5.3.aarch64.rpm"
RPM_HASH = "3bee00a0ea304b686b28919b63eea02486959d7c54bf9240559037fad16cbab732fa46a9af5a9711be76b6c80191ff1555a7af1ffd3eeeee3fdab3a5596647d5"

RPROVIDES:${PN} += "lua53-lualdap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
lua53"

inherit rpm
