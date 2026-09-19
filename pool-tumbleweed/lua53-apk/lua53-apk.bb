SUMMARY = "Lua module for apk-tools"
DESCRIPTION = "Lua module for apk-tools."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8"

RPM_NAME = "lua53-apk-3.0.8-1.1.aarch64.rpm"
RPM_HASH = "b6dce481d38920f2684b133338247ef5ac4414849e9b651bc8187b89b689cfd4908640dd3ee40bea4098c6ba5817ef328aef85e8a9ee4420bd8734a0473c9b9f"

RPROVIDES:${PN} += "lua53-apk"

RDEPENDS:${PN} += "apk-tools \
ld-linux-aarch64.so.1 \
libapk.so.3.0.0 \
libc.so.6 \
liblua5.3.so.5 \
lua53"

inherit rpm
