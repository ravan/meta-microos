SUMMARY = "EGL-based demos"
DESCRIPTION = "This package contains some common EGL-based demos."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "Mesa-demo-egl-9.0.0-7.5.aarch64.rpm"
RPM_HASH = "ad338c81638f26a9f8d4d24d2328fc431262492456b5ddef20ad29e7da1acfaf381979fb22568afd807e1b9d21dd9c78ed3790fce4f3c305786d41472bae476b"

RPROVIDES:${PN} += "Mesa-demo-/usr/lib64/mesa-demos/egl/opengl/eglgears-x11 \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengl/eglinfo \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengl/egltri-x11 \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengl/peglgears \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengl/xeglgears \
Mesa-demo-/usr/lib64/mesa-demos/egl/opengl/xeglthreads \
Mesa-demo-egl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libdecor-0.so.0 \
libm.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0"

inherit rpm
