SUMMARY = "MPRIS api for lua"
DESCRIPTION = "MPRIS api for lua"
LICENSE = "MIT"

PV = "0.0+git20191025.2b12542"

RPM_NAME = "luajit-lua-mpris-0.0+git20191025.2b12542-6.2.aarch64.rpm"
RPM_HASH = "662507950d73d7e31739e7a3579c7b6b55453863248644331b71ff1935404e8d4899306c3da86bd89efe276e8110ff40826ca1c675549749aaa4fb5353eb80ae"

RPROVIDES:${PN} += "luajit-lua-mpris"

RDEPENDS:${PN} += "luajit \
luajit-lua-dbus"

inherit rpm
