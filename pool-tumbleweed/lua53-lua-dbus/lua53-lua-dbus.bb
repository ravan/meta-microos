SUMMARY = "Convenient dbus api for lua"
DESCRIPTION = "lua-dbus is a convenient lua api for dbus"
LICENSE = "MIT"

PV = "0.0+git20170818.8fe38d0"

RPM_NAME = "lua53-lua-dbus-0.0+git20170818.8fe38d0-7.2.aarch64.rpm"
RPM_HASH = "0193a97a2c3531bd8715301eeae05339d84a58f7b5cec4e7a97a28e8d717bcf580ed6158099c0203e2cdafaf7f785fc568f0133052773b3852fe65b9fee4b293"

RPROVIDES:${PN} += "lua53-lua-dbus"

RDEPENDS:${PN} += "lua53 \
lua53-ldbus"

inherit rpm
