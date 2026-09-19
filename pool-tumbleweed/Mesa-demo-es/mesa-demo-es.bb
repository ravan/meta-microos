SUMMARY = "GLES-based demos"
DESCRIPTION = "This package contains some common GLES-based demos."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-es-9.0.0-7.5.aarch64.rpm"
RPM_HASH = "24e19617b294bc2245a21ae76cc111c9378a7233fc2b12ced08b94263ea5ebe9f124013c44b0b64b87732412a2e56f2253294675cab83ee75fb22ebfe3e5dcd0"

RPROVIDES:${PN} += "Mesa-demo-/usr/lib64/mesa-demos/egl/opengles2/es2-info \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengles2/es2gears-x11 \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengles2/es2tri \
Mesa-demo-es"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libX11.so.6 \
libc.so.6 \
libdecor-0.so.0 \
libm.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0"

inherit rpm
