SUMMARY = "MPRIS api for lua"
DESCRIPTION = "MPRIS api for lua"
LICENSE = "MIT"

PV = "0.0+git20191025.2b12542"

RPM_NAME = "lua53-lua-mpris-0.0+git20191025.2b12542-6.2.aarch64.rpm"
RPM_HASH = "fd6d17c062348aac1547a17b8b6da3a163c11b06fe6a2258cd8522520bf911758a04d696c0f3c78098f1a8aeffdea974fa11d303ea0cdd94bf047fce8fb68117"

RPROVIDES:${PN} += "lua53-lua-mpris"

RDEPENDS:${PN} += "lua53 \
lua53-lua-dbus"

inherit rpm
