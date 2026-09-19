SUMMARY = "Convenient dbus api for lua"
DESCRIPTION = "lua-dbus is a convenient lua api for dbus"
LICENSE = "MIT"

PV = "0.0+git20170818.8fe38d0"

RPM_NAME = "lua54-lua-dbus-0.0+git20170818.8fe38d0-7.2.aarch64.rpm"
RPM_HASH = "ab9e8caf0983a89e5fa89bed30bf94c988e98d3127de2a6e2bc0fbb7fa8d2816b2b92e6760f2310c6bc1e220bb8e2cc9314d48fd0069a0680fb81534f9a7ab58"

RPROVIDES:${PN} += "lua-lua-dbus \
lua54-lua-dbus"

RDEPENDS:${PN} += "lua54 \
lua54-ldbus"

inherit rpm
