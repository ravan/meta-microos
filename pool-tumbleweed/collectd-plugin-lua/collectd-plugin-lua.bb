SUMMARY = "Lua API for collectd"
DESCRIPTION = "Optional collectd Lua API in order to write collectd plugins in Lua."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-lua-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "9ea908e252c4ca3b89873ee9b2b0a72182e8dfb1a9b88fd7b2ea9b9550053d877b349ef2cdc0b5ad5156b4803553e54f4460076291079137d59f49dfcfb5ba49"

RPROVIDES:${PN} += "collectd-plugin-lua"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
lua"

inherit rpm
