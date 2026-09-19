SUMMARY = "Convenient dbus api for lua"
DESCRIPTION = "lua-dbus is a convenient lua api for dbus"
LICENSE = "MIT"

PV = "0.0+git20170818.8fe38d0"

RPM_NAME = "lua55-lua-dbus-0.0+git20170818.8fe38d0-7.2.aarch64.rpm"
RPM_HASH = "5cbbf6101a83d20a18e14b9f95cb64f1c47ac1e4b202950b8cbee01a225542618854646f4ea7d5891ef251a70c5f36b7f722ed0eb6f8794dbaed7a83cc270723"

RPROVIDES:${PN} += "lua55-lua-dbus"

RDEPENDS:${PN} += "lua55 \
lua55-ldbus"

inherit rpm
