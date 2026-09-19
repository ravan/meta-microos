SUMMARY = "Lua binding to OpenLDAP"
DESCRIPTION = "LuaLDAP is a simple interface from Lua to an LDAP client, in fact it is a bind to OpenLDAP client or ADSI"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "luajit-lualdap-1.3.0-5.3.aarch64.rpm"
RPM_HASH = "3e8ecbdc2dc61f4fbdcc7c4c1cd26baad8946856571ba228727f339826d47e95fd05418a2483e8a7025ccc0777ed55c6e44a4a19ac681812338b19ac49efcc09"

RPROVIDES:${PN} += "luajit-lualdap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
luajit"

inherit rpm
