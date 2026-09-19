SUMMARY = "AMDGPU video driver for the Xorg X server"
DESCRIPTION = "amdgpu is an Xorg driver for AMD video cards. \
 \
Its autodetects whether your hardware has a CI or newer AMD Graphics Card"
LICENSE = "MIT"

PV = "25.0.0"

RPM_NAME = "xf86-video-amdgpu-25.0.0-1.5.aarch64.rpm"
RPM_HASH = "5c31bbb94ddde7f668e3779c86032c9cd7c1965da350c527acd5ea56665272759f761dc242e71b918401d0122192b714df9c22ed543958ea7feba6a93878f26c"

RPROVIDES:${PN} += "xf86-video-amdgpu"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm-amdgpu.so.1 \
libdrm.so.2 \
libgbm.so.1 \
libudev.so.1"

inherit rpm
