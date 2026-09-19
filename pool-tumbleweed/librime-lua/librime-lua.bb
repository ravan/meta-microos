SUMMARY = "Lua plugin for librime"
DESCRIPTION = "Lua plugin for librime."
LICENSE = "LicenseRef-SUSE-Permissive"

PV = "0.0.0+git20250809.68f9c36"

RPM_NAME = "librime-lua-0.0.0+git20250809.68f9c36-3.1.aarch64.rpm"
RPM_HASH = "116277f9c7f9f9c40b84a5ec0d0ff5d7e446a37d8b18085e4cf0dfba28c6549f66f5a2e6880c046e3d373cf5769773cf5e6f1d57c24757af57f619e3ce1a9f94"

RPROVIDES:${PN} += "librime-lua \
librime-lua.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglog.so.2 \
liblua5.4.so.5 \
libopencc.so.1.2 \
librime.so.1 \
libstdc++.so.6"

inherit rpm
