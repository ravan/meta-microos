SUMMARY = "Lua binding to OpenLDAP"
DESCRIPTION = "LuaLDAP is a simple interface from Lua to an LDAP client, in fact it is a bind to OpenLDAP client or ADSI"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "lua55-lualdap-1.3.0-5.3.aarch64.rpm"
RPM_HASH = "17c407e250ddf58fc6958490609b421f7e3822c947755680cca7741366c1fe88f6ecb8ae0d5505a9952e8d5870696296f46ee61d3d661cf10a331efb0e69d3f4"

RPROVIDES:${PN} += "lua55-lualdap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
lua55"

inherit rpm
