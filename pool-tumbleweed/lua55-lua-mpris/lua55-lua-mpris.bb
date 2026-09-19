SUMMARY = "MPRIS api for lua"
DESCRIPTION = "MPRIS api for lua"
LICENSE = "MIT"

PV = "0.0+git20191025.2b12542"

RPM_NAME = "lua55-lua-mpris-0.0+git20191025.2b12542-6.2.aarch64.rpm"
RPM_HASH = "6d2bc47e82a0361701b64f0f953988184ed473db673705007eeb60344585b6a96ee7829397bff35c211b5806d12e2421d86845e3c66b7ed155d3810371edb7ce"

RPROVIDES:${PN} += "lua55-lua-mpris"

RDEPENDS:${PN} += "lua55 \
lua55-lua-dbus"

inherit rpm
