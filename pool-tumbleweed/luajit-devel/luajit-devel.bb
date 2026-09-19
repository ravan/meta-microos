SUMMARY = "Devel files for luajit"
DESCRIPTION = "Devel files for luajit package."
LICENSE = "MIT"

PV = "2.1.20250826"

RPM_NAME = "luajit-devel-2.1.20250826-3.3.aarch64.rpm"
RPM_HASH = "624b25b00447e47d84802fd4cdf865ac841f7aeca545de79a67f7455c1d39d323d2fc337ebb0932c93d67f41c6e90960a6323f96561dd95fdcf9003e94bc8576"

RPROVIDES:${PN} += "Lua-devel \
libluajit-devel \
lua-devel \
luajit-devel \
moonjit-devel \
pkgconfig-lua \
pkgconfig-luajit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libluajit-5-1-2 \
lua-macros \
luajit"

inherit rpm
