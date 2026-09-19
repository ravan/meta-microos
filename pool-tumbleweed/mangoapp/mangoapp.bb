SUMMARY = "A transparent background application with a built-in MangoHud for gamescope"
DESCRIPTION = "A transparent background OpenGL application with a built-in MangoHud designed to be run inside a gamescope instance."
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "mangoapp-0.8.4-1.3.aarch64.rpm"
RPM_HASH = "9d75141f88579ff215030e2162c6eaeee366c9ea2351b8486f09ef686968c9e5817ec26051392de12169480e360f00157410fe569b81bb8b41f42d3660a50d63"

RPROVIDES:${PN} += "mangoapp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
libglfw.so.3 \
libm.so.6 \
libspdlog.so.1.17 \
libwayland-client.so.0 \
libxkbcommon.so.0 \
mangohud"

inherit rpm
