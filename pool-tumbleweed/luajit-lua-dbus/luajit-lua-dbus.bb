SUMMARY = "Convenient dbus api for lua"
DESCRIPTION = "lua-dbus is a convenient lua api for dbus"
LICENSE = "MIT"

PV = "0.0+git20170818.8fe38d0"

RPM_NAME = "luajit-lua-dbus-0.0+git20170818.8fe38d0-7.2.aarch64.rpm"
RPM_HASH = "592464034a88e2582369d129b30a851650d677a1e8dd1816d0b588ac0516dba14963ffe76e5580d61fbf67abfd5169b27fdee3da9510f7613c7fa2b3f8bc12e7"

RPROVIDES:${PN} += "luajit-lua-dbus"

RDEPENDS:${PN} += "luajit \
luajit-ldbus"

inherit rpm
